/**
 * https://leetcode.com/problems/non-overlapping-intervals/
 * Difficulty: Medium
 */
package leetcode.greedy

class NonOverlappingIntervals {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()) return 0

        intervals.sortWith(compareBy { it[1] })

        var removed = 0
        var prevEnd = intervals[0][1]

        for (i in 1 until intervals.size) {
            val start = intervals[i][0]
            val end = intervals[i][1]

            if (start < prevEnd) {
                removed++
            } else {
                prevEnd = end
            }
        }

        return removed
    }
}
