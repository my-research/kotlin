# Kotlin Language Docs, 나만의 코틀린 문서

코틀린 관련 지식을 인덱싱하기 위한 repository 입니다

### 목차

- **effective kotlin**
  - 안전성, stability
  - 가독성, readability
- **language-basic**
  - basics
  - functions
  - object-oriented-programming
  - lambdas
  - type-system
- **language-advanced**
  - overloading
  - high-order-function
  - generics
- **testing**
  - test with kotest
  - test with junit5

# effective kotlin

effective kotlin 에서 소개된 내용을 학습 테스트로 실습합니다

## 안전성

item1([가변성을 제한하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item01/Main.kt)),
item2([변수의 스코프를 최소화 하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item02/Main.kt)),
item3([최대한 플랫폼 타입을 지양하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item03/Main.kt)),
item4([inferred type 을 리턴하지 말라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item04/Main.kt)),
item5([예외를 사용해 코드에 제한을 걸어라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item05/Main.kt)),
item6([사용자 정의 오류보다 표준 오류를 사용하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item06/Main.kt)),
item7([결과 부족이 발생했을 땐 null 과 Failure 를 사용하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item07/Main.kt)),
item8([적절하게 null 을 처리하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/stability/src/test/kotlin/com/github/dhslrl321/item08/Main.kt)),

## 가독성

item11([가독성을 목표로 설계하라](https://github.com/my-research/kotlin/blob/master/effective-kotlin/readability/src/test/kotlin/com/github/dhslrl321/item11/Main.kt)),
item12([x](https://github.com/my-research/kotlin/blob/master/effective-kotlin/readability/src/test/kotlin/com/github/dhslrl321/item12/Main.kt)),

# keywords Index

kotlin 의 다양한 키워드에 대해서 설명합니다.

## kotlin basics

### basic

variable & value([변수와 상수](https://github.com/my-research/kotlin/tree/master/language-basic/basic/src/main/kotlin)),
top level declaration([최상위 선언](https://github.com/my-research/kotlin/blob/master/language-basic/basic/src/main/kotlin/TopLevelDeclaration.kt)),
for loop([for 반복](https://github.com/my-research/kotlin/blob/master/language-basic/basic/src/main/kotlin/ForLoop.kt)),
variable shadowing([변수 쉐도잉](https://github.com/my-research/kotlin/blob/master/language-basic/basic/src/main/kotlin/VariableShdowing.kt)),
smart cast([스마트캐스트](https://github.com/my-research/kotlin/blob/master/language-basic/basic/src/main/kotlin/SmartCast.kt)),

### function

extended function([확장 함수](https://github.com/my-research/kotlin/blob/master/language-basic/functions/src/main/kotlin/Collection.kt)),
extended property([확장 프로퍼티](#)),
vararg([가변 인자](https://github.com/my-research/kotlin/blob/master/language-basic/functions/src/main/kotlin/VariableArgument.kt)),
infix method call([중위호출](https://github.com/my-research/kotlin/blob/master/language-basic/functions/src/main/kotlin/InfixCall.kt)),
destructuring declaration([분해 구조 선언](https://github.com/my-research/kotlin/blob/master/language-basic/functions/src/main/kotlin/Destructure.kt)),
local function([로컬 함수](https://github.com/my-research/kotlin/blob/master/language-basic/functions/src/main/kotlin/LocalFunction.kt)),

### object oriented programming

interface2impl([인터페이스](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
modifier([제어자](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
visibility modifier([접근자, 가시성 제어자](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
inner class & nested class([내부 클래스와 중첩 클래스](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
sealed class([봉인된 클래스, 실드 클래스](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
primary constructor & initializer block([주 생성자와 초기화 블록](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
secondary constructor([부 생성자](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
abstract property([추상 프로퍼티](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
accessors-getter & setter([접근자-게터와 세터](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
backing field([뒷받침 필드](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
data class([데이터 클래스](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
immutable & delegating([불변성과 위임, copy() & by()](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
object keyword([object 키워드](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
companion object([동반 객체](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),
object expression & anonymous object([객체 식과 무명 객체](https://github.com/my-research/kotlin/tree/master/language-basic/object-oriented-programming/src/main/kotlin)),

### Lambdas

lambda usage & it ([람다식 사용법과 it](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
higher-order function([고차 함수](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
run([run 키워드](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
closure([클로저](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
captured variable([람다가 포획한 변수](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
member references([멤버 참조](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
collection functional api([컬렉션 함수형 API (filter, map, all, any, find, getCount, groupBy, flatMap, flatten)](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
iterable collection, sequence([Sequence](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
eager evaluation vs lazy evaluation([eager evaluation vs lazy evaluation](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),
intermediate operation vs terminal operation([중간 연산과 최종 연산](https://github.com/my-research/kotlin/tree/master/language-basic/lambdas/src/main/kotlin)),

### type-system

nullable type([널이 될 수 있는 타입](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
safe call operation & elvis operation([안전한 호출 연산자 '?.' 와 엘비스 연산자 '?:'](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
safe cast operation([안전한 캐스트: 'as?'](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
not null assertion([널 아님 단언: !!](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
let([let 함수](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
lateinit([lateinit, 지연 초기화](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
nullable with java & platform type([nullable 과 자바 & 플랫폼 타입](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
primitive type([코틀린의 원시 타입](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
Any Type([최상위 타입, Any](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),
Unit Type([코틀린의 void, Unit](https://github.com/my-research/kotlin/tree/master/language-basic/type-system/src/main/kotlin)),

## Advanced usage keywords

### overloading

arithmetic operator([산술 연산자 오버로딩, + - * /](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
compound operator([복합 대입 연산자 오버로딩, += -=](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
unary operator([단항 연산자 오버로딩, ! -- ++](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
compare operator([비교 연산자 오버로딩, equals compareTo](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
index operator([인덱스 연산자 오버로딩](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
membership test([멤버십 검사 연산자 오버로딩, in](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
range operator([범위 연산자 오버로딩, rangeTo](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),
range operator([분해 구조 오버로딩, componentN](https://github.com/my-research/kotlin/tree/master/language-advanced/overloading/src/test/kotlin)),

### high-order-function

function type([함수 타입](#)),
high-order-function usage([고차함수의 사용](#)),
inline function([인라인 함수](#)),

# Testing

kotlin 의 test 관련 style 이나 사용법에 대해 학습합니다

## kotest

- test style([kotest 의 다양한 test style](#))

# References

- [kotlin docs](https://kotlinlang.org/docs/basic-syntax.html)
- [hyperskill](https://hyperskill.org/tracks/18)
- [Kotlin in Action](http://www.yes24.com/Product/Goods/55148593)
- [Best Practices for Unit Testing in Kotlin](https://resources.jetbrains.com/storage/products/kotlinconf2018/slides/4_Best%20Practices%20for%20Unit%20Testing%20in%20Kotlin.pdf)
