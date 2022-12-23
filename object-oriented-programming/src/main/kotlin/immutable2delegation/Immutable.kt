package immutable2delegation

/**
 * immutable copy: 객체를 복사하면서 일부 프로퍼티의 값만 변경할 때 사용
 * 불변성을 만족시키기 위해서 사용하는 코틀린의 기법 중 하나 (* 롬복의 with 와 비슷한놈)
 *
 * 불변성 장점:
 *      -> 프로그램이 쉽게 추론 가능하다
 *      -> 멀티 스레딩 환경에서 데이터를 동기화해야 하는 노력이 줄어든다
 */

fun main() {
    val user = User("james", 26)
    println(user)

    val copied = user.copy(age = 20);
    println(copied);
}

data class User(val name: String, val age: Int)