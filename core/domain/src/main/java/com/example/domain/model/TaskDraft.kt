package com.example.domain.model

import org.jetbrains.annotations.Async

data class TaskDraft(
    val title: String,
    val kind: TaskKind,
    val schedule: Async.Schedule? = null,
    val description: String? = null,
    val alarm: AlarmConfig? = null,
    val tagIds: Set<TagId> = emptySet(),
    val projectId: ProjectId? = null,
    val colorHex: String? = null,
)

//событие дня
data class AgendaItem(
    val event: TaskEvent,
    val task: Task,
)