package app

fun main() {
    val numbers: List<Int> = listOf(1, 4, 3, 5, 7 ,6, 9, 8, 2)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}