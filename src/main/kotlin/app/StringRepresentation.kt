package app

fun main() {
    val list: List<String> = listOf("Ihsan", "Nurul", "Habib")

    val str1: String = list.joinToString(" ")
    println(str1)

    val str2: String = list.joinToString(" ") { it.toUpperCase() }
    println(str2)

    val builder = StringBuilder()
    list.joinTo(builder, " ")
    val str3 = builder.toString()
    println(str3)

    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString())
}
