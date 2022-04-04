package app

fun main() {
    val list1 = mutableListOf("Ihsan", "Nurul")
    val listReverse = list1.reversed()
    val listAsReverse = list1.asReversed()
    list1.add("Habib")
    println(listReverse)
    println(listAsReverse)
}