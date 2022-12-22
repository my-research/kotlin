package constructors

/**
 * 부 생성자
 *
 * 클래스 바디 안에 있는 `constructor` 키워드의 생성자
 *
 * 다수를 가질 수 있다
 */

fun main() {
    Player()
    Player("james", 12, "liverpool")
}

open class View(val ctx: String, val attr: String = "default")

class Button: View {
    // 자신의 다른 생성자를 호출함
    constructor(ctx: String): this(ctx, "") {

    }

    // 부모에게 호출을 위임,
    constructor(ctx: String, attr: String): super(ctx, attr)
}

class Player(name: String = "", number: Int = 0) { // default 값이 있으므로 자동으로 빈 생성자를 만듦

    init { // 초기화 블록
        println("created")
    }

    constructor(name: String, number: Int, team: String): this(name, number) {
        println(team)
    }
}