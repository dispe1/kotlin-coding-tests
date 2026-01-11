/**
 * https://leetcode.com/problems/maximum-subarray/
 * Difficulty: Medium
 */
package leetcode.dynamic_programming

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var currentSum = nums[0]
        var maxSum = nums[0]

        for (i in 1 until nums.size) {
            val x = nums[i]
            currentSum = maxOf(x, currentSum + x)
            maxSum = maxOf(maxSum, currentSum)
        }

        return maxSum
    }
}
