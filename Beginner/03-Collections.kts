/*
Level: Beginner
Topic: Collections
*/

// Exercise 1

val greenNumbers = listOf(1, 4, 23)
val redNumbers = listOf(17, 2)

println("There are ${greenNumbers.count() + redNumbers.count()} numbers in total")


// Exercise 2

val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
val requested = "smtp"

val isSupported = requested.uppercase() in SUPPORTED

println("Support for $requested: $isSupported")


// Exercise 3

val number2word = mapOf(
    1 to "one",
    2 to "two",
    3 to "three"
)

println(number2word[2])