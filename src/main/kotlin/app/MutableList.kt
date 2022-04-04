package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Ihsan")
    mutableList.add("Amel")

    println(mutableList[0])
    println(mutableList[1])

    for (value in mutableList) {
        println(value)
    }
}