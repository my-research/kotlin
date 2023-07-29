/**
 * 중위 호출: 인자가 하나뿐인 일반 메서드나 인자가 하나뿐인 확장 함수에서 메서드 호출을 공백으로 하는 방법
 *
 * 대표적으로는 to 가 중위 호출
 * to 는 Generic 으로 모든 객체에 포함된 함수
 * infix 키워드
 */

fun main() {

    1 to "One" // Pair(1, "One")
    "One" to 1 // Pair("One", 1)

    mapOf(1 to "One", Pair(2, "Two"))

    println("hello" joinTo "world")
}

infix fun String.joinTo(s: String): String = this.plus(" $s")