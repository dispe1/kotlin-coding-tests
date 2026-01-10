/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
 * Difficulty: Easy
 */
package codility.lesson07_stacks_and_queues

import java.util.ArrayDeque

class StoneWall {
    fun solution(H: IntArray): Int {
        val stack = ArrayDeque<Int>()
        var blocks = 0

        for (h in H) {
            while (stack.isNotEmpty() && stack.peekLast() > h) {
                stack.removeLast()
            }

            if(stack.isEmpty() || stack.peekLast() < h) {
                stack.addLast(h)
                blocks++
            }
        }

        return blocks
    }
}
