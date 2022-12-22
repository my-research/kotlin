package sealed

import java.lang.IllegalArgumentException

/**
 * sealed : 상위 클래스를 상속한 하위 클래스의 추가를 제한할 때 사용
 *
 * sealed 는 기본적으로 open modifier
 * sealed 는 interface 에 못 사용함
 */

sealed class Expr { // sealed
    class Num( // 꼭 내부는 중첩클래스여야 한다
        val value: Int,
    ) : Expr()

    class Sum(
        val left: Expr,
        val right: Expr,
    ) : Expr()
}

fun eval(e: Expr): Int = when (e) {
    is Expr.Num -> e.value
    is Expr.Sum -> eval(e.right) + eval(e.left)
}

/*
interface Expr

class Num(
    val value: Int,
) : Expr

class Sum(
    val left: Expr,
    val right: Expr,
) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    // type 이 추가되고 만약 분기를 까먹으면 아래 예외가 반환됨
    else -> throw IllegalArgumentException("알 수 없는 연산자")
}*/
