import java.lang.IllegalArgumentException

/**
 * 코틀린에서는 null 이 될 수 있는 타입을 자바와 달리 명시적으로 지원
 *
 * null 이 될 가능성이 있는가?
 *      -> 있다: `?` 키워드로 nullable 하게 만듦
 *      -> 없다: 컴파일 시점에 nullable 한 필드에 대해서 alert
 */
fun main() {
    // strLen(null) <- Null can not be a value of a non-null type String 이라는 컴파일 에러 발생
    strLen("hello")
    strLenWithNull(null)
}

fun strLen(s: String) = s.length

fun strLenWithNull(s: String?) {
    // 에러 메시지: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    if (s == null) { // null handling 을 하지 않으면 컴파일이 안된다
        throw IllegalArgumentException("parameter is null")
    }
    // 연산의 수행이 제한됨
    s.length
}