/**
 * https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 * Problem ID: 1283
 * Difficulty: Medium
 */
package leetcode.binary_search

class FindTheSmallestDivisorGivenAThreshold {
    fun smallestDivisor(nums: IntArray, threshold: Int): Int {
        var low = 1
        var high = 0
        for (x in nums) {
            high = maxOf(high, x)
        }

        var ans = high
        var l = low
        var r = high

        while (l <= r) {
            val mid = (l + r) / 2
            if (canMakeSumWithin(nums, threshold, mid)) {
                ans = mid
                r = mid - 1
            } else {
                l = mid + 1
            }
        }

        return ans
    }

    private fun canMakeSumWithin(nums: IntArray, threshold: Int, d: Int): Boolean {
        var sum = 0L
        for (x in nums) {
            sum += (x + d - 1) / d
            if (sum > threshold) return false
        }
        return true
    }
}
