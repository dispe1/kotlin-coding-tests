/**
 * https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/
 * Difficulty: Medium
 */
package codility.lesson14_binary_search_algorithm

import kotlin.math.max

class MinMaxDivision {
    fun solution(K: Int, M: Int, A: IntArray): Int {
        val n = A.size
        if (n == 0) return 0

        var maxA = 0
        var sum = 0
        for (i in 0 until n) {
            val v = A[i]
            maxA = max(maxA, v)
            sum += v
        }

        var low = maxA
        var high = sum
        var ans = high

        while (low <= high) {
            val mid = (low + high) / 2
            if (canDivide(mid, A, K)) {
                ans = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return ans
    }

    private fun canDivide(limit: Int, A: IntArray, K: Int): Boolean {
        var blocks = 1
        var cur = 0

        for (a in A) {
            if (cur + a > limit) {
                blocks++
                cur = a
                if (blocks > K) return false
            } else {
                cur += a
            }
        }
        return true
    }
}
