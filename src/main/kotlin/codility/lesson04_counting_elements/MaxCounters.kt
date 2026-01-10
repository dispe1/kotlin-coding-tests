/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 * Difficulty: Medium
 */
package codility.lesson04_counting_elements

class MaxCounters {
    fun solution(N: Int, A: IntArray): IntArray {
        val counters = IntArray(N)
        var currentMax = 0
        var lastMax = 0

        for (op in A) {
            if (op in 1..N) {
                if (counters[op - 1] < lastMax) {
                    counters[op - 1] = lastMax
                }

                counters[op - 1]++

                if (counters[op - 1] > currentMax) {
                    currentMax = counters[op - 1]
                }
            } else if (op == N + 1) {
                lastMax = currentMax
            }
        }

        for (i in counters.indices) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax
            }
        }

        return counters
    }
}
