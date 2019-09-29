// P12 (**) Decode a run-length encoded list.
// Given a run-length code list generated as specified in problem
// P11. Construct its uncompressed version.

data class LengthValue(val length: Int, val value: Any?) {
    override fun toString(): String = "[$length, $value]"
}

fun uncompressRunLenghth(list: List<LengthValue>): List<Any?> {
    if (list.isEmpty()) return emptyList<LengthValue>()

    val (length, value) = list.first()

    return (1..length).map { value } + uncompressRunLenghth(
        list.slice(1..list.size - 1)
    )
}

// [[5, 1], [1, 3], [2, 4], [1, 1], [3, 3], [1, 1]]

println(uncompressRunLenghth(listOf(LengthValue(5, 1), LengthValue(3, "a"))))
