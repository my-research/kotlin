fun main() {
    println(catching())
}

fun catching() = try { // try 도 역시 식이다
    10
} catch (e: java.lang.UnsupportedOperationException) {
    20
} finally {
    println("----finished----")
}

fun basicExceptionThrow() { // 함수가 던질 수 있는 예외를 명시하지 않아도 됨
    // 역시 예외 인스턴스를 만들 때도 new 없다
    throw UnsupportedOperationException("예외를 그냥 던져봄")
}