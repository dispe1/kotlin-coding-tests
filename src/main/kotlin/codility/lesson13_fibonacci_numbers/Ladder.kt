/**
 * https://app.codility.com/programmers/lessons/13-fibonacci_numbers/ladder/
 * Difficulty: Medium
 */
package codility.lesson13_fibonacci_numbers

import kotlin.math.max

class Ladder {
    fun solution(A: IntArray, B: IntArray): IntArray {
        val l = A.size
        if (l == 0) return intArrayOf()

        var maxA = 0
        var maxB = 0
        for (i in 0 until l) {
            maxA = max(maxA, A[i])
            maxB = max(maxB, B[i])
        }

        val maskAll = (1 shl maxB) - 1

        val fib = IntArray(maxA + 2)
        fib[0] = 0
        fib[1] = 1

        for (i in 2 until (maxA + 2)) {
            fib[i] = (fib[i - 1] + fib[i - 2]) and maskAll
        }

        val ans = IntArray(l)
        for (i in 0 until l) {
            val mask = (1 shl B[i]) - 1
            ans[i] = fib[A[i] + 1] and mask
        }

        return ans
    }
}
