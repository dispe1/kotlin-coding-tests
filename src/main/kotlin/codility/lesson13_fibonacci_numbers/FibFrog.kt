/**
 * https://app.codility.com/programmers/lessons/13-fibonacci_numbers/fib_frog/
 * Difficulty: Medium
 */
package codility.lesson13_fibonacci_numbers

import java.util.ArrayDeque

class FibFrog {
    fun solution(A: IntArray): Int {
        val n = A.size

        val fibs = ArrayList<Int>()
        fibs.add(1)
        fibs.add(2)
        while (true) {
            val next = fibs[fibs.size - 1] + fibs[fibs.size - 2]
            if (next > n + 1) break
            fibs.add(next)
        }

        val dist = IntArray(n + 1) { -1 }
        val q: ArrayDeque<Int> = ArrayDeque()

        for (f in fibs) {
            val nextPos = -1 + f
            if (nextPos == n) return 1
            if (nextPos in 0 until n && A[nextPos] == 1 && dist[nextPos] == -1) {
                dist[nextPos] = 1
                q.addLast(nextPos)
            }
        }

        while (q.isNotEmpty()) {
            val pos = q.removeFirst()
            val cur = dist[pos]

            for (f in fibs) {
                val nextPos = pos + f
                if (nextPos == n) return cur + 1
                if (nextPos !in 0 until n) continue
                if (A[nextPos] == 0) continue
                if (dist[nextPos] != -1) continue

                dist[nextPos] = cur + 1
                q.addLast(nextPos)
            }
        }

        return -1
    }
}
