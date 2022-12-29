class Person(
    val name: String,
    val company: Company?
)

class Address(
    val streetAddress: String,
    val zipCode: String,
    val city: String,
    val country: String,
)

class Company(
    val name: String,
    val address: Address?
)