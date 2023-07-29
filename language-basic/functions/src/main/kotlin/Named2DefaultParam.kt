/**
 * named parameter: 함수 호출시 인자로 넘기는 데이터에 이름을 부여
 * default parameter: 함수 정의시 기본으로 값을 세팅할 수 있음
 *
 * (추가로 확장 함수의 코드가 존재함)
 */

private const val SEPARATOR = ";" // 최상위 프로퍼티
private const val PREFIX = "("
private const val POSTFIX = ")"

fun main() {
    // 이렇게 쓰면 파라미터가 뭐가 뭔지 모른다
    val collection = setOf("A", "B", "C")

    println(joinToString(collection, SEPARATOR, PREFIX, POSTFIX))

    // named parameter
    println(
        joinToString(
            collection = collection,
            separator = SEPARATOR,
            prefix = PREFIX,
            postfix = POSTFIX
        )
    )

    // using default param
    println(joinToString(collection = collection))

    // using default param
    println(collection.extendedJoinToString())
}

fun <T> Collection<T>.extendedJoinToString(
    separator: String = ",",
    prefix: String = "[", // default param
    postfix: String = "]", // default param
): String = joinToString(this, separator, prefix, postfix)

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "[", // default param
    postfix: String = "]", // default param
): String {
    val builder = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            builder.append(separator)
        }
        builder.append(element)
    }
    builder.append(postfix)
    return builder.toString()
}