package com.github.dhslrl321.item15

import org.junit.jupiter.api.Test

/**
 * item 15. receiver 를 명시적으로 참조하라
 *
 * this.name 과 같이 코드 길이는 길어지지만 리시버를 명확하게 명시하는것이 가독성에 좋을 수 있다.
 */
class Main {

  @Test
  fun name() {
    TODO("Not yet implemented")
  }

  fun <T: Comparable<T>> List<T>.quickSort(): List<T> {
    if (this.size < 2) return this
    val pivot = this.first()
    val (smaller, bigger) = this.drop(1)
      .partition { it < pivot }

    return smaller.quickSort() + pivot + bigger.quickSort()
  }
}
