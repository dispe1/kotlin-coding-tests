/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 * Problem ID: 84
 * Difficulty: Hard
 */
package leetcode.stack

import java.util.ArrayDeque
import kotlin.math.max

class LargestRectangleInHistogram {

    fun solution(heights: IntArray): Int {
        val n = heights.size
        if (n == 0) return 0

        val h = IntArray(n + 1)
        for (i in 0 until n) h[i] = heights[i]
        h[n] = 0

        val stack = ArrayDeque<Int>()
        var best = 0L

        for (i in 0..n) {
            while (stack.isNotEmpty() && h[stack.last()] > h[i]) {
                val height = h[stack.removeLast()].toLong()
                val leftLessIndex = if (stack.isNotEmpty()) stack.last() else -1
                val width = (i - leftLessIndex - 1).toLong()
                best = maxOf(best, height * width)
            }
            stack.addLast(i)
        }

        return best.toInt()
    }
}
