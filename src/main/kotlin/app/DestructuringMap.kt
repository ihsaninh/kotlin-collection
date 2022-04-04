package app

fun main() {
    val map = mapOf(
        "a" to "Ihsan",
        "b" to "Nurul",
        "c" to "Habib"
    )
    for ((key, value) in map) {
        println("$key : $value")
    }

    map.forEach { (key, value) -> println("$key : $value") }
    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
}