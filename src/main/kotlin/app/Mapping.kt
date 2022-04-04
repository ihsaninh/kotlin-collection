package app

fun main() {
    val list1: List<String> = listOf("Ihsan", "Nurul", "Habib")
    val list2: List<String> = list1.map { it.toUpperCase() }
    val list3: List<Int> = list1.map { it.length }
    val list4: List<String> = list1.mapNotNull { value ->
        if (value == "Ihsan") value else null
    }

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0)null
        else it
    }

    println(ganjil)
}