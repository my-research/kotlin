package com.github.dhslrl321

import java.time.LocalDateTime

class Todo(
    val id: Long,
    val name: String,
    var status: TodoStatus,
    val createdAt: LocalDateTime
) {
    companion object Factory {
        fun newInstance(name: String): Todo {
            return Todo(
                id = genLongId(),
                name = name,
                status = TodoStatus.READY,
                createdAt = LocalDateTime.now()
            )
        }
    }
}