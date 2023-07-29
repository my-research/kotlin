package com.github.dhslrl321

import com.github.dhslrl321.todos.Todo
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

/**
 * FunSpec
 *
 * test() 함수를 호출해서 테스트를 실행시키는 것을 의미한다
 * 가장 일반적으로 사용되는 테스트 style 이다
 */
class FunSpecTodoTest : FunSpec({

    test("Todo 객체를 생성하면 상태는") {

        val actual = Todo.newInstance("글쓰기")

        actual.status shouldBe TodoStatus.READY
    }

    xtest("테스트를 실행되지 않게 할 수 있다.") {
        "A" shouldBe "A"
    }
})
