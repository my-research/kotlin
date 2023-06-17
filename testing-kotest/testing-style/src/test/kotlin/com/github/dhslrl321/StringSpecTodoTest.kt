package com.github.dhslrl321

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class StringSpecTodoTest : StringSpec({
    "Todo 객체를 생성하면 상태는" {
        val actual = Todo.newInstance("글 쓰기")

        actual.id shouldNotBe null
        actual.createdAt shouldNotBe null
        actual.status shouldBe TodoStatus.READY
    }
})