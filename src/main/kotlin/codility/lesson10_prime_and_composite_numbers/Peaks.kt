package codility.lesson10_prime_and_composite_numbers

/**
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/peaks/
 * Difficulty: Medium
 */

import kotlin.math.max

class Peaks {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n < 3) return 0

        val isPeak = BooleanArray(n)
        for (i in 1 until n - 1) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                isPeak[i] = true
            }
        }

        val prefix = IntArray(n + 1)
        for (i in A.indices) {
            prefix[i + 1] = prefix[i] + if (isPeak[i]) 1 else 0
        }

        if (prefix[n] == 0) return 0

        var best = 1
        var k = 1
        while (k * k <= n) {
            if (n % k == 0) {
                val k2 = n / k

                if (canPlace(k2, n, prefix)) return k2
                if (canPlace(k, n, prefix)) best = max(k, best)
            }
            k++
        }

        return best
    }

    private fun canPlace(k: Int, n: Int, prefix: IntArray): Boolean {
        if (k <= 0 || n % k != 0) return false

        val blockSize = n / k
        for (b in 0 until k) {
            val left = b * blockSize
            val right = left + blockSize - 1
            if (prefix[right + 1] - prefix[left] == 0) return false
        }
        return true
    }
}
