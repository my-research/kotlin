fun main() {

    printIntRangeAsc(1..10)
    printIntRangeAsc()
    printIntRangeDesc()
    printIntRangeDescWithStep()

}

private fun printIntRangeAsc() {
    for (i in 1..100) {
        println(i)
    }

    for (i in 1 until 100) {
        println(i)
    }
}

private fun printIntRangeAsc(intRange: IntRange) {
    for (i in intRange) {
        println(i)
    }
}

private fun printIntRangeDesc() {
    for (i in 100 downTo 1) {
        println(i)
    }
}

private fun printIntRangeDescWithStep() {
    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}
