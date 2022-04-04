package app

fun main() {
    val map = mapOf("a" to "Ihsan", "b" to "And", "c" to "Amelia")
    println(map.getValue("a"))
    println(map.getOrElse("d") { "Ups! Ga ada" })
    println(map.filter { (_, value) -> value.length > 5 })
    println(map.filterKeys { it.length > 5 })
    println(map.filterValues { it.length > 5 })
}