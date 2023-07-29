/**
 * in 연산을 포함한 반복
 */

fun main() {
    println(recognize('c'))
    // 이건 "java" <= "kotlin" && "kotlin <= scala 와 같음
    println("Kotlin" in "Java" .. "Scala") // t
    println("Kotlin" in setOf("Java", "C#")) // f
    println("Kotlin" in listOf("Java", "C#")) // f
    println("Kotlin" !in listOf("Java", "C#")) // t
}

private fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "this is digit"
    in 'a'..'z' -> "this is letter"
    else -> "I don't know"
}