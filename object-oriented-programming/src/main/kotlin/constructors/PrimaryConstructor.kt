package constructors

/**
 *  생성자
 *
 * 주생성자와 부생성자로 나눌 수 있다.
 *      주 생성자 -> 블록 밖에 존재
 *      부 생성자 -> 블록 안에 존재
 * 인터페이스와 클래스의 구현 모두 콜론(:) 을 사용하는데 이 둘을 구분할 때는 생성자를 호출하냐 하지 않냐로 구분가능
 *
 * 자바에서는 생성자가 많아질 수 있는데 코틀린에서는 default param 덕분에 이럴 일이 적다
 */
// 일반적인 클래스 선언
open class User(val nickname: String) // 주 생성자

// 위의 일반적 선언을 풀어서 사용
class Student constructor(name: String) {
    private val name: String

    init { // 초기화 블록
        this.name = name
    }
}

// 기반 클래스 생성자 호출
class Teacher(major: String): User("tc[$major]")

// 외부에서 생성 불가 (하지만 코틀린에는 더 멋진 방법이 존재)
class Parent private constructor(gender: String)

// 컴파일러가 자동으로 noArgs 생성자를 만듦
class Professor