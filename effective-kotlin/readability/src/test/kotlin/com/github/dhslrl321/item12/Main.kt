package com.github.dhslrl321.item12

import io.kotest.core.spec.style.StringSpec

/**
 * item 12. 연산자 오버로드를 할 때는 의미에 맞게 사용하라
 *
 */
class Main: StringSpec({
  "1" {
    val sut = Person()

    println(sut)
  }
})

data class Person(
  val name: String = "jang"
) {
  companion object {
    operator fun invoke(): Person {
      return Person("A")
    }
  }
}
