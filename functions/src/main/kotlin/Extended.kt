/**
 * 확장 함수: 특정 클래스 밖에 선언된 함수를 클래스의 멤버 메서드인 것 처럼 호출할 수 있도록 하는 것
 * private 이나 protected 인 것들은 호출이 불가능
 *
 * 확장 프로퍼티: 기존 클래스 객체에 대한 프로퍼티 형식으로 구문을 사용할 수 있는 API 를 추가 가능
 * but 상태를 저장하는 방법이 없어서 실제로 객체 프로퍼티처럼 상태를 저장하지는 않음
 */
fun main() {
    println("hi".lengthWith("hello world"))
    println("hi".lastChar)
    println(listOf("A", "B", "C").extendedJoinToString())
}
// 확장 함수
// String: 수신 객체 타입
// this: 수신 객체 (생략 가능)
fun String.lengthWith(s: String): Int = length + s.length

val String.lastChar: Char
    get() = get(length - 1)