package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()

    mutableMap.put("a", "Ihsan")
    mutableMap["b"] = "Amelia"

    println(mutableMap["a"])
    println(mutableMap.get("a"))
    println(mutableMap.getOrDefault("d", "Tidak Ada"))

    mutableMap.remove("d")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}