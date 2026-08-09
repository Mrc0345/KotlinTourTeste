/*
Nivel: Intermediate
Topico: Extension Functions
*/

// Exercicio 1

fun Int.isPositive(): Boolean = this > 0

println(1.isPositive())


// Exercicio 2

fun String.toLowercaseString(): String = this.lowercase()

println("Hello World!".toLowercaseString())