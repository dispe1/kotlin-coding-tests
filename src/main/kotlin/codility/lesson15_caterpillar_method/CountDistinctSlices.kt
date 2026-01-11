/**
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/
 * Difficulty: Medium
 */
package codility.lesson15_caterpillar_method

class CountDistinctSlices {
    private val limit = 1_000_000_000

    fun solution(M: Int, A: IntArray): Int {
        val n = A.size
        if (n == 0) return 0

        val seen = BooleanArray(M + 1)
        var left = 0
        var right = 0
        var ans = 0

        while (left < n) {
            while (right < n && !seen[A[right]]) {
                seen[A[right]] = true
                ans += right - left + 1
                if (ans >= limit) return limit
                right++
            }
            seen[A[left]] = false
            left++
        }

        return ans
    }
}
