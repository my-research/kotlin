package gettersetter

/**
 * kotlin 의 property
 *
 * getter & setter: 프로퍼티의 값을 조회하거나 변경, getter 를 호출하지 않고 프로퍼티를 호출함
 *
 * 자바의 프로퍼티: 접근자 + 필드
 * 코틀린의 프로퍼티: 값을 저장하는 비공개 필드 (backing field) + getter 로 이루어진 디폴트 접근자 구현
 *      -> val: 읽기 전용 프로퍼티 (getter 만 생성)
 *      -> var: 읽기/쓰기 프로퍼티 (getter/setter 생성)
 */

fun main() {
    val student = Student()

    student.name = "hello world"
    println(student.name)
}

class User(
    val name: String, // val 이면 자동으로 getter 생성
    var address: String // var 이면 자동으로 getter & setter 생성
)

class Student {
    var name: String = ""
        get() {
            println("getter works in student class")
            return field // <- backing field
        }
        set(value) {
            println("setter works in student class")
            field = value
        }
}

class Teacher {
    private var name: String = ""
        get() {
            println("getter works in student class")
            return field // <- backing field
        }
        private set(value) { // 접근자에도 가시성 수준을 변경할 수 있다
            println("setter works in student class")
            field = value
        }
}