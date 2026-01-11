/**
 * https://leetcode.com/problems/daily-temperatures/
 * Problem ID: 739
 * Difficulty: Medium
 */
package leetcode.stack

import java.util.ArrayDeque

class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val ans = IntArray(n)
        val stack = ArrayDeque<Int>()

        for (i in 0 until n) {
            while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
                val prevIdx = stack.removeLast()
                ans[prevIdx] = i - prevIdx
            }
            stack.addLast(i)
        }

        return ans
    }
}
