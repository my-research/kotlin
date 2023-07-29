/**
 * Enum 과 When
 */

fun main() {
    println(light(Color.RED))
    println(light(Color.GREEN))
}

/**
 * when 식이 본문인 light 함수
 * when 은 break 없어도 됨
 */
fun light(color: Color): String = when (color) {
    Color.RED -> "red bling bling"
    Color.GREEN, Color.BLUE -> "other bling bling"
}

enum class Color {
    RED, GREEN, BLUE
}