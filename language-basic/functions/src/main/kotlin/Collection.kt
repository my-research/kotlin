fun main() {
    collection()
    println(max(listOf(1, 2, 3)))
    println(lastOne(setOf("Java", "Kotlin")))
}

private fun max(list: List<Int>) = list.max()

private fun lastOne(list: Set<String>) = list.last()

private fun collection() {
    // 코틀린은 kotlin 의 컬렉션이 없이 다 자바 컬렉션을 사용함
    val set = hashSetOf(1, 7, 53)
    println("set is $set + ${set.javaClass}")

    val arrayList = arrayListOf(1, 2, 3)
    println("arrayList is $arrayList + ${arrayList.javaClass}")

    val list = listOf(1, 2, 3)
    println("list is $list + ${list.javaClass}")

    val map = hashMapOf(1 to "jang", 2 to "heo")
    println("map is $map + ${map.javaClass}")
}
