/**
 * https://app.codility.com/programmers/lessons/16-greedy_algorithms/tie_ropes/
 * Difficulty: Easy
 */
package codility.lesson16_greedy_algorithms

class TieRopes {
    fun solution(K: Int, A: IntArray): Int {
        var count = 0
        var sum = 0

        for (len in A) {
            sum += len
            if (sum >= K) {
                count++
                sum = 0
            }
        }

        return count
    }
}
