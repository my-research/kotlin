package `interface`

/**
 * 기본 인터페이스와 구현
 *
 * 코틀린의 인터페이스를 구현할 때는 override 키워드를 꼭 명시해야한다
 * default 구현을 사용할 때는 default 키워드를 명시하지 않는다
 * 만약 구현체가 두 개의 인터페이스를 구현하고 동일한 시그니처가 존재한다면 컴파일 에러가 발생한다
 */

fun main() {
    val button = Button()

    button.click() // button clicked
    button.describe() // hello i'm focusable
}

interface Clickable {
    fun click()
    fun describe() = println("hello i'm clickable!") // default 구현이 있는 메서드
}

interface Focusable {
    fun click()
    fun describe()
}

class Button: Clickable, Focusable { // kotlin 은 implements 나 extends 키워드 없이 : 만 붙인다
    // kotlin 에서는 override 키워드를 명시하지 않으면 안된다
    override fun click() {
        println("clicked!")
    }

    // Unit defined in `interface`.extends.Clickable because it inherits multiple interface methods of it
    // 위의 에러를 만족시키기 위해 어떤 인터페이스의 describe 를 사용할지 명시
    // 이유는 구현하는 인터페이스에 describe 가 여러개가 있어서
    override fun describe() {
        // super<`interface`.Focusable>.describe()
        super.describe() // `interface`.extends.Clickable 에 default 구현이 유일하게 존재하므로 super 은 clickable 것을 사용
    }
}