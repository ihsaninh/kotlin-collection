package app

fun main() {
    val numbers = (1..100).toList()
    val max = numbers.reduce { acc, i ->
        if (acc > i) acc
        else i
    }
    println(max)

    val min = numbers.reduce { acc, i ->
        if (acc < i) acc
        else i
    }
    println(min)

    val sum = numbers.fold(0) { acc, i ->
        acc + i
    }
    println(sum)

    val names = listOf("Ihsan", "Nurul", "Habib")
    val count = names.fold(0) { acc, i ->
        acc + 1
    }
    println(count)
}