/**
 * https://leetcode.com/problems/3sum-closest/
 * Problem ID: 16
 * Difficulty: Medium
 */
package leetcode.two_pointers

import kotlin.math.abs

class ThreeSumClosest {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        val n = nums.size

        var closestSum = nums[0] + nums[1] + nums[2]
        var bestDiff = abs(closestSum - target)

        for (i in 0 until n - 2) {
            var left = i + 1
            var right = n - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                val diff = sum - target
                val absDiff = abs(diff)

                if (absDiff < bestDiff) {
                    bestDiff = absDiff
                    closestSum = sum
                }

                when {
                    diff == 0 -> return target
                    diff < 0 -> left++
                    else -> right--
                }
            }
        }

        return closestSum
    }
}
