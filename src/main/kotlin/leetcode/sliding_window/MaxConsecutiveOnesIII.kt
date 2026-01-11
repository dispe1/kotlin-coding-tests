/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 * Problem ID: 1004
 * Difficulty: Medium
 */
package leetcode.sliding_window

class MaxConsecutiveOnesIII {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var zeroCount = 0
        var best = 0

        for (right in nums.indices) {
            if (nums[right] == 0) zeroCount++

            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--
                left++
            }

            val length = right - left + 1
            if (length > best) best = length
        }

        return best
    }
}
