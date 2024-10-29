package com.github.dhslrl321.item23

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Main: StringSpec({
  "property 기본 사용" {

  }
})

interface Tree
class Birch: Tree
class Spruce: Tree

class Forest<T: Tree> {
  fun <T: Tree> addTree(tree: T) {
    // ...
  }
}
