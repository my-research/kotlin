package visibility

/**
 * 가시성 변경자, visibility modifier
 * 코틀린에서 멤버(class, function, property) 에 접근할 수 있는 범위를 제안하는 키워드
 *
 * 코틀린은 기본 가시성이 public
 *
 * public : 모든 곳에서 접근 가능
 * internal : 같은 모듈 안에서만 접근 가능
 *      모듈이란 코틀린을 컴파일 할 때 함께 컴파일되는 것
 * protected : 하위 클래스 안에서만 확인 가능 (최상위 선언 불가)
 * private : 같은 클래스 안에서만 볼 수 있음 (최상위 선언은 같은 파일에서만 볼 수 있음)
 */

internal open class TalkativeButton {
    private fun yell() = println("hey")
    protected fun whisper() = println("talk")
}

/*
fun TalkativeButton.give() { // error : 가시성이 다름
    yell() // error : private 에 접근 불가
    whisper() // error : protected 에 접근 불가
}
*/
