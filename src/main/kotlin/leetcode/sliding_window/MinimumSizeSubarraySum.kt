/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * Problem ID: 209
 * Difficulty: Medium
 */
package leetcode.sliding_window

class MinimumSizeSubarraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var sum = 0L
        var best = Int.MAX_VALUE

        for (right in nums.indices) {
            sum += nums[right].toLong()

            while (sum >= target.toLong()) {
                val len = right - left + 1
                best = minOf(best, len)

                sum -= nums[left].toLong()
                left++
            }
        }

        return if (best == Int.MAX_VALUE) 0 else best
    }
}
