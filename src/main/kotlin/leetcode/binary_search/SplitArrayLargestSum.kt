/**
 * https://leetcode.com/problems/split-array-largest-sum/
 * Problem ID: 410
 * Difficulty: Hard
 */
package leetcode.binary_search

class SplitArrayLargestSum {
    fun splitArray(nums: IntArray, k: Int): Int {
        var low = 0L
        var high = 0L

        for (num in nums) {
            val n = num.toLong()
            low = maxOf(low, n)
            high += n
        }

        var l = low
        var r = high
        var ans = high

        while (l <= r) {
            val mid = (l + r) / 2
            if (canSplit(nums, k, mid)) {
                ans = mid
                r = mid - 1
            } else {
                l = mid + 1
            }
        }

        return ans.toInt()
    }

    private fun canSplit(nums: IntArray, k: Int, maxAllowedSum: Long): Boolean {
        var parts = 1
        var sum = 0L
        for (num in nums) {
            val n = num.toLong()
            if (sum + n > maxAllowedSum) {
                parts++
                sum = n
                if (parts > k) return false
            } else {
                sum += n
            }
        }
        return true
    }
}
