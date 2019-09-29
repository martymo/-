// P03 (*) Find the K'th element of a list.
// The first element in the list is number 0.
// Example:
// ?- element_at(X,[a,b,c,d,e],3).
// X = c

tailrec fun <T> elementAt(list: List<T>, index: Int): T? {
    if (list.size <= index) return null

    return if (index == 0) list.first() else elementAt(list.slice(1..list.size - 1), index - 1)
}

println(elementAt(listOf<Int>(), 9))
println(elementAt(listOf<Int>(1), 9))
println(elementAt(listOf<Int>(1), 0))
println(elementAt(listOf<Int>(1, 2, 3), 2))
