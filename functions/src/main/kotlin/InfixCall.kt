/**
 * 중위 호출: 인자가 하나뿐인 일반 메서드나 인자가 하나뿐인 확장 함수에서 메서드 호출을 공백으로 하는 방법
 *
 * infix 키워드
 */

fun main() {

    mapOf(1 to "One", Pair(2, "Two"))

    println("hello" joinTo "world")
}

infix fun String.joinTo(s: String): String = this.plus(" $s")