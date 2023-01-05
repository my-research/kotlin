import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 단항 연산자 오버로딩은 인자를 받지 않는다.
 *
 * !a : not
 * ++a, a++ : inc
 * --a, a-- : dec
 *
 * ... 형대로 재정의 할 수 있다
 */

class UnaryOpOverloadingTest {
    @Test
    fun `단항 연산자도 오버로딩할 수 있다`() {
        val sut = Position(10, 20)

        val actual = -sut

        assertThat(actual.x).isEqualTo(-10)
        assertThat(actual.y).isEqualTo(-20)
    }
}

private class Position(val x: Int, val y: Int) {
    // operator 에 대한 이름이 있어야지만 operator 키워드를 붙일 수 있음
    operator fun plus(other: Position): Position { // operator 키워드가 필요함
        return Position(x + other.x, y + other.y)
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }
}

private operator fun Position.unaryMinus(): Position {
    return Position(-x, -y)
}