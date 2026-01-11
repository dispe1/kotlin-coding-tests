/**
 * https://leetcode.com/problems/next-greater-element-i/
 * Difficulty: Easy
 */
package leetcode.stack

import java.util.ArrayDeque

class NextGreaterElementI {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val next = HashMap<Int, Int>()
        val stack = ArrayDeque<Int>()

        for (x in nums2) {
            while (stack.isNotEmpty() && stack.last() < x) {
                val smaller = stack.removeLast()
                next[smaller] = x
            }
            stack.addLast(x)
        }

        val ans = IntArray(nums1.size)
        for (i in nums1.indices) {
            ans[i] = next[nums1[i]] ?: -1
        }

        return ans
    }
}
