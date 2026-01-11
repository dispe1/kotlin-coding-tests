/**
 * https://leetcode.com/problems/fruit-into-baskets/
 * Problem ID: 904
 * Difficulty: Medium
 */
package leetcode.sliding_window

class FruitIntoBaskets {
    fun totalFruit(fruits: IntArray): Int {
        var a = -1
        var b = -1
        var countB = 0
        var window = 0
        var best = 0

        for (x in fruits) {
            window = if (x == a || x == b) {
                window + 1
            } else {
                countB + 1
            }

            if (x == b) {
                countB++
            } else {
                countB = 1
                a = b
                b = x
            }

            if (window > best) best = window
        }

        return best
    }
}
