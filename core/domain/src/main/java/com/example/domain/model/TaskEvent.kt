package com.example.domain.model

import java.time.Instant
import java.time.LocalDate

//MISSED по умолчанию
enum class EventStatus{PENDING, DONE, SKIPPED, MISSED}

data class TaskEvent(
    val id: EventId,
    val taskId: TaskId,
    val occurrenceDate: LocalDate,
    val scheduledAt: Instant,
    val status: EventStatus = EventStatus.PENDING,
    val snoozedUntil: Instant? = null,
    val snoozeCount: Int = 0,
    val completedAt: Instant? = null,
    val updatedAt: Instant,
) {
    val effectiveTime: Instant get() = snoozedUntil ?: scheduledAt

    companion object {
        const val MAX_SNOOZES = 3
    }
}
