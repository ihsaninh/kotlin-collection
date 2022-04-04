package app

fun main() {
    val list1: List<String> = listOf("Ihsan", "Nurul", "Habib", "Amelia", "Salas")
    val (listMatch, listNotMatch) = list1.partition { it.length > 5 }

    println(list1)
    println(listMatch)
    println(listNotMatch)
}