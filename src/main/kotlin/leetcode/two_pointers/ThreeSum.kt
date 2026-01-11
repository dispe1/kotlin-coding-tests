/**
 * https://leetcode.com/problems/3sum/
 * Problem ID: 15
 * Difficulty: Medium
 */
package leetcode.two_pointers

class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val n = nums.size
        val result = ArrayList<List<Int>>()

        nums.sort()

        for (i in 0 until n - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = n - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))
                        left++
                        right--
                        while (left < right && nums[left] == nums[left - 1]) left++
                        while (left < right && nums[right] == nums[right + 1]) right--
                    }
                    sum < 0 -> left++
                    else -> right--
                }
            }
        }

        return result
    }
}
