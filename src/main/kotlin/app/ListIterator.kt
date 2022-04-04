package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun main() {
    displayListIterator(listOf("Ihsan", "Nurul", "Habib").listIterator())
}