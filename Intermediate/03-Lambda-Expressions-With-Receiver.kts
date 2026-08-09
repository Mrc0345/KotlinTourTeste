/*
Nivel: Intermediate
Topico: Lambda Expressions With Receiver
*/

// Exercicio 1

class Menu {
    val items = mutableListOf<String>()

    fun item(name: String) {
        items.add(name)
    }
}

fun menu(init: Menu.() -> Unit): Menu {
    val menu = Menu()
    menu.init()
    return menu
}

val mainMenu = menu {
    item("Home")
    item("Profile")
    item("Settings")
}

println(mainMenu.items)