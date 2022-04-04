package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    val map = mapOf(
        "name" to "Bejalar kotlin",
        "version" to 1
    )

    val application = Application(map)
    println(application.name)
    println(application.version)
}