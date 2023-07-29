package com.github.dhslrl321.item01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

/**
 * 아이템 1. 가변성을 제한하라
 *
 * 가변성을 제한하면 프로그램이 더 예측하기 쉬워진다
 */
class Main : StringSpec({

  "읽기 전용 프로퍼티는 변경될 수 없다" {
    val a = 10
  }

  "만약 immutable list 를 변경하고싶다면 mutable 로 변경하라" {
    val immutableList = listOf(1, 2, 3)
    val mutableList = immutableList.toMutableList()
    mutableList.add(4)

    val actual = mutableList.toList()

    actual.size shouldBe 4
  }

  "data class 의 with 를 이용하면 불변 객체의 메서드 체인을 간소화할 수 있다" {
    val user = User("jang", 10)

    val actual = user.copy(name = "heo")

    actual.name shouldBe "heo"
    actual.age shouldBe 10
  }
})

data class User(
  val name: String,
  val age: Int
)
