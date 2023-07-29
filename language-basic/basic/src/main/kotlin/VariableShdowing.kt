/**
 * 변수 섀도잉: 스코프 밖에 선언된 변수명을 이용해 새롭게 할당하는 것
 *
 * 내부에서만 사용 가능
 * 가급적이면 사용하지 않는 것을 추천하고 가독성을 흐트린다
 */

fun main() {
    val x = 10; // outer scope

    fun inner() {
        val x = 20;
        println(x)
    }

    println(x)
    println(inner())
}