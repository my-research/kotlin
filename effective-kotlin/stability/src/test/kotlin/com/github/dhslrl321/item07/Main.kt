package com.github.dhslrl321.item07

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


/**
 * item 07. 결과 부족이 발생했을 떈 null 과 Failure 를 사용하라
 *
 * 예상되는 오류를 표현할 때 예외를 던지는것 보단 null 과 Failure 를 이용하는 편이 낫다
 * 예외는 정말 예측하지 못한 예외 상황인 것이다
 */
class Main : StringSpec({

  val sut = { value: Int ->
    if (value == 1) Result.success("correct")
    else Result.failure(NoSuchElementException())
  }

  "Result 는 sealed class 라서 when 구문을 사용할 수 있다" {
    val result = sut(10)

    result.isFailure shouldBe true
  }
})
