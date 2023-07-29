/**
 * 타입 캐스팅은 as 로 함
 * 타입 캐스팅이 가능한지 확인하는 것은 is 로 함
 *
 * 안전한 타입 캐스팅은 as?
 */

fun main() {
    val manager = Manager()
    manager.greet()
    val isSame = manager is Employee

    val employee = manager as? Employee // manager 가 emp 타입이면 변환, 그렇지 않으면 return null
    // employee.work()
}

private interface Employee {
    fun work()
}

private class Manager: Employee {
    override fun work() {
        println("gogo")
    }

    fun greet() {
        println("hi")
    }
}