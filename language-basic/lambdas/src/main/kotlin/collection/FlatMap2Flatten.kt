package collection

/**
 *
 * 중첩된 컬렉션 안의 원소 처리
 *
 * flatMap
 * flatten
 */
fun main() {
    val strings = listOf("abc", "def")
    // 1. map
    // [["a", "b", "c"], ["d", "d", "f]]
    // 2. flatten
    // ["a", "b", "c", "d", "d", "f]
    println(strings.flatMap { it.toList() })

    // 아래의 두 과정을 거치는 것이다
    val mapped = strings.map { it.toList() }
    val flatten = mapped.flatten()

    println(flatten)
}