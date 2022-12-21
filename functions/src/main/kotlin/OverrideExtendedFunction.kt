/**
 * 확장함수는 재정의 오버라이드가 불가능하다
 * 확장함수는 수신 객체의 정적 타입에 의해 어떤 확장함수가 호출될지 결정된다.
 */

fun main() {
    val button:Button = FancyButton()
    button.click()
    button.show() // 얘의 정적 타입은 Button 임
    // 결국 확장함수 Button.show() 이 결정됨

    val fancyButton:FancyButton = FancyButton()
    fancyButton.click()
    fancyButton.show() // 얘의 정적 타입은 FancyButton 임
    // 결국 확장함수 FancyButton.show() 이 결정됨
}

private fun Button.show() = println("I'm just button")
private fun FancyButton.show() = println("I'm super fancy button")

private open class Button() {
    open fun click() = println("default clicked")
}

private class FancyButton: Button() {
    override fun click() = println("Bling Bling Clicked")
}