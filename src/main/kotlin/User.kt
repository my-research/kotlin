/**
 * kotlin 은 default 로 클래스가 상속 불가다.
 * open 키워드를 통해서 상속이 가능하게 만들어줘야 한다
 */
open class User(
    age: Int,
    name: String,
    height: Int = 180
) {

    private val greetingMessage = "안녕 내 이름은 $name 이고 나이는 $age 살이야, 그리고 키는 $height 이야."

    fun greeting() {
        println(greetingMessage)
    }
}