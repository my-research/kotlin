import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 연산자 오버로딩
 *
 * 기존에 자바에서 BigInteger 같은 클래스들을 보면 + (산술 연산)에 대해서 명시적으로 add 라는 메서드를 호출해서 사용했음
 * 하지만 코틀린은 연산자 자체에 대한 오버로드가 가능함
 *
 * 상응하는 연산자 이름에 대해서는 [공식 문서](https://kotlinlang.org/docs/operator-overloading.html) 를 참고
 */

class ArithmeticOpOverloadingTest {
    @Test
    fun `+ 산술연산을 오버로딩`() {
        // arrange
        val p1 = Point(55, 77)
        val p2 = Point(100, 100)

        // act
        val actual = p1 + p2 // 오버로드된 연산자를 이용해서 새로운 좌표를 추가

        // assert
        assertThat(actual.x).isEqualTo(55 + 100)
        assertThat(actual.y).isEqualTo(77 + 100)
    }

    @Test
    fun `확장함수를 이용한 산술연산 오버로딩`() {
        val sut = Point(10, 10)

        val actual = sut * 2

        assertThat(actual.x).isEqualTo(10 * 2)
    }
}

private class Point(val x: Int, val y: Int) {
    // operator 에 대한 이름이 있어야지만 operator 키워드를 붙일 수 있음
    operator fun plus(other: Point): Point { // operator 키워드가 필요함
        return Point(x + other.x, y + other.y)
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}

// 혹은 확장 함수로도 사용할 수 있음
private operator fun Point.times(scale: Int): Point {// 꼭 피연산자끼리 같은 타입일 필요 없음
    return Point(x * scale, y * scale)
}
