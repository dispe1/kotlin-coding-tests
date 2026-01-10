/**
 * https://app.codility.com/programmers/lessons/6-sorting/triangle/
 * Difficulty: Easy
 */
package codility.lesson06_sorting

class Triangle {
    fun solution(A: IntArray): Int {
        val n = A.size

        if (n < 3) return 0

        A.sort()

        for (i in 0 until n - 2) {
            if (A[i].toLong() + A[i + 1].toLong() > A[i + 2].toLong()) return 1
        }

        return 0
    }
}
