fun main() {
    val person = Person("jang", "hello world")

    person.name // 코틀린의 getter
    person.message = "greeting" // 코틀린의 setter
}

/**
 * name, message 를 프로퍼티라고 부름
 * 프로퍼티: 접근제어자 + 필드
 */
class Person(
    val name: String, // getter 만 존재
    var message: String, // getter & setter 존재
)

class Rectangle(
    val height: Int,
    val width: Int,
) {
    val isSquare: Boolean // 커스텀 접근자
        get() = height == width
}