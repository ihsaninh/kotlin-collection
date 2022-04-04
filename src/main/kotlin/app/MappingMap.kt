package app

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Ihsan",
        2 to "Nurul",
        3 to "Habib"
    )
    val mapKeys = map.mapKeys { it.key * 100 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}