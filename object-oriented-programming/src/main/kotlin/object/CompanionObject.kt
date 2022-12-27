package `object`

/**
 * companion object: 특정 클래스에 추가적인 기능을 제공해주는 special object
 *
 * 클래스에 정의된 일반 객체임
 *
 * 코틀린에서는 static factory method 보통 companion object 에 의해서 구현된다
 *      -> 코틀린은 static 이 언어적 차원에서 제공하지 않는다. 대신에 최상위 함수나 프로퍼티를 제공한다
 *      -> 최상위 프로퍼티는 클래스의 가시성 수준에 따라서 클래스 내부에 접근할 수 없는 필드가 있기에 제한적이다
 *          -> 대표적으로 최상위 함수로는 static factory 를 만들 수 없다
 *
 * 동반객체는 자신을 둘러싼 클래스의 모든 멤버와 생성자, 함수에 접근할 수 있다
 * 동반객체를 이용해서
 *  -> static 메서드 처럼 구현할 수 있다.
 *  -> 팩토리 메서드를 구현할 수 있다
 * 동반객체는 클래스당 하나만 만들 수 있음
 */

fun main() {
    // 동반 객체를 호출할 때는 클래스 참조를 통해서 한다
    val created = User.newSubscribingUser("dhslrl321@gmail.com")
    // 동반 객체의 이름을 통해서 호출할 수도 있음
    val created2 = User.Factory.newSubscribingUser("dhslrl321@gmail.com")

    println("userJoined: ${created.name} ${created.address}")

    JsonDocument.parse()
}

class User private constructor(
    val name: String,
    val address: String,
) {
    companion object Factory {
        // only single instance
        fun newSubscribingUser(email: String): User {
            val s = email.split("@")
            return User(name = s[0], address = s[1])
        }
    }
}


/**
 * 동반 객체는 인터페이스를 구현할 수도 있다
 */
interface Parsable<T> {
    fun parse(t: T): String
}

class TextDocument private constructor(
    val name: String,
) {
    companion object Parser: Parsable<TextDocument> {
        override fun parse(t: TextDocument): String {
            TODO("Not yet implemented")
        }
    }
}

/**
 * companion object 에 대해서 확장 함수를 추가할 수도 있다
 */

class JsonDocument {
    companion object {} // 비어있는 companion object 을 선언해준다
}

// 확장 함수에서 동반 객체를 호출할 때는 Companion 이라는 이름으로 참조가 가능
// 만약 다른 이름이 주어져있다면 그 이름으로만 접근 가능
fun JsonDocument.Companion.parse() = println("parsed")
