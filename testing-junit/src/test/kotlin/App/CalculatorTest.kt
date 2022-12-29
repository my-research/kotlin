package App

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

private const val INITIAL_DATA = 10

class CalculatorTest {

    private val sut = Calculator(INITIAL_DATA)

    @Test
    fun `덧셈을 수행할 수 있다`() {
        val provided = 5

        sut.add(provided)

        assertThat(sut.number).isEqualTo(INITIAL_DATA + provided)
    }

    @Test
    fun `나누기의 인자는 0이 될 수 없다`() {
        val message = assertThrows<IllegalArgumentException> { sut.divide(0) }.message

        assertThat(message).isEqualTo("must not be 0")
    }
}