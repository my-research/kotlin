/**
 * lateinit: 나중에 초기화 할 프로퍼티, lateinit 을 통해서 nullable 한 타입에 나중에 초기화 할 것이라는 것을 알려준다
 *
 * 코틀린에서는 생성자에서 모든 프로퍼티를 초기화해야한다
 *      -> 그렇지 않으면 null 이 될 수 있는 타입을 사용해야 하는데, 그러면 계속해서 null 검사를 해줘야 한다
 */

private class SomeService {
    private lateinit var age: String
}