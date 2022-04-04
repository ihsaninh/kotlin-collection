package app

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Ihsan" to "Nurul",
        "Amelia" to "Salas"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}