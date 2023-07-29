package com.github.dhslrl321.item05

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.mpp.log

/**
 * item 05. 예외를 활용해 코드에 제한을 걸어라
 *
 * 예외와 예외 검사 기능 (contract kotlin)
 */
class Main : StringSpec({

  "require() 은 argument 를 제한" {
    shouldThrow<IllegalArgumentException> { require(false) }

    shouldThrow<IllegalArgumentException> {
      require(false) { "a message" }
    }.message shouldBe "a message"
  }

  "check() 은 state 를 제한" {
    shouldThrow<IllegalStateException> { check(false) }
  }

  "한 번 require 나 check 로 true 가 되었다면 이후 자동으로 smart cast" {
    val actual = getString() // <- nullable

    // actual.length <- Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String? 라고 뜸
    requireNotNull(actual)

    actual.length shouldBe 3 // require 체크로 인해 자동 smart cast 됨
  }

  "nullability field 안전성을 위해 return/throw 혹은 elvis 를 많이 사용함" {
    val sut = Foo()

    shouldNotThrow<RuntimeException> { sut.foo(null) }

    shouldNotThrow<RuntimeException> { sut.bar(null) }

    shouldThrow<IllegalArgumentException> { sut.baz(null) }
  }
})

fun getString(): String? = "abc"

class Foo {
  fun foo(s: String?) {
    // elvis 를 이용한 return
    s ?: return

    log { "s.length ${s.length}" } // smart cast
  }

  fun bar(s: String?) {
    // run 을 이용한 return
    s ?: run {
      log { "argument is empty" }
      return
    }

    log { "s.length ${s.length}" } // smart cast
  }

  fun baz(s: String?) {
    // elvis 를 이용한 throw
    s ?: throw IllegalArgumentException("argument is empty")

    log { "s.length ${s.length}" } // smart cast
  }
}
