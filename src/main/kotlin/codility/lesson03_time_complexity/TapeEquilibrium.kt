/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 * Difficulty: Easy
 */
package codility.lesson03_time_complexity

import kotlin.math.abs
import kotlin.math.min

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        val n = A.size

        var total = 0L
        for (x in A) total += x.toLong()

        var left = 0L
        var best = Long.MAX_VALUE

        // P ranges from 1 to N-1 (both parts must be non-empty)
        // Split is between A[P-1] and A[P]
        for (p in 1 until n) {
            left += A[p - 1].toLong()
            val right = total - left
            val diff = abs(left - right)
            best = min(best, diff)
        }

        return best.toInt()
    }
}
