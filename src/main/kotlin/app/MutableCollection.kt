package app

fun <T> displayMutableCollection(mutableCollection: MutableCollection<T>) {
    for (element in mutableCollection) {
        println(element)
    }
}

fun main() {
    // displayMutableCollection(setOf("Ihsan", "Nurul")) // Error
    displayMutableCollection(mutableSetOf("Ihsan", "Nurul"))
    // displayMutableCollection(listOf("Amelia", "Salas")) // Error
    displayMutableCollection(mutableListOf("Amelia", "Salas"))
    // displayMutableCollection(mapOf("Amelia" to "Salas").entries)
     displayMutableCollection(mutableMapOf("Amelia" to "Salas").entries)
}