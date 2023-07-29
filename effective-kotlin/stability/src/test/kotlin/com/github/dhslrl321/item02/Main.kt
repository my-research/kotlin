package com.github.dhslrl321.item02

import io.kotest.core.spec.style.StringSpec

/**
 * 아이템 2. 변수의 스코프를 최소화하라
 *
 */
class Main: StringSpec({
  "for 문에서도 변수의 스코프를 최소화할 수 있다" {
    val list = listOf(11, 22, 33)

    // i 와 data 를 스코프 안에서만, 구조분해 할당이 도움될 수 있음
    for ((i, data) in list.withIndex()) {
      println("i = $i, data = $data")
    }
  }
})
