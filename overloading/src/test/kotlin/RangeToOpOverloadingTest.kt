import org.junit.jupiter.api.Test
import java.time.LocalDateTime

/**
 * rangeTo : 범위 연산자
 *
 * start .. to 키워드를 내부적으로 start.rangeTo(end) 로 컴파일 됨
 *
 * rangeTo 는 Comparable 을 구현한 클래스에 존재한다
 *      -> 즉, Comparable 의 확장함수
 */
class RangeToOpOverloadingTest {

    @Test
    fun name() {
        val now = LocalDateTime.now()

        val actual = now..now.plusDays(1L)
    }
}

private class OneLine(val start: Int, val end: Int)