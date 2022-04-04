package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(setOf("Ihsan", "Nurul"))
    displayCollection(mutableSetOf("Ihsan", "Nurul"))
    displayCollection(listOf("Amelia", "Salas"))
    displayCollection(mutableListOf("Amelia", "Salas"))
    displayCollection(mapOf("Amelia" to "Salas").entries)
    // displayCollection(mapOf("Amelia" to "Salas")) Error, Map bukan turunan Collection
}