package collection

/**
 * groupBy: 리스트를 특성에 따라 여러 그룹으로 이뤄진 맵으로 변경
 *
 * 특성을 groupBy 파라미터로 넘김
 */
fun main() {
    val users = listOf(
        User("jang", 27),
        User("heo", 28),
        User("park", 28),
        User("song", 29),
        User("kim", 29))

    val groupBy = users.groupBy { it.age }

    println("groupBy: map 클래스일 것: ${groupBy.javaClass}")

    println("${groupBy.keys}")
}