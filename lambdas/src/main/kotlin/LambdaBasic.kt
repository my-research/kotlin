/**
 * 람다: 다른 함수에 넘길 수 있는 코드 조각
 *
 * 코틀린에서 함수는 first-class citizen 이다
 *
 * 문법: { x: Int, y: Int -> x + y }
 *      -> 항상 중괄호 사이에 위치함
 *      -> 인자 사이에 소괄호가 없음
 */
fun main() {
    val users = listOf(
        User("james", 26),
        User("gini", 27),
        User("lilly", 28)
    )

    println(getOldest1(users))
    println(getOldest2(users))
    println(getOldest3(users))
    println(getOldest4(users))
}

data class User(val name: String, val age: Int)

fun getOldest1(users: List<User>): User {
    return users.maxBy({u -> u.age})
}

fun getOldest2(users: List<User>): User {
    val selector = { user: User -> user.age } // 변수로 뺄 경우 문맥이 없어서 타입 추론이 불가능하다
    // 그래서 람다의 인자의 타입을 명시해줘야 함
    return users.maxBy(selector)
}

fun getOldest3(users: List<User>): User {
    // return users.maxBy() { user -> user.age }
    // 람다에서는 함수 호출시 인자가 유일하고 람다라면 소괄호를 없앨 수 있음, 최종적으로는 이렇게 사용 가능
    return users.maxBy { user -> user.age }
}

fun getOldest4(users: List<User>): User {
    // 타입 파라미터가 하나고 컴파일러가 추론 가능한 경우에는 it 을 사용할 수 있다
    return users.maxBy { it.age }
}
