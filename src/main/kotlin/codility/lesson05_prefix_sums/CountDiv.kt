/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 * Difficulty: Medium
 */
package codility.lesson05_prefix_sums

class CountDiv {
    fun solution(A: Int, B: Int, K: Int): Int {
        val aCount = A / K
        val bCount = B / K

        return if (A % K == 0) {
            bCount - aCount + 1
        } else {
            bCount - aCount
        }
    }
}
