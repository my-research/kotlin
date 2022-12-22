package gettersetter

/**
 * getter & setter: 프로퍼티의 값을 조회하거나 변경
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