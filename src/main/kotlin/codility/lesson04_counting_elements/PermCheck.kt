/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 * Difficulty: Easy
 */
package codility.lesson04_counting_elements

class PermCheck {
    fun solution(A: IntArray): Int {
        val n = A.size
        val seen = BooleanArray(n + 1)

        for (num in A) {
            if (num < 1 || num > n) return 0
            if (seen[num]) return 0
            seen[num] = true
        }

        return 1
    }
}
