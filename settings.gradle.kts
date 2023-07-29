rootProject.name = "kotlin"

include("playground")

// language
include("language-basic:basic")
include("language-basic:functions")
include("language-basic:object-oriented-programming")
include("language-basic:lambdas")
include("language-basic:type-system")

// advanced
include("language-advanced:overloading")
include("language-advanced:high-order-function")
include("language-advanced:generics")

// testing
include("testing:testing-junit")
include("testing:testing-kotest:domain-fixture")
include("testing:testing-kotest:testing-style")

// effective kotlin
include("effective-kotlin")
include("effective-kotlin:stability")
include("effective-kotlin:readability")
