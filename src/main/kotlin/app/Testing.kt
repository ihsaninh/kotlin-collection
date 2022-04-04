package app

fun main() {
    val list = listOf<String>("Ihsan", "Amelia", "Salas")

    println(list.any() { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })
    println(list.any())
    println(list.none())
}