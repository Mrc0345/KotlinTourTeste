import kotlin.properties.Delegates.observable

/*
Nivel: Intermediate
Topico: Properties
*/

// Exercicio 1

fun findOutOfStockBooks(inventory: List<Int>): List<Int> =
    buildList {
        for (index in inventory.indices) {
            if (inventory[index] == 0) {
                add(index)
            }
        }
    }

val inventory = listOf(3, 0, 7, 0, 5)

println(findOutOfStockBooks(inventory))


// Exercicio 2

val Double.asMiles: Double
    get() = this * 0.621371

val distanceKm = 5.0
println("$distanceKm km is ${distanceKm.asMiles} miles")

val marathonDistance = 42.195
println("$marathonDistance km is ${marathonDistance.asMiles} miles")


// Exercicio 3

fun checkAppServer(): Boolean {
    println("Performing application server health check...")
    return true
}

fun checkDatabase(): Boolean {
    println("Performing database health check...")
    return false
}

val isAppServerHealthy by lazy {
    checkAppServer()
}

val isDatabaseHealthy by lazy {
    checkDatabase()
}

when {
    isAppServerHealthy ->
        println("Application server is online and healthy")

    isDatabaseHealthy ->
        println("Database is healthy")

    else ->
        println("System is offline")
}


// Exercicio 4

class Budget(val totalBudget: Int) {

    var remainingBudget: Int by observable(totalBudget) { _, oldValue, newValue ->

        if (newValue < totalBudget * 0.2) {
            println(
                "Warning: Your remaining budget ($newValue) " +
                "is below 20% of your total budget."
            )
        } else if (newValue > oldValue) {
            println(
                "Good news: Your remaining budget increased to $newValue."
            )
        }
    }
}

val myBudget = Budget(totalBudget = 1000)

myBudget.remainingBudget = 800
myBudget.remainingBudget = 150
myBudget.remainingBudget = 50
myBudget.remainingBudget = 300