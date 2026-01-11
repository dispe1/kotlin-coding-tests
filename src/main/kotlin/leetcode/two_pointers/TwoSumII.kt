/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Difficulty: Medium
 */
package leetcode.two_pointers

class TwoSumII {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right) {
            val sum = numbers[left] + numbers[right]

            when {
                sum == target -> {
                    return intArrayOf(left + 1, right + 1)
                }
                sum < target -> {
                    left++
                }
                else -> {
                    right--
                }
            }
        }

        return intArrayOf()
    }
}
