/**
 * https://leetcode.com/problems/next-greater-element-ii/
 * Problem ID: 503
 * Difficulty: Medium
 */
package leetcode.stack

import java.util.ArrayDeque

class NextGreaterElementII {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n) { -1 }
        val stack = ArrayDeque<Int>()

        for (i in 0 until 2 * n) {
            val idx = i % n
            val cur = nums[idx]

            while (stack.isNotEmpty() && nums[stack.last()] < cur) {
                val prevIdx = stack.removeLast()
                ans[prevIdx] = cur
            }

            if (i < n) {
                stack.addLast(idx)
            }
        }

        return ans
    }
}
