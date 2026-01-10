/**
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * Difficulty: Easy
 */
package codility.lesson06_sorting

class Distinct {
    fun solution(A: IntArray): Int {
        if (A.isEmpty()) return 0

        A.sort()

        var count = 1

        for (i in 1 until A.size) {
            if (A[i] != A[i - 1]) count++
        }
        return count
    }
}
