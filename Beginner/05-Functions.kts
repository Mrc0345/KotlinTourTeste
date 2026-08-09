/*
Nível: Beginner
Tópico: Functions
*/

import kotlin.math.PI

// Exercicio 1

fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

println(circleArea(2))


// Exercício 2

fun circleArea2(radius: Int): Double = PI * radius * radius

println(circleArea2(2))


// Exercicio 3

fun intervalInSeconds(
    hours: Int = 0,
    minutes: Int = 0,
    seconds: Int = 0
) = ((hours * 60) + minutes) * 60 + seconds

println(intervalInSeconds(1, 20, 15))
println(intervalInSeconds(minutes = 1, seconds = 25))
println(intervalInSeconds(hours = 2))
println(intervalInSeconds(minutes = 10))
println(intervalInSeconds(hours = 1, seconds = 1))


// Exercicio 4

val actions = listOf("title", "year", "author")
val prefix = "https://example.com/book-info"
val id = 5

val urls = actions.map { action ->
    "$prefix/$id/$action"
}

println(urls)


// Exercicio 5

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

repeatN(5) {
    println("Hello")
}