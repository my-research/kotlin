package backingfield

/**
 * backing field: 클래스의 property 값을 저장하기 위해 존재하는 필드
 *      프로퍼티를 custom getter 나 setter 로 정의할 때
 *      코틀린 컴파일러가 자동으로 만들어줌
 *
 * private 접근자로 getter 나 setter 에서만 호출된다
 */

fun main() {
    val user = User()

    println(user.name)
    user.name = "jang"
    println(user.name)
}

class User {
    var name: String = ""
        get() {
            println("getter works")
            return field
        }
        set(value) {
            println("setter works")
            field = value
        }
}