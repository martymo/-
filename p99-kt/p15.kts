// P15 (**) Duplicate the elements of a list a given number of times.
// Example:
// ?- dupli([a,b,c],3,X).
// X = [a,a,a,b,b,b,c,c,c]

// What are the results of the goal:
// ?- dupli(X,3,Y).

fun duplicateElementsBy(list: List<Any?>, times: Int): List<Any?> {
    if (list.isEmpty()) return list

    return (1..times).map { list.first() } + duplicateElements(
        list.slice(1..list.size - 1)
    )
}

println(duplicateElementsBy(listOf(1, 2, 3, 4, 4, 5), 3))
