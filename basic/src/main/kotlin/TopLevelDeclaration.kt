/**
 * 최상위 선언
 *
 * 코틀린은 모든 메서드나 필드가 클래스에 속해야 하는 반면에 함수나 프로퍼티가 최상위에 위치할 수 있다
 * 즉, 클래스 없이 독립적으로 존재할 수 있다
 *
 * 전역으로 사용해야하는 utility 를 만들 때 보통 사용한다
 *
 * 최상위 선언은 `protected` visibility modifier 이 불가능하다
 * 이유인 즉, protected 는 목적이 서브클래스를 위한 것이므로
 */

var count = 0; // 최상위 변수

const val TOP_LEVEL_MESSAGE = "THIS IS KOTLIN" // 최상위 상수

fun speech() { // 최상위 함수
    println(TOP_LEVEL_MESSAGE)
}
