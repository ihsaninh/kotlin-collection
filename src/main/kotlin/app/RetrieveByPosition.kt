package app

fun main() {
    val names: Set<String> = setOf("Ihsan", "Nurul", "Habib")

    println(names.elementAt(0))
    println(names.first())
    println(names.last())
    println(names.elementAtOrNull(10))
    println(names.elementAtOrElse(10) { "Tidak Ada" })
}