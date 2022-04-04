package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Ihsan"),
        "b" to "and",
        "c" to "Amelia"
    )

    println(map.size)
    for ((key, value) in map) {
        println("$key to $value")
    }
}