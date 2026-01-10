/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 * Difficulty: Medium
 */
package codility.lesson04_counting_elements

class MissingInteger {
    fun solution(A: IntArray): Int {
        val n = A.size
        val seen = BooleanArray(n + 1)

        for (num in A) {
            if (num in 1..n) seen[num] = true
        }

        for (i in 1..n) {
            if (!seen[i]) return i
        }

        return n + 1
    }
}
