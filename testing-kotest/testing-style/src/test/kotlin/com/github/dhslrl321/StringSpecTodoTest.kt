package com.github.dhslrl321

import com.github.dhslrl321.todos.Todo
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

/**
 * spring spec
 *
 * 테스트 코드의 크기를 줄여줌
 */
class StringSpecTodoTest : StringSpec({
    "com.github.dhslrl321.todos.Todo 객체를 생성하면 상태는" {
        val actual = Todo.newInstance("글쓰기")

        actual.status shouldBe TodoStatus.READY
    }

    "com.github.dhslrl321.todos.Todo 객체를 생성하면 상태는(disabled)".config(enabled = false) {
        val actual = Todo.newInstance("책읽기")

        actual.status shouldBe TodoStatus.READY
    }
})