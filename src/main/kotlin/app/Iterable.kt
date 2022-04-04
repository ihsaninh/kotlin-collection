package app

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Ihsan", "Nurul", "Habib"))
    displayIterable(setOf("Amelia", "Salas"))
}