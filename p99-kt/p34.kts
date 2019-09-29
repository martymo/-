// P34 (**) Calculate Euler's totient function phi(m).
// Euler's so-called totient function phi(m) is defined as the number
// of positive integers r (1 <= r < m) that are coprime to m.
//
// Example: m = 10: r = 1,3,7,9; thus phi(m) = 4. Note the special
// case: phi(1) = 1.
//
// ?- Phi is totient_phi(10).
// Phi = 4
//
// Find out what the value of phi(m) is if m is a prime
// number. Euler's totient function plays an important role in one of
// the most widely used public key cryptography methods (RSA). In this
// exercise you should use the most primitive method to calculate this
// function (there are smarter ways that we shall discuss later).

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

fun phi(m: Int): Int {
    if (m == 1) return 1

    return (1..m - 1).filter { n -> coprime(m, n) }.size
}

println(phi(10))
