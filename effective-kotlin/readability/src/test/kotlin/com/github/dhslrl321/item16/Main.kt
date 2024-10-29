package com.github.dhslrl321.item16

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

/**
 * item 16. 프로퍼티는 동작이 아니라 상태를 나타내야 한다
 *
 * kt 의 property 는 java 의 field 와 동일해 보이지만 전혀 다른 개념이다
 *
 * property 는 getter/setter 를 가질 수 있다
 */
class Main: StringSpec({
  "property 기본 사용" {
    val sut = Person()

    sut.name = "jang"

    sut.name shouldBe "JANG"
  }
})

class Person {
  var name: String? = null
    get() = field?.toUpperCase()
    set(value) {
      if (value.isNullOrBlank().not()) {
        field = value
      }
    }
}
