/**
 * https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/
 * Difficulty: Medium
 */
package codility.lesson14_binary_search_algorithm

class NailingPlanks {
    fun solution(A: IntArray, B: IntArray, C: IntArray): Int {
        var low = 1
        var high = C.size
        var ans = -1

        while (low <= high) {
            val mid = (low + high) / 2
            if (check(mid, A, B, C)) {
                ans = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return ans
    }

    private fun check(j: Int, A: IntArray, B: IntArray, C: IntArray): Boolean {
        val n = A.size
        var maxPos = 0
        for (i in 0 until j) if (C[i] > maxPos) maxPos = C[i]
        for (i in A.indices) if (B[i] > maxPos) maxPos = B[i]

        val nails = IntArray(maxPos + 1)
        for (i in 0 until j) nails[C[i]] = 1

        val pref = IntArray(maxPos + 1)
        for (i in 1..maxPos) pref[i] = pref[i - 1] + nails[i]

        for (i in 0 until n) {
            val a = A[i]
            val b = B[i]
            if (pref[b] - pref[a - 1] == 0) return false
        }
        return true
    }
}
