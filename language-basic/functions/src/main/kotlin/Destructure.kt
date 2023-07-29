/**
 * 분해 구조 선언
 *
 */

fun main() {
    println((1 to "One").javaClass) // -> Pair

    val (key, value) = 1 to "One"
    println("$key and $value")

    val list = listOf("A", "B", "C")

    for ((index, item) in list.withIndex()) {
        println("index $index's item is $item")
    }
}