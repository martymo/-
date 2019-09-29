// P02 (*) Find the last but one element of a list.
// (zweitletztes Element, l'avant-dernier élément)

tailrec fun <T> lastElementButOne(list: List<T>): T? {
    return when (list.size) {
        0, 1 -> null
        2 -> list.first()
        else -> lastElementButOne(list.slice(1..list.size - 1))
    }
}

println(lastElementButOne(listOf<Int>()))
println(lastElementButOne(listOf(1)))
println(lastElementButOne(listOf(1, 2, 3, 4)))
