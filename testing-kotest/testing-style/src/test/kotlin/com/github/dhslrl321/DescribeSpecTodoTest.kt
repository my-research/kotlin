package com.github.dhslrl321

import com.github.dhslrl321.fixture.Todo
import com.github.dhslrl321.fixture.TodoStatus
import com.github.dhslrl321.fixture.TransitionCommand
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

/**
 * DescribeSpec
 *
 * ruby 나 js 스타일의 describe/it 테스트케이스를 지원
 * - 하나 이상의 describe block 을 중첩할 수 있다
 */
class DescribeSpecTodoTest : DescribeSpec({
    describe("todo 가 생성되면") {
        val actual = Todo.newInstance("글쓰기")

        it("상태는") {
            actual.status shouldBe TodoStatus.READY
        }

        describe("상태가 TODO 로 전이되면") {
            val command = TransitionCommand("userA", TodoStatus.TODO)

            actual.transitTo(command);

            it("상태는 Todo 이다") {
                actual.status shouldBe TodoStatus.TODO
            }

            it("업데이터의 정보가 세팅된다") {
                actual.updater shouldBe "userA"
            }
        }
    }
})