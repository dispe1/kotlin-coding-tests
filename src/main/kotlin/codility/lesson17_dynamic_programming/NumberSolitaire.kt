/**
 * https://app.codility.com/programmers/lessons/17-dynamic_programming/number_solitaire/
 * Difficulty: Medium
 */
package codility.lesson17_dynamic_programming

class NumberSolitaire {
    fun solution(A: IntArray): Int {
        val n = A.size
        val dp = IntArray(n) { Int.MIN_VALUE }
        dp[0] = A[0]

        for (i in 1 until n) {
            var bestPrev = Int.MIN_VALUE
            for (k in 1..6) {
                val prev = i - k
                if (prev >= 0) bestPrev = maxOf(bestPrev, dp[prev])
            }
            dp[i] = bestPrev + A[i]
        }

        return dp[n - 1]
    }
}
