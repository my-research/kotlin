package abstrctproperty

/**
 * 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다
 * 추상 프로퍼티가 존재한다는 것은 구현체가 해당 값을 조회하거나 저장할 수 있도록 방법을 제공해야한다는 것을 명시
 *
 * 즉, 상태의 관리가 필요하다는 것을 알려줌
 */

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = nickname.plus("User") // 호출될 때 계속
}

class FacebookUser(accountId: String) : User {
    override val nickname = getFacebookName(accountId) // 초기화 될 때, 한 번만
}

fun getFacebookName(accountId: String):String {
    println("linking... with facebook $accountId")
    return "id"
}