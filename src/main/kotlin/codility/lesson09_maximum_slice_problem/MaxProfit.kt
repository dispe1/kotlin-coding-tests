/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 * Difficulty: Easy
 */
package codility.lesson09_maximum_slice_problem

import kotlin.math.max

class MaxProfit {
    fun solution(A: IntArray): Int {
        val n = A.size
        // We need at least 2 days to buy and sell
        if (n < 2) return 0

        var maxProfitToday = 0
        var maxProfit = 0

        // Calculate differences between adjacent days and apply Kadane's Algorithm
        // difference[i] = A[i+1] - A[i]
        // We want the maximum sum contiguous subarray of these differences
        for (i in 0 until n - 1) {
            val diff = A[i + 1] - A[i]
            maxProfitToday = max(0, maxProfitToday + diff)
            maxProfit = max(maxProfit, maxProfitToday)
        }

        return maxProfit
    }
}
