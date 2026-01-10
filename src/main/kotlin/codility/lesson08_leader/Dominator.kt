/**
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 * Difficulty: Easy
 */
package codility.lesson08_leader

class Dominator {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n == 0) return -1

        var size = 0
        var candidate = 0

        // Step 1: Find a candidate using Boyer-Moore Voting Algorithm
        for (a in A) {
            if (size == 0) {
                candidate = a
                size = 1
            } else {
                if (candidate == a) {
                    size++
                } else {
                    size--
                }
            }
        }

        // Optimization: If size is 0 after loop, no dominator exists
        if (size == 0) return -1

        // Step 2: Verify if the candidate is actually a dominator
        var count = 0
        var anyIndex = -1
        for (i in A.indices) {
            if (A[i] == candidate) {
                count++
                if (anyIndex == -1) anyIndex = i
            }
        }

        return if (count > n / 2) anyIndex else -1
    }
}
