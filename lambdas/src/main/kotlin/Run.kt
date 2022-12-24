/**
 * run: 인자로 받은 람다를 실행해주는 라이브러리 함수
 */
fun main() {
    val lambda = { println(10) }

    run { lambda }
}