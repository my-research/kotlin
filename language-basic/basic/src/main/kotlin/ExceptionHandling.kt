/**
 * 코틀린의 예외처리
 */

fun main() {
    println(catching())
}

fun catching() = try { // try 도 역시 식이다
    println("success")
    10 // 식의 가장 마지막 라인은 return
} catch (e: java.lang.UnsupportedOperationException) {
    println("failed")
    20
} finally {
    println("----finished----")
}

fun basicExceptionThrow() { // 함수가 던질 수 있는 예외를 명시하지 않아도 됨
    // 역시 예외 인스턴스를 만들 때도 new 없다
    throw UnsupportedOperationException("예외를 그냥 던져봄")
}