import java.lang.IllegalArgumentException

/**
 * let: 수신객체를 전달받은 람다로 넘긴다
 *      -> 수신 객체가 null 이 아닌 경우에만 호출된다
 *
 * let 을 safe call 연산자와 함께 사용해서 결과가 널인지 아닌지 확인하고 메서드를 호출하게 할 수 있다
 * 즉, 널이 아닌 값만 메서드를 호출하게 할 때 유용하다
 */
fun main() {
    val email: String? = "ff"

    email?.let {sendEmailTo(it)}
}

fun sendEmailTo(email: String) {
    println("sending email to $email")
}