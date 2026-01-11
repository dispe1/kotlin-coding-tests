/**
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/
 * Difficulty: Medium
 */
package codility.lesson12_euclidean_algorithm

class CommonPrimeDivisors {
    fun solution(A: IntArray, B: IntArray): Int {
        var count = 0

        for (i in A.indices) {
            val a = A[i]
            val b = B[i]

            val ra = removeCommonPrimes(a, b)
            val rb = removeCommonPrimes(b, a)

            if (ra == 1 && rb == 1) count++
        }

        return count
    }

    private fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val r = x % y
            x = y
            y = r
        }
        return x
    }

    private fun removeCommonPrimes(x: Int, y: Int): Int {
        var v = x
        var g = gcd(v, y)
        while (g > 1) {
            v /= g
            g = gcd(v, y)
        }
        return v
    }
}
