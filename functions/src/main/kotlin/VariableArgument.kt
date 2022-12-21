/**
 * 가변인자
 *
 * 메서드를 호출할 때 원하는 만큼 원소를 전달하면 자바 컴파일러가 배열에 그 값들을 넣어줌
 */

fun main() {
    val array = arrayOf("A", "B", "C", "D", "EDA")

    printAll("A", "B", "C", "D", "EDA")
    // 값이 들어있는 배열을 넘길 때

    printAll(*array) // 배열을 전개 (spread) 해서 각 인자로 넣어줘야함
    // 반면에 자바는 그냥 배열 자체를 넘김
}

// 자바는 받는 타입이 배열임, 하지만 코틀린은 string
fun printAll(vararg s: String) = println("size: ${s.size}")
