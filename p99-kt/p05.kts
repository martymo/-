fun <T> reverseList(list: List<T>): List<T> {
    list.isEmpty() && return list

    val head = list.first()
    val tail = list.slice(1..list.size - 1)
    val reversedTail = reverseList(tail)

    return reversedTail + listOf(head)
}

println(reverseList(listOf(1, 2, 3)))
println(reverseList(listOf<Int>()))
