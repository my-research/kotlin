/**
 * run: 인자로 받은 람다를 실행해주는 라이브러리 함수
 */

fun doPrint() = println("hello")

fun main() {
    val lambda = { println(10) }

    run { lambda }
    run(::doPrint) // 멤버 참조 연산에는 소괄호가 들어가지 않는다
}