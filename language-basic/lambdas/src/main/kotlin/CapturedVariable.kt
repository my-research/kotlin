/**
 * 람다가 포획한 변수: 람다 안에서 사용하는 외부 변수
 *      -> 외부 변수는 람다를 정의하는 쪽의 컨텍스트에 정의된 변수 혹은 파라미터
 *
 * 람다가 변수룰 포획하면 해당 변수의 라이프사이클이 끝나더라도 참조가 가능하다
 *
 * how does it works?
 * 파이널인 변수를 포획한 경우 람다 코드를 변수 값과 함께 저장
 *      -> 자바는 final 변수만 캡쳐 가능
 * 파이널이 아닌 변수를 포획하면 컴파일러가 특별한 wrapper 로 감싼다.
 *      -> 나중에 값을 변경하거나 읽게 할 수 있다
 *      -> wrapper 에 대한 참조를 람다 코드와 함께 저장함
 *      -> 실제로 wrapper 가 final 로 되긴 함 참조만 final 로
 */

fun main() {
    printError(listOf("400", "401", "500"))
}

class Ref<T>(var value: T)

fun printError(responses: Collection<String>) {
    var clientErrorCount = 0 // 변수 capture
    var serverErrorCount = 0

    // 이런 식으로 감싸서 참조만 유지하고 실제 값을 변경
    val clientErrorCount1: Ref<Int> = Ref(0)

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrorCount++ // final 이 아닌 변수도 접근 가능
        } else if (it.startsWith("5")) {
            serverErrorCount++
        }
    }

    println("client's error: $clientErrorCount, server's error: $serverErrorCount")
}