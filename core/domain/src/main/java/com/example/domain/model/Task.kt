package com.example.domain.model

import org.jetbrains.annotations.Async
import java.time.Instant

enum class TaskKind { ONE_OFF, RECURRING, SOMEDAY }

data class AlarmConfig(
    val durationSec: Int,
    val soundId: String = DEFAULT_SOUND_ID,
    val vibrate: Boolean = true,
) {
    companion object {
        val ALLOWED_DURATIONS: Set<Int> = setOf(10, 30, 60)
        const val DEFAULT_SOUND_ID = "default"
    }
}

data class Task(
    val id: TaskId,
    val title: String,
    val description: String? = null,
    val kind: TaskKind,
    val schedule: Async.Schedule? = null,
    //задача без будильника по умолчанию
    val alarm: AlarmConfig? = null,
    val tagIds: Set<TagId> = emptySet(),
    val projectId: ProjectId? = null,
    val colorHex: String? = null,
    val createdAt: Instant,
    val updatedAt: Instant,
    val deletedAt: Instant? = null,
) {
    val isImportant: Boolean get() = alarm != null
    val isDeleted: Boolean get() = deletedAt != null
}
