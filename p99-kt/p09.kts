//
// P09 (**) Pack consecutive duplicates of list elements into sublists.
//     If a list contains repeated elements they should be placed in
//     separate sublists.
//
//     Example:
//     ?- pack([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
// X = [[a,a,a,a],[b],[c,c],[a,a],[d],[e,e,e,e]]
//

fun packDuplicationsIntoList(list: List<Any?>): List<Any?> {
    if (list.isEmpty()) return list

    val head = list.first()

    val compact = list.takeWhile { it == head }

    return listOf<Any?>(compact) + packDuplicationsIntoList(
        list.slice(compact.size..list.size - 1)
    )
}

println(
    packDuplicationsIntoList(
        listOf(1, 1, 1, 1, 2, 3, 3, 3, 1, 1, 4, 5, 5, 5, 5)
    )
)
