package com.github.dhslrl321

import TransitionCommand
import com.github.dhslrl321.todos.Todo
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

/**
 * BehaviorSpec
 *
 * BDD 타입의 테스트를 지원한다
 */
class BehaviorSpecTodoTest : BehaviorSpec({
    given("todo 가 생성되었고") {
        val actual = Todo.newInstance("글쓰기")

        When("command 를 통해 todo 의 상태를 변경하면") {
            val command = TransitionCommand("userA", TodoStatus.TODO)
            actual.transitTo(command)

            then("상태는") {
                actual.status shouldBe TodoStatus.TODO
            }

            then("업데이터는") {
                actual.updater shouldBe "userA"
            }
        }
    }
})