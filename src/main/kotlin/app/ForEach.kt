package app

fun main() {
    listOf("Ihsan", "Nurul", "Habib").forEach {
        println(it)
    }

    setOf("Amelia", "Salas").forEachIndexed { index, value ->
        println("$index = $value")
    }
}