/**
 * https://leetcode.com/problems/container-with-most-water/
 * Difficulty: Medium
 */
package leetcode.two_pointers

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var best = 0L

        while (left < right) {
            val h = minOf(height[left], height[right]).toLong()
            val w = (right - left).toLong()
            val area = h * w
            best = maxOf(best, area)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return best.toInt()
    }
}
