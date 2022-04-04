package app

fun <T> displayMutableIterable(mutableIterable: MutableIterable<T>) {
    val mutableIterable = mutableIterable.iterator()
    while (mutableIterable.hasNext()) {
        // iterator.remove() // menghapus data di iterasi saat ini
        println(mutableIterable.next())
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Ihsan", "Nurul", "Habib"))
    displayMutableIterable(mutableSetOf("Amelia", "Salas"))
}