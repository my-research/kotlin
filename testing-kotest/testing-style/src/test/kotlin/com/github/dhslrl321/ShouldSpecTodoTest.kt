package com.github.dhslrl321

import com.github.dhslrl321.todos.Todo
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

/**
 * ShouldSpec
 *
 * ExpectSpec 도 동일하다
 */
class ShouldSpecTodoTest : ShouldSpec({
    should("todo 객체가 생성되면 상태는 READY") {
        val actual = Todo.newInstance("글쓰기")

        actual.status shouldBe TodoStatus.READY
    }

    context("todo 객체가 생성되면") {
        val actual = Todo.newInstance("글쓰기")

        should("todo 의 상태는") {
            actual.status shouldBe TodoStatus.READY
        }

        should("생성 시점은") {
            actual.createdAt shouldNotBe null
        }
    }
})