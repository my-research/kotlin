package modifier

/**
 * 제어자
 *
 * 취약한 기반 클래스를 막기 위해서 코틀린은 기본적으로 재정의가 불가능하다
 * 재정의를 위해서는 open 키워드를 명시해줘야 한다
 * 하지만 인터페이스의 시그니처는 재정의가 가능하므로 인터페이스의 구현체 재정의를 막기 위해서는 final 키워드를 붙여야 한다1
 *
 * 제어자를 잘 써야하는 이유는 바로 SmartCast 때문이다.
 *
 * smartCast 는 변경이 불가능한 상태에서 더 많은 기회가 주어진다. 즉, val 이면서 커스텀 접근자가 없어야 가능하다는 소리
 */

fun main() {

}

interface Clickable {
    fun click()
    fun describe()
}

open class RichButton: Clickable {
    override fun click() { // 재정의 가능
        println("clicked")
    }

    final override fun describe() { // 재정의 불가, 기본적으로 인터페이스 구현체는 재정의 가능
        println("hi i'm rich button")
    }

    open fun animate() { // 재정의 가능
        println("bling bling")
    }

    fun display() { // 재정의 불가 (open 이 아니라서)
        TODO("will be displayed")
    }
}

class MoreRichButton: RichButton() {

    // Clickable 을 재정의
    override fun click() {
        println("clicked!!!")
    }

    // open 키워드가 붙은 부모의 animate 재정의
    override fun animate() {
        println("bling bling bling")
    }

    // 이제 나머지는 재정의 불가
}