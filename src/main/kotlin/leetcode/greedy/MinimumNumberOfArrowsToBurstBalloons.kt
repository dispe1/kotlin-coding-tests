/**
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 * Difficulty: Medium
 */
package leetcode.greedy

class MinimumNumberOfArrowsToBurstBalloons {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.isEmpty()) return 0

        points.sortWith(compareBy { it[1] })

        var arrows = 1
        var arrowPos = points[0][1].toLong()

        for (i in 1 until points.size) {
            val start = points[i][0].toLong()
            val end = points[i][1].toLong()

            if (start > arrowPos) {
                arrows++
                arrowPos = end
            }
        }

        return arrows
    }
}
