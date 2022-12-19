import java.lang.Integer.parseInt

fun main() {

    val names = mutableListOf("jang", "heo", "halo")

    val found = names.filter { it == "jang" }

    println(found)
}
