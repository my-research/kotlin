package com.github.dhslrl321.todos

import TodoStatus
import TransitionCommand
import com.github.dhslrl321.fixture.genLongId
import java.time.LocalDateTime

class Todo(
    val id: Long,
    val name: String,
    var status: TodoStatus,
    var updater: String,
    val createdAt: LocalDateTime
) {
    companion object Factory {
        fun newInstance(name: String): Todo {
            return Todo(
                id = genLongId(),
                name = name,
                status = TodoStatus.READY,
                updater = "",
                createdAt = LocalDateTime.now()
            )
        }
    }

    fun transitTo(command: TransitionCommand) {
        this.status = TodoStatus.TODO
        this.updater = command.updater
    }

    fun delete() {
        this.updater = ""
    }
}