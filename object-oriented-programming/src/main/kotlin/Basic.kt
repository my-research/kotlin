fun main() {
    val button = Button()
    button.click()
    button.describe()
}

interface Clickable {
    fun click()
    fun describe() = println("hello i'm clickable!") // default 구현이 있는 메서드
}

class Button: Clickable { // kotlin 은 implements 나 extends 키워드 없이 : 만 붙인다
    // kotlin 에서는 override 키워드를 명시하지 않으면 안된다
    override fun click() {
        println("clicked!")
    }
}