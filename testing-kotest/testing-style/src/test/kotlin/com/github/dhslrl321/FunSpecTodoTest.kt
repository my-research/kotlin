package com.github.dhslrl321

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class FunSpecTodoTest : FunSpec({

    test("Todo 객체를 생성하면 상태는") {

        val actual = Todo.newInstance("글 쓰기")

        actual.id shouldNotBe null
        actual.createdAt shouldNotBe null
        actual.status shouldBe TodoStatus.READY
    }
})