import java.lang.IllegalArgumentException

/**
 * 로컬 함수 : 추출한 함수를 원 함수 내부에 중첩시켜서 리팩토링 가능
 *
 * 자바에서 리팩토링시 메서드 추출을 하면서 리팩토링을 할 수 있지만 메서드가 많아짐
 * 이런 메서드들 사이의 관계를 파악하기 쉽지 않음
 *
 */

class User(val name: String, val address: String)

fun main() {
    saveUser(User("", ""))
    saveUserWithRefactor1(User("", ""))
    saveUserWithRefactor2(User("", ""))
}

// AS-IS
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("name is empty")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("address is empty")
    }
    // TODO save db
}

// TO-BE: refactor 1
// 로컬 함수를 이용한 리팩토링
fun saveUserWithRefactor1(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("$fieldName is empty")
        }
    }
    validate(user.name, "name")
    validate(user.address, "address")
    // TODO save db
}

// TO-BE refactor 2
// 확장 함수를 이용한 리팩토링
fun User.validate() {
    if (name.isEmpty()) {
        throw IllegalArgumentException("name is empty")
    }

    if (address.isEmpty()) {
        throw IllegalArgumentException("address is empty")
    }
}
fun saveUserWithRefactor2(user: User) {
    user.validate()

    // TODO save db
}