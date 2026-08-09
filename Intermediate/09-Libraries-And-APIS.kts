import kotlin.math.*
import kotlin.time.measureTime

/*
Nivel: Intermediate
Topico: Libraries and APIs
*/

// Exercicio 1

fun calculateCompoundInterest(
    P: Double,
    r: Double,
    n: Int,
    t: Int
): Double {
    return P * (1 + r / n).pow(n * t)
}

val principal = 1000.0
val rate = 0.05
val timesCompounded = 4
val years = 5

val amount = calculateCompoundInterest(
    principal,
    rate,
    timesCompounded,
    years
)

println("The accumulated amount is: $amount")


// Exercicio 2

val timeTaken = measureTime {

    val data = List(1000) { it * 2 }

    val filteredData = data.filter {
        it % 3 == 0
    }

    val processedData = filteredData.map {
        it / 2
    }

    println("Processed data")
}

println("Time taken: $timeTaken")


// Exercicio 3

@OptIn(ExperimentalStdlibApi::class)
fun experimentalFeature() {
    println("Experimental API enabled")
}

experimentalFeature()