// P33 (*) Determine whether two positive integer numbers are coprime.
// Two numbers are coprime if their greatest common divisor equals 1.
// Example:
// ?- coprime(35, 64).
// Yes

fun coprime(a: Int, b: Int): Boolean {
    if (a < b) return coprime(b, a)

    if (b == 1) return true

    val remainder = a % b

    return when (remainder) {
        0 -> false
        1 -> true
        else -> coprime(remainder, b)
    }
}

println(coprime(35, 64))
println(coprime(35, 1))
