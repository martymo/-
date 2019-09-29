// P13 (**) Run-length encoding of a list (direct solution).
//
// Implement the so-called run-length encoding data compression method
// directly. I.e. don't explicitly create the sublists containing the
// duplicates, as in problem P09, but only count them. As in problem
// P11, simplify the result list by replacing the singleton terms
// [1,X] by X.

// Example:
// ?- encode_direct([a,a,a,a,b,c,c,a,a,d,e,e,e,e],X).
// X = [[4,a],b,[2,c],[2,a],d,[4,e]]

fun encodeDirect(list: List<Any?>): List<Any?> {
    list.map {

    }
}
