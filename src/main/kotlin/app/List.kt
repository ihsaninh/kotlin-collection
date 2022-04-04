package app

fun main() {
    val list: List<String> = listOf("Ihsan", "Nurul", "Habib")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Ihsan"))
    println(list.indexOf("Ucup"))
    println(list.contains("Ihsan"))
    println(list.containsAll(listOf("Ihsan", "Habib")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}