import java.lang.IllegalArgumentException


/**
 * SmartCast: 변하지 않는 상수에 대해서 가능한 유일 타입에 대해 자동 형변환
 */

fun main() {
    // ((1 + 2) + 4)
    val sum = Sum(Sum(Num(1), Num(2)), Num(4))
    print(eval(sum))
}

interface Expr // Marker

class Num(
    val value: Int,
) : Expr

class Sum(
    val left: Expr,
    val right: Expr,
) : Expr

/**
 * 식을 계산한다
 * e 가 식이라면 좌항과 우항의 값을 계산 후 값을 반환
 * e 가 수라면 그 값을 반환
 */
fun eval(e: Expr): Int = when (e) {
    // e 에 대한 타입 검사가 이루어지면 컴파일러가 자동으로 형변환
    // 이것이 smart cast
    // smart cast 는 타입 검사한 다음 값이 변할 수 없는 경우에만 동작, 그래서 var 은 안됨
    is Num ->
        e.value // smartCast 에 의해서 e 는 Num 인스턴스가 됨 is 는 instanceOf 와 같다
    is Sum -> { // when 에서 블록을 사용할 수도 있다
        println("---sum works---")
        eval(e.left) + eval(e.right) // 반환하려는 값을 제일 마지막에 두면 된다 (이것은 블록에 대한 규칙)
    }

    else ->
        throw IllegalArgumentException();
}
