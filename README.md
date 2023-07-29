# Kotlin Language Docs, 나만의 코틀린 문서

- **language**
  - [basics](https://github.com/my-research/kotlin/tree/master/basic)
  - [functions](https://github.com/my-research/kotlin/tree/master/functions)
  - [object-oriented-programming](https://github.com/my-research/kotlin/tree/master/object-oriented-programming)
  - [lambdas](https://github.com/my-research/kotlin/tree/master/lambdas)
  - [type-system](https://github.com/my-research/kotlin/tree/master/type-system)
- **advanced usage**
  - [overloading](#)
  - [high-order-function](#)
  - [generics](#)
- **testing**
  - [test with kotest](#)
  - [test with junit5](#)

# effective kotlin

effective kotlin 에서 소개된 내용을 학습 테스트로 실습합니다

## 안전성

item1([가변성을 제한하라](#)),
item2([변수의 스코프를 최소화 하라](#)),
item3([최대한 플랫폼 타입을 지양하라](#)),
item4([inferred type 을 리턴하지 말라](#)),
item5([예외를 사용해 코드에 제한을 걸어라](#)),
item6([사용자 정의 오류보다 표준 오류를 사용하라](#)),

# keywords Index

kotlin 의 다양한 키워드에 대해서 설명합니다.

## language basics

### basic

variable & value([변수와 상수](#)),
top level declaration([최상위 선언](#)),
for loop([for 반복](#)),
variable shadowing([변수 쉐도잉](#)),
smart cast([스마트캐스트](#)),

### function

extended function([확장 함수](#)),
extended property([확장 프로퍼티](#)),
vararg([가변 인자](#)),
infix method call([중위호출](#)),
destructuring declaration([분해 구조 선언](#)),
local function([로컬 함수](#)),

### object oriented programming

interface2impl([인터페이스](#)),
modifier([제어자](#)),
visibility modifier([접근자, 가시성 제어자](#)),
inner class & nested class([내부 클래스와 중첩 클래스](#)),
sealed class([봉인된 클래스, 실드 클래스](#)),
primary constructor & initializer block([주 생성자와 초기화 블록](#)),
secondary constructor([부 생성자](#)),
abstract property([추상 프로퍼티](#)),
accessors-getter & setter([접근자-게터와 세터](#)),
backing field([뒷받침 필드](#)),
data class([데이터 클래스](#)),
immutable & delegating([불변성과 위임, copy() & by()](#)),
object keyword([object 키워드](#)),
companion object([동반 객체](#)),
object expression & anonymous object([객체 식과 무명 객체](#)),

### Lambdas

lambda usage & it ([람다식 사용법과 it](#)),
higher-order function([고차 함수](#)),
run([run 키워드](#)),
closure([클로저](#)),
captured variable([람다가 포획한 변수](#)),
member references([멤버 참조](#)),
collection functional api([컬렉션 함수형 API (filter, map, all, any, find, getCount, groupBy, flatMap, flatten)](#)),
iterable collection, sequence([Sequence](#)),
eager evaluation vs lazy evaluation([eager evaluation vs lazy evaluation](#)),
intermediate operation vs terminal operation([중간 연산과 최종 연산](#)),

### type-system

nullable type([널이 될 수 있는 타입](#)),
safe call operation & elvis operation([안전한 호출 연산자 '?.' 와 엘비스 연산자 '?:'](#)),
safe cast operation([안전한 캐스트: 'as?'](#)),
not null assertion([널 아님 단언: !!](#)),
let([let 함수](#)),
lateinit([lateinit, 지연 초기화](#)),
nullable with java & platform type([nullable 과 자바 & 플랫폼 타입](#)),
primitive type([코틀린의 원시 타입](#)),
Any Type([최상위 타입, Any](#)),
Unit Type([코틀린의 void, Unit](#)),

## Advanced usage keywords

### overloading

arithmetic operator([산술 연산자 오버로딩, + - * /](#)),
compound operator([복합 대입 연산자 오버로딩, += -=](#)),
unary operator([단항 연산자 오버로딩, ! -- ++](#)),
compare operator([비교 연산자 오버로딩, equals compareTo](#)),
index operator([인덱스 연산자 오버로딩](#)),
membership test([멤버십 검사 연산자 오버로딩, in](#)),
range operator([범위 연산자 오버로딩, rangeTo](#)),
range operator([분해 구조 오버로딩, componentN](#)),

### high-order-function

function type([함수 타입](#)),
high-order-function usage([고차함수의 사용](#)),
inline function([인라인 함수](#)),

### generics

# Testing

## kotest

- test style([kotest 의 다양한 test style](#))

# References

- [kotlin docs](https://kotlinlang.org/docs/basic-syntax.html)
- [hyperskill](https://hyperskill.org/tracks/18)
- [Kotlin in Action](http://www.yes24.com/Product/Goods/55148593)
- [Best Practices for Unit Testing in Kotlin](https://resources.jetbrains.com/storage/products/kotlinconf2018/slides/4_Best%20Practices%20for%20Unit%20Testing%20in%20Kotlin.pdf)
