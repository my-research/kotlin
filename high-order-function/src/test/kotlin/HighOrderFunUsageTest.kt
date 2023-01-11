import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 고차함수 : 함수의 인자로 전달하거나 반환될 수 있는 함수
 *
 * 고차 함수의 기본적인 사용법에 대한 테스트
 */
class HighOrderFunUsageTest {

    private val orderItems = listOf(50_000, 50_000)

    @Test
    fun `고차함수를 파라미터로 전달할 수 있다`() {
        val sut = OrderLine(orderItems, ::calculateByDefault) // member 참조
        // OrderLine(orderItems) { calculateByDefault(it) } 와 동일하다


        val actual = sut.calculateFee()

        assertThat(actual).isEqualTo(100_000)
    }

    @Test
    fun `다른 고차함수도 파라미터로 전달할 수 있다`() {
        val sut = OrderLine(orderItems, ::calculateByTax)

        val actual = sut.calculateFee()

        assertThat(actual).isEqualTo(110_000)
    }
}

private class OrderLine(
    val orderItems: List<Int>,
    val calculateFee: (List<Int>) -> Int, // 고차 함수를 파라미터로 받음
) {
    fun calculateFee(): Int = calculateFee(orderItems) // 고차 함수의 호출
}

// 주문 총액을 계산
private fun calculateByDefault(orderItems: List<Int>): Int {
    return orderItems.sumOf { it }
}

// 세금과 함께 계산함
private fun calculateByTax(orderItems: List<Int>): Int {
    val sum = orderItems.sumOf { it }
    return (sum + (sum * 0.1)).toInt()
}