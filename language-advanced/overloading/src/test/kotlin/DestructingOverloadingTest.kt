import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

/**
 *  분해 구조 선언 재정의
 *
 *  내부적으로 분해 구조가 있다면 componentN() 메서드가 동작하게 된다
 *
 *  코틀린에서는 맨 앞의 다섯 원소에 대한 componentN 을 제공한다
 */

class DestructingOverloadingTest {
    @Test
    fun `분해 구조를 재정의한다`() {
        val (actualName, actualAge)  = Member("jang", 23)

        assertThat(actualName).isEqualTo("jang")
        assertThat(actualAge).isEqualTo(23)
    }

    @Test
    fun `분해 구조를 컬렉션에서 사용할 수도 있다`() {
        val map = mapOf(1 to "jang", 2 to "heo")

        for ((key, value) in map) {
            assertThat(key).isNotNull
            assertThat(value).isNotNull
        }
    }
}

private class Member(val name: String, val age: Int)

private operator fun Member.component1() = name
private operator fun Member.component2() = age