package nullablewithjava

/**
 * 플랫폼 타입은 코틀린이 널 관련 정보를 알 수 없는 타입을 의미 (어노테이션이 없는 경우)
 *
 * 결국 nullable 한 타입으로 처리해도 되고 notnull 타입으로 처리해도 된다
 *
 * 자바 코드와 함께 사용할 때는 플랫폼 타입, 즉 nullable 에 대해서 잘 신경써야 한다
 */
fun main() {
    yellAt(User(null))
}

fun yellAt(user: User) {
    println((user.name ?: "Anyone").uppercase() + "!!!") // null 검사
}