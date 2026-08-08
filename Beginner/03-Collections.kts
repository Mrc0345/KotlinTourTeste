/*
Level: Beginner
Topic: Collections
*/

val fruits = listOf("Apple", "Banana", "Orange")

println(fruits)
println(fruits[0])

val numbers = mutableListOf(10, 20, 30)
numbers.add(40)

println(numbers)

val student = mapOf(
    "name" to "John",
    "course" to "Kotlin"
)

println(student["name"])