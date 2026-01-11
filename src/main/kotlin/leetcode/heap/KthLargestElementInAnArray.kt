/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Problem ID: 215
 * Difficulty: Medium
 */
package leetcode.heap

import java.util.PriorityQueue

class KthLargestElementInAnArray {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()

        for (n in nums) {
            pq.offer(n)
            if (pq.size > k) pq.poll()
        }

        return pq.peek()
    }
}
