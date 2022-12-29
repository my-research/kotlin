/**
 * !! 은 컴파일러에게 이 값이 null 이 아님을 확신한다
 * 만약 null 이라 예외가 터져도 감수한다는 의미
 */

fun main() {
    println(ignoreNull(null))
}

fun ignoreNull(s: String?) {
    s!! // 얘는 기차 충돌 코드를 생산하면 안된다
    // 정확히 어디서 null 이 발생했는지 모르기 떄문에
    println(s.length)
}