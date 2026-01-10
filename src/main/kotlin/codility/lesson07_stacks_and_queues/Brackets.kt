/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * Difficulty: Easy
 */
package codility.lesson07_stacks_and_queues

import java.util.ArrayDeque

class Brackets {
    fun solution(S: String): Int {
        val stack = ArrayDeque<Char>()

        for (c in S) {
            when (c) {
                '(', '[', '{' -> stack.addLast(c)
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return 0
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return 0
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return 0
            }
        }

        return if (stack.isEmpty()) 1 else 0
    }
}
