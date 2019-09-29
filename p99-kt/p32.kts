// P32 (**) Determine the greatest common divisor of two positive integer numbers.
// Use Euclid's algorithm.
// Example:
// ?- gcd(36, 63, G).
// G = 9
// Define gcd as an arithmetic function; so you can use it like this:
// ?- G is gcd(36,63).
// G = 9

fun gcd(a: Int, b: Int): Int {
    if (a < b) return gcd(b, a)

    val remainder = a % b

    return if (remainder == 0) b else gcd(b, remainder)
}

println(gcd(36, 63))
