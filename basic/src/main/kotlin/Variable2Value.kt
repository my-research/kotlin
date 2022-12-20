/**
 * 코틀린의 타입 시스템은 컴파일 시점에 컴파일러가 자동으로 형을 추론한다
 */

fun main() {
    val message = "hello world" // 묵시적 형변환
    val messageWithType: String = "hello world" // 명시적 형변환
    val unInitialized: Int // 초기화가 되지 않으면 반드시 타입을 명시해야함
    unInitialized = 20
    println(message + messageWithType)

    var variable = 10
    variable = 20
    val value = 33
    // value = 44 불가능, Val cannot be reassigned
    // 부수 효과가 없는 프로그래밍, 즉 불변성을 계속 만족시킬 수록 함수형에 가까워진다


    // 정확히 한 번만 할당될 것이라는게 컴파일러에게 확실하면 다른 여러 값으로 초기화 가능
    val finalValue: Int

    if (true) {
        finalValue = 100
    } else {
        finalValue = 200
    }
}