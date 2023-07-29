import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 고차 함수: 함수
 */
class FunctionTypeTest {
    @Test
    fun `함수 타입은 생략이 가능하다`() {
        // 서로 동일한 함수
        val fun1 = { a: Int, b: Int -> a + b }
        val fun2: (Int, Int) -> Int = { a, b -> a + b }

        assertThat(fun1(1, 2)).isEqualTo(fun2(1, 2))
    }

    @Test
    fun `널이 될 수 있는 함수 타입도 존재한다`() {
        val fun1: ((Int, Int) -> Int)? = null

        assertThat(fun1).isNull()
    }

    @Test
    fun `널을 반환하는 함수 타입도 존재한다`() {
        val fun1: (Int, Int) -> Int? = { _, _ -> null}
    }
}