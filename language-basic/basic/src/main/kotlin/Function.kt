/**
 * 함수 기본
 *
 * 자바와 다르게 최상단에 함수 정의가 가능함
 */

fun main() { // main 함수, 코틀린의 진입점
    println("hello world")

    val result = plus(10, 20)
    println(result)

    printPlus(10, 20)
    println("10, 20 중 더 큰 수는 : ${max(10, 20)}")
}

fun plus(a: Int, b: Int): Int { // 반환 타입이 있는 함수
    return a + b
}

fun printPlus(a: Int, b: Int) { // 반환 타입이 없는 함수
    println(a + b)
}

/**
 * 식이 본문인 함수
 * fun max(a: Int, b: Int): Int = if (a > b) a else b 처럼 반환 타입을 직접 명시할 수 있지만 안해도 타입 추론이 된다
 * 컴파일러가 본문을 분석하기 때문
 */
fun max(a: Int, b: Int) = if (a > b) a else b
