/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 * Difficulty: Medium
 */
package codility.lesson05_prefix_sums

class GenomicRangeQuery {
    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
        val n = S.length
        val countA = IntArray(n + 1)
        val countC = IntArray(n + 1)
        val countG = IntArray(n + 1)

        for (i in 0 until n) {
            countA[i + 1] = countA[i] + if (S[i] == 'A') 1 else 0
            countC[i + 1] = countC[i] + if (S[i] == 'C') 1 else 0
            countG[i + 1] = countG[i] + if (S[i] == 'G') 1 else 0
        }

        val answer = IntArray(P.size)

        for (i in P.indices) {
            val start = P[i]
            val end = Q[i] + 1

            if (countA[end] - countA[start] > 0) answer[i] = 1
            else if (countC[end] - countC[start] > 0) answer[i] = 2
            else if (countG[end] - countG[start] > 0) answer[i] = 3
            else answer[i] = 4
        }

        return answer
    }
}
