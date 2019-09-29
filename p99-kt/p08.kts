// P08 (**) Eliminate consecutive duplicates of list elements.
//     If a list contains repeated elements they should be replaced
//     with a single copy of the element. The order of the elements
//     should not be changed.
//     Example:
//     ?- compress([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
// X = [a,b,c,a,d,e]

fun <T> eliminateConsecutiveDuplicates(list: List<T>): List<T> {
    if (list.isEmpty() || list.size == 1) return list

    val head = list.first()
    val tail = list.slice(1..list.size - 1)

    val processedTail = eliminateConsecutiveDuplicates(tail)

    return if (head == tail.first()) processedTail else listOf<T>(head) + processedTail
}

println(eliminateConsecutiveDuplicates(listOf(1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 6)))
