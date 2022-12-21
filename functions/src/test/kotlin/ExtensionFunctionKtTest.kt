import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Test
fun `확장 함수를 테스트한다`() {
    val actual = "A".lengthWith("BB")

    assertEquals(actual, 3)
}