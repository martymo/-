// P16 (**) Drop every N'th element from a list.
// Example:
// ?- drop([a,b,c,d,e,f,g,h,i,k],3,X).
// X = [a,b,d,e,g,h,k]

tailrec fun dropEveryElement(list: List<Any?>, n: Int): List<Any?> {
    if (list.size < n) return list

    return list.take(n - 1) + dropEveryElement(list.slice(n..list.size - 1), n)
}

println(dropEveryElement(listOf(6, 7), 3))
println(dropEveryElement(listOf(1, 2, 3, 4, 5, 3, 6, 7), 3))
