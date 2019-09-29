// P14 (*) Duplicate the elements of a list.
// Example:
// ?- dupli([a,b,c,c,d],X).
// X = [a,a,b,b,c,c,c,c,d,d]

fun duplicateElements(list: List<Any?>): List<Any?> {
    if (list.isEmpty()) return list

    return listOf(list.first(), list.first()) + duplicateElements(
        list.slice(1..list.size - 1)
    )
}

println(duplicateElements(listOf(1, 2, 3, 4, 4, 5)))
