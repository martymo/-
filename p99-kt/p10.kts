// P10 (*) Run-length encoding of a list.
// Use the result of problem P09 to implement the so-called run-length
// encoding data compression method. Consecutive duplicates of
// elements are encoded as terms [N,E] where N is the number of
// duplicates of the element E.

// Example:
// ?- encode([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
// X = [[4,a],[1,b],[2,c],[2,a],[1,d][4,e]]

data class LengthValue<T>(val length: Int, val value: T) {
    override fun toString(): String = "[$length, $value]"
}

fun <T> lengthEncode(list: List<T>): List<LengthValue<T>> {
    if (list.isEmpty()) return emptyList<LengthValue<T>>()

    val head = list.first()

    val compact = list.takeWhile { it == head }

    val lengthValue = LengthValue<T>(compact.size, head)

    return listOf(lengthValue) + lengthEncode(
        list.slice(compact.size..list.size - 1)
    )
}

println(lengthEncode(listOf(1, 1, 1, 1, 1, 3, 4, 4, 1, 3, 3, 3, 1)))
