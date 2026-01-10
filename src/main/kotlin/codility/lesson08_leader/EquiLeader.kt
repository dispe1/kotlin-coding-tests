/**
 * https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 * Difficulty: Easy
 */
package codility.lesson08_leader

class EquiLeader {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n == 0) return 0

        var size = 0
        var leader = 0

        // Step 1: Find leader candidate
        for (a in A) {
            if (size == 0) {
                leader = a
                size = 1
            } else {
                if (a == leader) size++ else size--
            }
        }

        // Optimization: If stack size is 0, no leader exists
        if (size == 0) return 0

        // Step 2: Calculate total occurrences of the leader
        var totalCount = 0
        for (a in A) {
            if (a == leader) totalCount++
        }

        // Must occur more than n/2 times
        if (totalCount <= n / 2) return 0

        // Step 3: Count EquiLeaders
        var equi = 0
        var leftCount = 0
        
        // Loop through all possible split points (S) from 0 to n-2
        // Sequence: [0..S], [S+1..n-1]
        for (s in 0 until n - 1) {
            if (A[s] == leader) leftCount++

            val leftLen = s + 1
            val rightLen = n - leftLen
            val rightCount = totalCount - leftCount

            if (leftCount > leftLen / 2 && rightCount > rightLen / 2) {
                equi++
            }
        }

        return equi
    }
}
