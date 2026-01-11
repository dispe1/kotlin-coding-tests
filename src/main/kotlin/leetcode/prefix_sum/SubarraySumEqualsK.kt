/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * Difficulty: Medium
 */
package leetcode.prefix_sum

class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val countMap = HashMap<Long, Int>()
        countMap[0L] = 1

        var sum = 0L
        var answer = 0

        for (num in nums) {
            sum += num.toLong()

            val need = sum - k.toLong()
            answer += countMap[need] ?: 0

            countMap[sum] = (countMap[sum] ?: 0) + 1
        }

        return answer
    }
}
