/*
Nivel: Intermediate
Topico: Objects
*/

// Exercicio 1

interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne : Order {
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object OrderTwo : Order {
    override val orderId = "002"
    override val customerName = "Bob"
    override val orderTotal = 12.75
}

println("Order name: $OrderOne")
println("Order name: $OrderTwo")
println("Are the two orders identical? ${OrderOne == OrderTwo}")

if (OrderOne == OrderTwo) {
    println("The orders are identical.")
} else {
    println("The orders are unique.")
}

println("Do the orders have the same customer name? ${OrderOne.customerName == OrderTwo.customerName}")


// Exercicio 2

interface Vehicle {
    val name: String
    fun move(): String
}

object FlyingSkateboard : Vehicle {
    override val name = "Flying Skateboard"

    override fun move() = "Glides through the air with a hover engine"

    fun fly() = "Woooooooo"
}

println("${FlyingSkateboard.name}: ${FlyingSkateboard.move()}")
println("${FlyingSkateboard.name}: ${FlyingSkateboard.fly()}")


// Exercicio 3

data class Temperature(val celsius: Double) {

    val fahrenheit: Double = celsius * 9 / 5 + 32

    companion object {
        fun fromFahrenheit(fahrenheit: Double): Temperature {
            return Temperature((fahrenheit - 32) * 5 / 9)
        }
    }
}

val fahrenheit = 90.0
val temp = Temperature.fromFahrenheit(fahrenheit)

println("${temp.celsius}°C is $fahrenheit °F")