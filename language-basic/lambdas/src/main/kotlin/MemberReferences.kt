/**
 * 멤버 참조: `::` 를 사용해서 프로퍼티나 메서드를 단 하나만 호출하는 함수 값을 만들어줌
 *
 * 멤버 참조에는 소괄호를 붙이지 않는다
 */
fun greeting() = println("hello")

fun main() {
    val getAge = Student::age

    val user = Student("jang", 25)

    run(::greeting) // 최상위 프로퍼티의 함수를 람다로 실행 (참조)
}

class Student(val name: String, val age: Int)
