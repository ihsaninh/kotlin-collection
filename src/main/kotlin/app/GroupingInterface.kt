package app

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c")
    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping.eachCount())
    println(grouping.fold("") { accumulator, element -> accumulator + element })
    println(grouping.reduce { _, accumulator, element -> accumulator + element })
    println(grouping.aggregate { _, accumulator: String?, element, first ->
        if (first) element
        else accumulator + element
    })

}