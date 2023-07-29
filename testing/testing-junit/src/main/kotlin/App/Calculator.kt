package App

import java.lang.IllegalArgumentException

class Calculator (
    _number: Int
) {
    var number: Int = _number
        get() = field

    fun add(operand: Int) {
        number += operand
    }

    fun minus(operand: Int) {
        number -= operand
    }

    fun multiply(operand: Int) {
        number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("must not be 0")
        }

        number /= operand
    }
}