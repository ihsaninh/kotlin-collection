package app

fun main() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val wordsSequence = words.asSequence()
    val lengthSequence = wordsSequence
        .filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.toUpperCase() }
        .take(4)

    println("Length of first 4 words longer than 3 chars:")
    println(lengthSequence.toList())
}