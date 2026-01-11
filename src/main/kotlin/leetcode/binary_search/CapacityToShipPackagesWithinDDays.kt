/**
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Problem ID: 1011
 * Difficulty: Medium
 */
package leetcode.binary_search

class CapacityToShipPackagesWithinDDays {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var low = 0L
        var high = 0L

        for (w in weights) {
            val x = w.toLong()
            low = maxOf(low, x)
            high += x
        }

        var l = low
        var r = high
        var ans = high

        while (l <= r) {
            val mid = (l + r) / 2
            if (canShip(weights, days, mid)) {
                ans = mid
                r = mid - 1
            } else {
                l = mid + 1
            }
        }

        return ans.toInt()
    }

    private fun canShip(weights: IntArray, days: Int, capacity: Long): Boolean {
        var usedDays = 1
        var cur = 0L

        for (w in weights) {
            val x = w.toLong()
            if (cur + x <= capacity) {
                cur += x
            } else {
                usedDays++
                cur = x
                if (usedDays > days) return false
            }
        }
        return true
    }
}
