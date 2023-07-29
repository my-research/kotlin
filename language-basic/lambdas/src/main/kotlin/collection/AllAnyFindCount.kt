package collection

/**
 * 컬렉션에 모든 원소가 어떤 조건(predicate) 를 만족하는지 판단하는 연산들
 *
 * all: 모든 원소가 predicate 를 만족하는가 (true or false)
 * find: predicate 만족하는 첫 번째 원소 (first or null)
 * any: predicate 를 만족하는 원소가 하나라도 있는지 확인 (true or false)
 * count: predicate 를 만족하는 원소의 개수
 */

fun main() {
    val function = { u: User -> u.age > 28 }

    val users = listOf(
           User("jang", 27),
           User("heo", 28),
           User("park", 28),
           User("song", 29),
           User("kim", 29),
    )

    val all = users.all(function)
    println(all)
}