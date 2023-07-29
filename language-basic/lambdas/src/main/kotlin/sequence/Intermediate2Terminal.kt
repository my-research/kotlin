package sequence

/**
 * 중간 연산 (intermediate operation)
 *      -> 연산의 결과로 다른 시퀀스를 반환
 *      -> 최초 시퀀스의 원소를 변환하는 방법을 앎
 *      -> 계산이 항상 지연 (lazy) 됨
 *
 * 최종 연산 (terminal operation)
 *      -> 연산의 결과를 반환
 *      -> 최초 컬렉션에 대해 변환을 적용한 시퀀스로부터 일련의 계산을 수행해 얻을 수 있는 다른 컬렉션이나 결과
 */

fun main() {
    // 아무런 결과가 출력되지 않음, 연산의 결과가 필요할 때 비로소 출력함
    val sequence = listOf(1, 2, 3, 4).asSequence()
        .map { println("map $it"); it * it } // 지연됨
        .filter { println("filter $it"); it % 2 == 0 } // 지연됨

    sequence.toList() // 최종 연산, 계산됨
}

