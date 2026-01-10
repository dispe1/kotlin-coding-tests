/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
 * Difficulty: Medium
 */
package codility.lesson05_prefix_sums

class MinAvgTwoSlice {
    fun solution(A: IntArray): Int {
        val n = A.size
        var minAvg = Double.MAX_VALUE
        var minIdx = 0

        for (i in 0 until n - 1) {
            val avg2 = (A[i] + A[i + 1]) / 2.0

            if (avg2 < minAvg) {
                minAvg = avg2
                minIdx = i
            }

            if (i < n - 2) {
                val avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0

                if (avg3 < minAvg) {
                    minAvg = avg3
                    minIdx = i
                }
            }
        }

        return minIdx
    }
}
