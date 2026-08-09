/*
Nivel: Beginner
Topico: Classes
*/
import kotlin.random.Random

// Exercicio 1

data class Employee(
    val name: String,
    var salary: Int
)

val employee = Employee("Mary", 20)

println(employee)

employee.salary += 10

println(employee)


// Exercicio 2

data class Name(
    val first: String,
    val last: String
)

data class City(
    val name: String,
    val countryCode: String
)

data class Address(
    val street: String,
    val city: City
)

data class Person(
    val name: Name,
    val address: Address,
    val ownsAPet: Boolean = true
)

val person = Person(
    Name("John", "Smith"),
    Address(
        "123 Fake Street",
        City("Springfield", "US")
    ),
    ownsAPet = false
)

println(person)


// Exercicio 3



class RandomEmployeeGenerator(
    var minSalary: Int,
    var maxSalary: Int
) {
    val names = listOf(
        "John",
        "Mary",
        "Ann",
        "Paul",
        "Jack",
        "Elizabeth"
    )

    fun generateEmployee(): Employee {
        return Employee(
            names.random(),
            Random.nextInt(minSalary, maxSalary)
        )
    }
}

val generator = RandomEmployeeGenerator(10, 30)

println(generator.generateEmployee())
println(generator.generateEmployee())
println(generator.generateEmployee())

generator.minSalary = 50
generator.maxSalary = 100

println(generator.generateEmployee())