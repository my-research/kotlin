package com.github.dhslrl321.item11

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

/**
 * item 11. 가독성을 목표로 설계하라
 */
class Main {

  @Test
  fun `필자가 생각하는 최악의 함수`() {
    val actual = "A" { "B" } and "C"

    actual shouldBe "ABC"
  }

  operator fun String.invoke(f: () -> String): String {
    return this + f()
  }

  infix fun String.and(s: String) = this + s
}
