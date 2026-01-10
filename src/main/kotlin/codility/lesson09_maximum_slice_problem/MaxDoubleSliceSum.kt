package codility.lesson09_maximum_slice_problem

import kotlin.math.max

class MaxDoubleSliceSum {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n < 3) return 0

        val left = IntArray(n)
        val right = IntArray(n)

        for (i in 1 until n - 1) {
            left[i] = max(0, left[i - 1] + A[i])
        }

        for (i in n - 2 downTo 1) {
            right[i] = max(0, right[i + 1] + A[i])
        }

        var best = 0
        for (y in 1 until n - 1) {
            best = max(best, left[y - 1] + right[y + 1])
        }

        return best
    }
}
