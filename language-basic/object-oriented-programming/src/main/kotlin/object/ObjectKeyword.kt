package `object`

import java.time.ZonedDateTime

/**
 * object: singleton object 를 생성할 때 사용됨
 *
 * 코틀린에서는 이를 '객체 선언' 이라고 부름
 *      -> 객체 선언: 클래스 선언 + 단일 인스턴스 선언
 *
 * 객체 선언은 생성자를 만들 수 없다
 */
fun main() {
    println(IdGenerator.gen()) // 생성자 호출 없이 인스턴스 메서드 호출이 가능하다

    val instance = IdGenerator // 역시 인스턴스 참조를 변수로 담을 수도 있다

    // 인스턴스가 동일하다
    println(instance.hashCode())
    println(IdGenerator.hashCode())
}

object IdGenerator {
    fun gen(): Long = ZonedDateTime.now().toEpochSecond()
}