package app

fun main() {
    val list1 = listOf("Ronaldo", "Messi", "Mbappe")
    val list2 = list1 + "Haaland"
    val list3 = list1 + listOf("Neymar", "Salah", "De Bruyne")
    val list4 = list1 - "Ronaldo"
    val list5 = list1 - listOf("Ronaldo", "Messi")

    println(list2)
    println(list3)
    println(list4)
    println(list5)

    val map1 = mapOf("a" to "Ronaldo", "b" to "Messi")
    val map2 = map1 + mapOf("c" to "Mbappe")
    val map3 = map1 - "a"

    println(map2)
    println(map3)
}