/**
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/flags/
 * Difficulty: Medium
 */
package codility.lesson10_prime_and_composite_numbers

class Flags {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n < 3) return 0

        val isPeak = BooleanArray(n)
        var peaksCount = 0
        for (i in 1 until n - 1) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                isPeak[i] = true
                peaksCount++
            }
        }
        if (peaksCount <= 1) return peaksCount

        val nextPeak = IntArray(n)
        var next = -1
        for (i in n - 1 downTo 0) {
            if (isPeak[i]) next = i
            nextPeak[i] = next
        }

        var limit = 1
        while (limit * limit <= n) limit++
        if (limit > peaksCount) limit = peaksCount

        var best = 1
        for (k in 2..limit) if (canPlace(k, n, nextPeak)) best = k

        return best
    }

    private fun canPlace(k: Int, n: Int, nextPeak: IntArray): Boolean {
        var flags = 0
        var pos = 0
        while (flags < k) {
            if (pos >= n) return false
            pos = nextPeak[pos]
            if (pos == -1) return false
            flags++
            pos += k
        }
        return true
    }
}
