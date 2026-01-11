/**
 * https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
 * Difficulty: Easy
 */
package codility.lesson16_greedy_algorithms

class MaxNonoverlappingSegments {
    fun solution(A: IntArray, B: IntArray): Int {
        val n = A.size
        if (n == 0) return 0

        var count = 1
        var end = B[0]

        for (i in 1 until n) {
            if (A[i] > end) {
                count++
                end = B[i]
            }
        }

        return count
    }
}
