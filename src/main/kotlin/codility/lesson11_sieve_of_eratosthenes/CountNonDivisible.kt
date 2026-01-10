/**
 * https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_non_divisible/
 * Difficulty: Medium
 */
package codility.lesson11_sieve_of_eratosthenes

class CountNonDivisible {
    fun solution(A: IntArray): IntArray {
        val n = A.size
        if (n == 0) return intArrayOf()

        val maxVal = 2 * n
        val counts = IntArray(maxVal + 1)
        for (a in A) counts[a]++

        val result = IntArray(n)
        for (i in A.indices) {
            val a = A[i]
            var divCount = 0
            var d = 1
            while (d * d <= a) {
                if (a % d == 0) {
                    divCount += counts[d]
                    val other = a / d
                    if (other != d) divCount += counts[other]
                }
                d++
            }
            result[i] = n - divCount
        }
        return result
    }
}
