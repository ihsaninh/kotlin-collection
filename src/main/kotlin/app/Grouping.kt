package app

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "d", "d", "e")
    val map: Map<String, List<String>> = list.groupBy { it }
    println(map)

    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping)
}