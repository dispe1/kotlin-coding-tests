/**
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/min_abs_sum_of_two/
 * Difficulty: Medium
 */
package codility.lesson15_caterpillar_method

import kotlin.math.abs
import kotlin.math.min

class MinAbsSumOfTwo {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n == 0) return 0

        A.sort()
        var left = 0
        var right = n - 1
        var minAbs = Int.MAX_VALUE

        while (left <= right) {
            val sum = A[left] + A[right]
            val absSum = abs(sum)
            minAbs = min(minAbs, absSum)

            when {
                sum > 0 -> right--
                sum < 0 -> left++
                else -> return 0
            }
        }

        return minAbs
    }
}
