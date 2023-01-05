import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 * 복합 대입 연산자, += -=
 *
 * 코틀린은 복합 대입 연산자 오버로딩도 지원함
 *
 * 산술 연산자는 일반적으로 객체에 대한 참조를 바꿀 때 사용하지만 복합 대입 연산자는 객체의 내부 상태를 바꿀 때 사용됨
 *      -> 이를테면 컬렉션에 원소를 추가할 때
 */

class CompoundOpOverloadingTest {
    @Test
    fun `복합대입 연산자를 오버로딩한다`() {
        val sut = arrayListOf(1, 2)

        sut += 3

        assertThat(sut).hasSize(3)
    }

    @Test
    fun `코틀린 표준 라이브러리는 연산자 오버로딩을 제공한다 - 1`() {
        val sut = listOf(1, 2)

        val actual: Collection<Int> = sut + listOf(3) // 새로운 collection 을 반환

        assertThat(actual).hasSize(3)
    }

    @Test
    fun `코틀린 표준 라이브러리는 연산자 오버로딩을 제공한다 - 2`() {
        val sut = mutableListOf(1, 2)

        sut += 3 // list 자체를 변경하기 때문에 mutable collection

        assertThat(sut).hasSize(3)
    }
}

private operator fun <T> MutableCollection<T>.plusAssign(element: T) { // plusAssign 은 반환 타입이 무조건 Unit 이어야 한다
    this.add(element)
}