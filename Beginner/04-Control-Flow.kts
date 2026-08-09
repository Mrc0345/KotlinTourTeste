/*
Nível: Beginner
Tópico: Control Flow
*/

// Exercício 1



import kotlin.random.Random

val firstResult = Random.nextInt(6)
val secondResult = Random.nextInt(6)

if (firstResult == secondResult) {
    println("You win :)")
} else {
    println("You lose :(")
}


// Exercício 2

val button = "A"

println(
    when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
)


// Exercício 3 - while


var pizzaSlices = 0

while (pizzaSlices < 7) {
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
}

pizzaSlices++

println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


// Exercício 3 - do-while

var pizzaSlices2 = 0

pizzaSlices2++



do {
    println("There's only $pizzaSlices2 slice/s of pizza :(")
    pizzaSlices2++
} while (pizzaSlices2 < 8)

println("There are $pizzaSlices2 slices of pizza. Hooray! We have a whole pizza! :D")


// Exercício 4 - FizzBuzz

for (number in 1..100) {
    println(
        when {
            number % 15 == 0 -> "fizzbuzz"
            number % 3 == 0 -> "fizz"
            number % 5 == 0 -> "buzz"
            else -> "$number"
        }
    )
}


// Exercício 5

val words = listOf("dinosaur", "limousine", "magazine", "language")

for (word in words) {
    if (word.startsWith("l")) {
        println(word)
    }
}