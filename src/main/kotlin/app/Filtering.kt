package app

fun main() {
    val list1 = listOf("Ihsan", "Nurul", "Habib", "Amelia", "Salas")
    val list2 = list1.filter { it.length > 5 }
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }

    val list4: List<Any?> = listOf(null, 1, "Ihsan", "Amelia", 2, null)
    val list5: List<String> = list4.filterIsInstance<String>()
    val list6: List<Any> = list4.filterNotNull()

    println(list2)
    println(list3)

    println(list5)
    println(list6)
}