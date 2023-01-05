import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 멤버십 검사 연산자 `in` : 컬렉션에 객체가 들어있는지 확인하는 검사
 *
 * in 연산자와 대응되는 함수는 contains
 */

class InOpOverloadingTest {
    @Test
    fun `in 연산자도 오버로딩할 수 있다`() {
        val line = Line(1, 10)

        val actual = 5 in line

        assertThat(actual).isTrue
    }
}

private data class Line(val start: Int, val end: Int)

private operator fun Line.contains(p: Int): Boolean {
    return p in (start until end)
}