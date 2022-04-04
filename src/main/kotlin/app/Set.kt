package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Ucup"),
        Person("Ucup"),
        Person("Ucup"),
        Person("Ihsan"),
        Person("Ucup"),
        Person("Amelia"),
        Person("Otong"),
    )

    println(set.size)
    println(set.contains(Person("Ihsan")))

    for (person in set) {
        println(person)
    }
}