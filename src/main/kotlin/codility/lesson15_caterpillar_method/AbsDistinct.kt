/**
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
 * Difficulty: Medium
 */
package codility.lesson15_caterpillar_method

import kotlin.math.abs

class AbsDistinct {
    fun solution(A: IntArray): Int {
        var left = 0
        var right = A.size - 1
        var count = 0
        var lastAbs = -1

        while (left <= right) {
            val leftAbs = abs(A[left])
            val rightAbs = abs(A[right])

            val current = when {
                leftAbs > rightAbs -> {
                    left++
                    leftAbs
                }
                leftAbs < rightAbs -> {
                    right--
                    rightAbs
                }
                else -> {
                    left++
                    right--
                    leftAbs
                }
            }

            if (current != lastAbs) {
                count++
                lastAbs = current
            }
        }

        return count
    }
}
