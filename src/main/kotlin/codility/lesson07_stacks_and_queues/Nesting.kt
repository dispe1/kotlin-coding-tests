/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 * Difficulty: Easy
 */
package codility.lesson07_stacks_and_queues

import java.util.ArrayDeque

class Nesting {
    fun solution(S: String): Int {
        val stack = ArrayDeque<Char>()

        for (c in S) {
            if (c == '(') {
                stack.addLast(c)
            } else {
                if (stack.isEmpty() || stack.removeLast() != '(') return 0
            }
        }

        return if (stack.isEmpty()) 1 else 0
    }
}
