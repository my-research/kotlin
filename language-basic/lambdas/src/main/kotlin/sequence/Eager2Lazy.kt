package sequence

/**
 * @see Intermediate2Terminal.kt, 중간 연산과 최종 연산의 개념에서 사용됨
 *
 * eager evaluation:
 *      -> collection
 *      -> 모든 연산에 대해서 즉시 수행함, 즉 모두 최종 연산
 *      -> 연산이 컬렉션 단위로 수행됨
 *
 * lazy evaluation:
 *      -> collection
 *      -> 지금 하지 않아도 되는 연산에 대해서 뒤로 미룸, 즉 모두가 중간 (intermediate 연산)
 *      -> 최종 연산 (terminal operation) 을 만나면 미뤘던 연산을 실제로 수행함
 *      -> 연산이 시퀀스(지금은 컬렉션이라고 이해해도 됨)의 원소 하나 하나에 대해서 수행됨
 *      -> 그래서 일정 조건에 만족하면 이후 원소들은 연산을 하지 않을 수도 있음
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