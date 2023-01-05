import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


/**
 * 비교 연산자 오버로딩
 *
 * 코틀린에서는 비교 연산자 == 를 오버로딩 할 수 있기 때문에 equals 메서드를 호출하지 않아도 된다
 *
 * 동등성 연산자: equals
 */
private const val LOCATION = "잠실동 208-5번지"
private const val CODE = 1


class CompareOpOverloadingTest {
    @Test
    fun `비교(equals) 연산자 오버로딩`() {
        val actual = Address(LOCATION, CODE) == Address(LOCATION, CODE)

        assertThat(actual).isTrue
    }

    @Test
    @DisplayName("순서 연산자 (> <)")
    fun `순서 연산자 오버로딩`() {
        val address1 = Address(LOCATION, 1)
        val address2 = Address(LOCATION, 2)

        assertThat(address1 < address2).isTrue
    }
}

private class Address(val name: String, val code: Int) : Comparable<Address> {
    override fun compareTo(other: Address): Int {
        // 필드의 우선순위대로 비교 순서를 정할 수 있음
        return compareValuesBy(this, other, Address::name, Address::code) // selector 하나씩 순서대로 비교
    }

    // equals 는 Any 에 정의되어있다. Any 에 있는 equals 시그니처가 operator 연산자가 붙어있기 때문에 여기서 operator 키워드를 생략할 수 있다
    override fun equals(obj: Any?): Boolean { // != 에 대해서는 따로 처리하지 않아도 된다ㅡ 컴파일러가 equals 결과를 반전시키기 때문에
        if (obj === this) return true // 1. 식별자 identity 비교 (동일성 비교)
        if (obj !is Address) return false // 같은 타입이 아니라면 false
        return obj.name == name && obj.code == code // 같은 타입이면서 값도 같을 경우
    }
}