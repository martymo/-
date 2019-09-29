// P01 (*) Find the last element of a list.
//     Example:
//     ?- my_last(X,[a,b,c,d]).
//     X = d

tailrec fun <T> lastElement(list: List<T>): T? {
    return when (list.size) {
        0 -> null
        1 -> list.first()
        else -> lastElement(list.slice(1..list.size - 1))
    }
}

println(lastElement(listOf<Int>()))
println(lastElement(listOf(1, 2, 3, 4)))
println(lastElement(listOf("a", "b")))
