package com.github.dhslrl321

import com.github.dhslrl321.todos.Todo
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

/**
 * WordSpec
 *
 * 문자 혹은 문장으로 설명하는 테스트 케이스를 작성할 수 있다
 *
 * FreeSpec 도 비슷하다
 */
class WordSpecTodoTest : WordSpec({
    "todo 가 생성되고 delete() 가 호출되면" When {
        val actual = Todo.newInstance("글쓰기")
        actual.delete()
        "개인정보보호를 위하여 유저의 정보가 삭제되어야 한다" should {
            actual.updater shouldBe ""
        }

        "하지만 나머지 데이터는 남아있어도 문제가 되지 않는다" should {
            "상태도 그대로 존재해야한다" {
                actual.status shouldBe TodoStatus.READY
            }
            "name 도 역시 존재한다" {
                actual.name shouldBe "글쓰기"
            }
        }
    }
})