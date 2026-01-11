/**
 * https://leetcode.com/problems/koko-eating-bananas/
 * Problem ID: 875
 * Difficulty: Medium
 */
package leetcode.binary_search

class KokoEatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var low = 1
        var high = 0
        for (p in piles) {
            high = maxOf(high, p)
        }

        var ans = high
        var l = low
        var r = high

        while (l <= r) {
            val mid = (l + r) / 2
            if (canFinish(piles, h, mid)) {
                ans = mid
                r = mid - 1
            } else {
                l = mid + 1
            }
        }

        return ans
    }

    private fun canFinish(piles: IntArray, h: Int, k: Int): Boolean {
        var hours = 0L
        for (p in piles) {
            hours += (p + k - 1) / k
            if (hours > h) return false
        }
        return true
    }
}
