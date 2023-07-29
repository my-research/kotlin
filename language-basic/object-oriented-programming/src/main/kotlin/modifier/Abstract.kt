package modifier

/**
 * 추상 클래스에서 제어자
 *
 * 추상 클래스는 기본적으로 구현을 강제하는 메서드가 존재하기 때문에 default 가 open
 */
fun main() {
    val button = TextAnimatedButton()

    button.click()
    button.describe()
}

abstract class AnimatedButton {

    abstract fun animate() // 기본적으로 open

    fun click() { // 기본적으로 final
        animate()
        println("clicked")
    }

    open fun describe() { // 기본적으로 final 이지만 재정의를 원한다면 역시 open
        println("hi i'm animated button")
    }
}

class TextAnimatedButton: AnimatedButton() {
    override fun animate() {
        println("bling!")
    }
}