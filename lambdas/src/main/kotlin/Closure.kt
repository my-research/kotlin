/**
 * closure: context 내의 변수를 참조하는 함수로 해당 문맥이 끝나도 참조를 유지하는 함수
 */

fun main() {
    var count = 0

    // this is closure
    val incrementCounter: () -> Unit = { count++ }

    println(count)
    incrementCounter()
    println(count)
    incrementCounter()
    println(count)
}