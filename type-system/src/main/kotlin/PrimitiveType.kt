/**
 * 코틀린은 원시 타입과 래퍼 타입을 구분하지 않음
 *      -> 실행 시점에 원시 타입으로 사용 가능하면 원시 타입으로 바꿈
 */
fun main() {
    integerType()

    floatingType()

    booleanType()

    characterType()
    integerTypeWithNull(null)
}

private fun integerType() {
    val number: Int = 10 // 컴파일 시점에 primitive 타입으로 변환

    val list: List<Int> = listOf(1, 2, 3) // 컴파일 시점에 wrapper 타입으로 변환

    number.coerceIn(1, 100) // 이런 형태로 primitive 타입을 참조 타입처럼 더 리치하게 사용할 수 있다
}

private fun integerTypeWithNull(number: Int?): Boolean? {
    if (number == null) { // null 이 될 수 있는 타입에서는 무조건 null 체크를 해줘야 한다
        return false
    }

    if (number > 10) {
        println("number is over ten")
        return true
    }
    println("number is $number")
    return false
}

private fun characterType() {
    val char: Char = 'c'
    val str: String = "hello"
}

private fun booleanType() {
    val flag: Boolean = true
}

private fun floatingType() {
    val number1: Float = 1.1F
    val number2: Double = 2.2
}
