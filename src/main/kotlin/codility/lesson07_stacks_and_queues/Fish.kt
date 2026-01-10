/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 * Difficulty: Easy
 */
package codility.lesson07_stacks_and_queues

import java.util.ArrayDeque

class Fish {
    fun solution(A: IntArray, B: IntArray): Int {
        val stack = ArrayDeque<Int>()
        var survivors = 0

        for (i in A.indices) {
            val size = A[i]
            val dir = B[i]

            if (dir == 1) {
                stack.addLast(size)
            } else {
                var alive = true
                while (alive && stack.isNotEmpty()) {
                    val prevSize = stack.peekLast()
                    if (prevSize > size) {
                        alive = false
                    } else {
                        stack.removeLast()
                    }
                }
                if (alive) survivors++
            }
        }

        return survivors + stack.size
    }
}
