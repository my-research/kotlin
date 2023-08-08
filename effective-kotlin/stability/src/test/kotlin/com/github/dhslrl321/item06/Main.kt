package com.github.dhslrl321.item06

import io.kotest.core.spec.style.StringSpec

/**
 * item06. 사용자 정의 오류보단 표준 오류를 사용하라
 *
 * 커스텀 오류보단 표준 오류에 대해서 개발자들이 많이 알고 있으므로 그를 지향하라
 */
class Main: StringSpec({
  "자주사용되는 예외들" {
    IllegalArgumentException()

    IllegalStateException()

    ConcurrentModificationException("동시 수정하려 할 때")

    IndexOutOfBoundsException()
  }
})
