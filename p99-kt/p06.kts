// P06 (*) Find out whether a list is a palindrome.
//     A palindrome can be read forward or backward; e.g. [x,a,m,a,x].

fun <T> isPalindrome(list: List<T>): Boolean {
    if (list.isEmpty() || list.size == 1) return true

    return list.first() == list.last() && isPalindrome(list.slice(1..list.size - 2))
}

println(isPalindrome(listOf(1, 2, 1)))
println(isPalindrome(listOf(1, 2, 2, 1)))
println(isPalindrome(listOf(1, 2, 3, 1)))
