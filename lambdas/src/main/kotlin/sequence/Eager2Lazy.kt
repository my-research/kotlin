package sequence

/**
 * eager evaluation:
 *      -> collection
 *      -> 모든 연산에 대해서 즉시 수행함, 즉 모두 최종 연산
 *
 * lazy evaluation:
 *      -> collection
 *      -> 지금 하지 않아도 되는 연산에 대해서 뒤로 미룸, 즉 모두가 중간 (intermediate 연산)
 *      -> 최종 연산 (terminal operation) 을 만나면 미뤘던 연산을 실제로 수행함
 *
 * 이게 가능한 이유는 연산 실행 시점이 달라서 가능함
 *      -> 중간 연산 (intermediate operation)
 *      -> 최종 연산 (terminal operation)s
 *
 *
 */

fun main() {
    lazyEvaluation()
    eagerEvaluation()
}

private fun eagerEvaluation() {
    val fruits = listOf("apple", "banana", "kiwi", "cherry")

    val found = fruits.filter {
        println("checking the length of $it")
        it.length > 5
    }
        .map {
            println("mapping to the length of $it")
            "${it.length}"
        }
        .first()

    println(found)
}

private fun lazyEvaluation() {
    val fruits = listOf("apple", "banana", "kiwi", "cherry")
    val found = fruits.asSequence()
        .filter {
            println("checking the length of $it")
            it.length > 4
        }
        .map {
            println("mapping to the length of $it")
            "$it's length ${it.length}"
        }
        .first() // 최종 연산 (terminal operation)

    println(found)
}