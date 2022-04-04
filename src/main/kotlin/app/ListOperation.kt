package app

fun main() {
    val list = listOf("Amelia", "Salas")
    println(list.getOrNull(10))
    println(list.getOrElse(10) { "Tidak ada" })
    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList.binarySearch("Amelia"))

    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(numbers.indexOf(1))
    println(numbers.lastIndexOf(3))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}