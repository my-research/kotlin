/**
 * 멤버 참조: :: 를 사용해서 프로퍼티나 메서드를 단 하나만 호출하는 함수 값을 만들어줌
 */
fun greeting() = println("hello")

fun main() {
    val getAge = Student::age

    val user = Student("jang", 25)
}

class Student(val name: String, val age: Int)
