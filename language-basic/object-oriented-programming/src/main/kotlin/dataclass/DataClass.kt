package dataclass

import java.time.LocalDateTime

/**
 * data class : DTO 에 대해서 쉽게 구현해준 코틀린 클래스
 *
 * toString
 * equals
 * hashCode
 *
 * 자동 구현
 */

fun main() {
    val now = LocalDateTime.now()

    val request1 = CreateUserRequest("", 24, "seoul", now)
    val request2 = CreateUserRequest("", 24, "seoul", now)

    println(request1)

    println(request1 == request2)
    println(request1 == request2)
    println(request1 === request2)
}

data class CreateUserRequest(
    val name: String,
    val age: Int,
    val address: String,
    val createdAt: LocalDateTime
)