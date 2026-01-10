/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 * Difficulty: Easy
 */
package codility.lesson03_time_complexity

class PermMissingElem {
    fun solution(A: IntArray): Int {
        val n = A.size
        // Sum of 1..(N+1) = (N+1)(N+2)/2
        val total = (n.toLong() + 1) * (n.toLong() + 2) / 2
        var sum = 0L
        for (x in A) sum += x.toLong()
        return (total - sum).toInt()
    }
}
