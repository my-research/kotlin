package sequence

/**
 * sequence: iterable collection
 *      -> 함수형 프로그래밍에서 메모리 최적화에 중요한 개념
 *      -> collection 과 비교되곤 함
 *
 * 메모리에 모든 데이터를 담는 collection 과 달리 sequence 는 사용될 원소만 메모리에 로드
 * 대용량 처리에 유리함
 *
 * collection 을 사용한다면 함수의 결과를 즉시 생성 (eager evaluation)
 * sequence 를 사용한다면 함수의 결과를 필요할 때 생성 (lazy evaluation)
 *
 * sequence 연산은 원소를 차례로 이터레이션해야 한다면 시퀀스를 직접 사용해도 무방
 *      -> 하지만 원소에 직접 접근하는 등의 다른 API 를 사용해야 한다면 Collection 을 사용해야함
 */

fun main() {
    val collection = listOf(1, 2, 3, 4, 5)
    val sequence = collection.asSequence() // asSequence() 를 통해서 collection 을 sequence 로 만듦

    println(sequence.toList()) // 최종 연산 (terminal operation) 으로 collection 으로 만들어줘야 함

    val filtered = sequence.filter { it > 3 } // collection 연산이 적용 가능
    println(filtered)
}