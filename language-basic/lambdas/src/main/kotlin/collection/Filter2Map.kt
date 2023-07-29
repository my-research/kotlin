package collection

/**
 * filter : collection 을 iteration 하면서 주어진 람다에 각 원소를 넘겨 해당 람다가 true 를 반환하는 원소만 collect
 *      -> 결과는 주어진 술어 (predicate) 를 만족하는 원소로만 이루어진 새로운 컬렉션
 *
 * map : collection 의 iteration 하면서 람다에 적용한 결과를 모아서 새 컬렉션을 만듦
 */
fun main() {
    val users = listOf(
        User("jang", 27),
        User("heo", 28),
        User("park", 28),
        User("song", 29),
        User("kim", 29))

    // predicate(it.age > 28) 에 만족하지 않는 원소를 collection 에서 제거한 컬렉션을 반환
    // 원소 자체를 변환하지 않음
    val filtered = users.filter { it.age > 28 }

    println(filtered)

    // 값을 변환함
    val userNames = users.map { it.name }
    println(userNames)

    // map 자료구조에도 적용할 수 있음
    val userMap = mapOf(
        1 to User("jang", 27),
        2 to User("heo", 28),
        3 to User("park", 28),
        4 to User("song", 29),
        5 to User("kim", 29))

    val filtered2 = userMap.filterValues { it.age > 28 }

    println(filtered2)
}
