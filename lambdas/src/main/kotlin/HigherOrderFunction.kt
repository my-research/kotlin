/**
 * 고차 함수: 하나 이상의 함수를 인자로 받거나 실행 결과로 반환하는 함수
 *      함수형 프로그래밍에서 중요한 역할을 수행하는 기능
 *      고차 함수를 통한 추상화 패턴들을 많이 볼 수 있다
 */
fun main() {
    val result = higherOrder({x -> x * x}, 3)
}

// 고차 함수
fun higherOrder(f: (Int) -> Int, x: Int): Int {
    return (f(x))
}

// 단순 함수
fun square(x: Int): Int {
    return x * x
}