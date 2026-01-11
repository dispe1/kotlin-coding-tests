/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * Difficulty: Medium
 */
package leetcode.heap

class TopKFrequentElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = HashMap<Int, Int>()
        for (n in nums) {
            freqMap[n] = (freqMap[n] ?: 0) + 1
        }

        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((num, freq) in freqMap) {
            buckets[freq].add(num)
        }

        val result = ArrayList<Int>()
        for (freq in buckets.indices.reversed()) {
            for (num in buckets[freq]) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }

        return result.toIntArray()
    }
}
