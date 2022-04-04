package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Ihsan"))
    mutableSet.add(Person("Ihsan"))
    mutableSet.add(Person("Amelia"))
    mutableSet.add(Person("Amelia"))
    mutableSet.add(Person("Mai"))

    for (person in mutableSet) {
        println(person)
    }

    val mutableSetString = mutableSetOf("Ucup", "Otong", "Arga")
}