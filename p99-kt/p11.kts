// P11 (*) Modified run-length encoding.
// Modify the result of problem P10 in such a way that if an element
// has no duplicates it is simply copied into the result list. Only
// elements with duplicates are transferred as [N,E] terms.

// Example:
// ?- encode_modified([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
// X = [[4,a],b,[2,c],[2,a],d,[4,e]]

data class LengthValue(val length: Int, val value: Any) {
    override fun toString(): String = "[$length, $value]"
}

fun lengthEncode(list: List<Any?>): List<Any?> {
    if (list.isEmpty()) return list

    val head = list.first()

    val compact = list.takeWhile { it == head }

    val lengthValue = if (compact.size == 1) head else LengthValue(compact.size, head)

    return listOf(lengthValue) + lengthEncode(
        list.slice(compact.size..list.size - 1)
    )
}

println(lengthEncode(listOf(1, 1, 1, 1, 1, 3, 4, 4, 1, 3, 3, 3, 1)))
