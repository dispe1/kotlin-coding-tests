/**
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
 * Difficulty: Easy
 */
package codility.lesson09_maximum_slice_problem

import kotlin.math.max

class MaxSliceSum {
    fun solution(A: IntArray): Int {
        if (A.isEmpty()) return 0 // Guard clause though problem constraints say N >= 1

        var maxEndingHere = A[0]
        var maxSoFar = A[0]

        for (i in 1 until A.size) {
            // Either extend the previous slice or start a new one at A[i]
            maxEndingHere = max(A[i], maxEndingHere + A[i])
            // Update global maximum
            maxSoFar = max(maxSoFar, maxEndingHere)
        }

        return maxSoFar
    }
}
