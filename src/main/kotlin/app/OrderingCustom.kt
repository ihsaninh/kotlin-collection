package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits: List<Fruit> = listOf(
        Fruit("Mangga", 10),
        Fruit("Jeruk", 20),
        Fruit("Buah Naga", 5),
    )
    println(fruits.sortedBy { it.quantity })
    println(fruits.sortedByDescending { it.quantity })
    println(fruits.sortedWith(compareBy { it.quantity }))
    println(fruits.sortedWith(compareByDescending { it.quantity }))
    println(fruits.sortedWith { a, b ->
        a.quantity.compareTo(b.quantity)
    })
}