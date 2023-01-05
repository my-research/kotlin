import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException

/**
 * 컬렉션에 대한 인덱스 연산을 오버로드할 수 있음
 *
 * 인덱스로 컬렉션의 원소에 접근할 수 있음
 */
class IndexOpOverloadingTest {

    private val sut = Place(8, 9)

    @Test
    fun `인덱스로 접근할 수 있다`() {
        assertThat(sut[0]).isEqualTo(sut.x)
        assertThat(sut[1]).isEqualTo(sut.y)
    }

    @Test
    fun `인덱스로 값을 수정할 수 있다`() {
        sut[0] = 88
        sut[1] = 99

        assertThat(sut[0]).isEqualTo(88)
        assertThat(sut[1]).isEqualTo(99)
    }
}

private class Place(
    var x: Int,
    var y: Int,
) {
    operator fun get(index: Int): Int {
        return when(index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("invalid place $index")
        }
    }

    operator fun set(index: Int, value: Int) {
        return when(index) {
            0 -> x = value
            1 -> y = value
            else ->
                throw IndexOutOfBoundsException("invalid place $index")
        }
    }
}
