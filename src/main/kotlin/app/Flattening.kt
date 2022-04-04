package app

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Ihsan", "Nurul", "Habib"),
        listOf("Ihsan", "Nurul", "Habib"),
        listOf("Ihsan", "Nurul", "Habib"),
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Ucup", listOf("Makan", "Minum")),
        Member("Otong", listOf("Mandi", "Tidur"))
    )

    val hobbies: List<String> = members.flatMap { it.hobbies }
    println(hobbies)
}