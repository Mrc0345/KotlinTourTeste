/*
Nivel: Intermediate
Topico: Null Safety
*/

// Exercicio 1

data class User(
    val name: String?
)

fun getNotificationPreferences(
    user: Any,
    emailEnabled: Boolean,
    smsEnabled: Boolean
): List<String> {

    val validUser = user as? User ?: return emptyList()
    val userName = validUser.name ?: "Guest"

    return listOfNotNull(
        "Email Notifications enabled for $userName".takeIf { emailEnabled },
        "SMS Notifications enabled for $userName".takeIf { smsEnabled }
    )
}

val user1 = User("Alice")
val user2 = User(null)
val invalidUser = "NotAUser"

println(getNotificationPreferences(user1, true, false))
println(getNotificationPreferences(user2, false, true))
println(getNotificationPreferences(invalidUser, true, true))


// Exercicio 2

data class Subscription(
    val name: String,
    val isActive: Boolean
)

fun getActiveSubscription(
    subscriptions: List<Subscription>
): Subscription? {
    return subscriptions.singleOrNull { it.isActive }
}

val premiumPlan = listOf(
    Subscription("Basic Plan", false),
    Subscription("Premium Plan", true)
)

val conflictingPlans = listOf(
    Subscription("Basic Plan", true),
    Subscription("Premium Plan", true)
)

println(getActiveSubscription(premiumPlan))
println(getActiveSubscription(conflictingPlans))


// Exercicio 3

data class Account(
    val username: String,
    val isActive: Boolean
)

fun getActiveUsernames(users: List<Account>): List<String> {
    return users.mapNotNull { user ->
        user.username.takeIf { user.isActive }
    }
}

val allUsers = listOf(
    Account("alice123", true),
    Account("bob_the_builder", false),
    Account("charlie99", true)
)

println(getActiveUsernames(allUsers))


// Exercicio 4

fun validateStock(requested: Int?, available: Int?): Int {

    val validRequested = requested ?: return -1
    val validAvailable = available ?: return -1

    if (validRequested < 0) return -1
    if (validRequested > validAvailable) return -1

    return validRequested
}

println(validateStock(5, 10))
println(validateStock(null, 10))
println(validateStock(-2, 10))