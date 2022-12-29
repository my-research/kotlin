import java.lang.IllegalArgumentException

/**
 * 아래 두가지 연산자를 알고 있다면 null 체크를 위한 if/else 문을 획기적으로 줄일 수 있다
 *
 * 안전한 호출 연산: ifPresent
 * 엘비스 연산: null or default
 */
fun Person.countryName(): String = company
    ?.address // save call
    ?.country ?: "not exist" // elvis

fun Person.withShippingLabel(person: Person) = person.company
    ?.address
    ?: throw IllegalArgumentException("no address") // elvis with exception
