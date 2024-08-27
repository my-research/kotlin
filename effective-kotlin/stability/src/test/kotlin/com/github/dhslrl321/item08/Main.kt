package com.github.dhslrl321.item08

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.lang.IllegalArgumentException
import kotlin.properties.Delegates

/**
 * item 08. 적절하게 null 을 처리하라
 *
 * null: lack of value (값이 부족함 || 값이 삭제되었음 || 값이 없었음)
 *
 * nullable field 처리방법 3가지
 *
 * 1. 안전호출(`?.`), smart cast, elvis 연산자를 통해 안전하게 처리
 * 2. 오류를 throw
 * 3. 함수를 리팩토링해서 nullable 한 타입이 나오지 않도록 변경
 *
 * 번외
 * - not null assertion !! 은 사용하지 말라
 * - 의미 없는 nullable 필드를 반환하지 말라, getOrNull 처럼 의미가 있다면 item 7 처럼 처리하라
 * - lateinit 과 notNull delegate 를 사용해야할 필요가 있다면 사용해도 좋다
 *
 */
class Main: StringSpec({
  "안전 호출 ?." {
    val a:String? = null

    a?.toInt() // 실행되지 않음
  }

  "(방어적 프로그래밍) elvis 연산을 이용해서 default 값 세팅 (return 할 수도 있음)" {
    val a: String? = null

    val actual = a ?: "10".toInt()

    actual shouldBe 10
  }

  "(공격적 프로그래밍) contract 를 이용해서 오류를 던져라" {
    shouldThrow<IllegalArgumentException> { require(false)  }
  }

  "(!!) assertion 은 제네릭 예외를 던져서 파악이 어렵다" {
    val a: String? = null

    a!!.length
  }

  "assertion(!!) 보다는 delegate 나 lateinit 을 사용해라" {
    // lateinit var a = "" lateinit 은 local variable 에서 못 씀
    val a: String by Delegates.notNull()

    println(a)
  }

})
