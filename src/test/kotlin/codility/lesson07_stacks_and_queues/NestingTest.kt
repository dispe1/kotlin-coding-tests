package codility.lesson07_stacks_and_queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NestingTest {
    private val solver = Nesting()

    @Test
    fun testExampleBalanced() {
        // "(()(())())" -> 1
        assertEquals(1, solver.solution("(()(())())"))
    }

    @Test
    fun testExampleUnbalanced() {
        // "())" -> 0
        assertEquals(0, solver.solution("())"))
    }

    @Test
    fun testEmptyString() {
        // "" -> 1
        assertEquals(1, solver.solution(""))
    }

    @Test
    fun testSingleOpen() {
        // "(" -> 0
        assertEquals(0, solver.solution("("))
    }

    @Test
    fun testSingleClose() {
        // ")" -> 0
        assertEquals(0, solver.solution(")"))
    }

    @Test
    fun testWrongOrder() {
        // ")(" -> 0
        assertEquals(0, solver.solution(")("))
    }

    @Test
    fun testSimpleBalanced() {
        // "()" -> 1
        assertEquals(1, solver.solution("()"))
    }

    @Test
    fun testLongBalanced() {
        val n = 10000
        val sb = StringBuilder()
        for (i in 0 until n) sb.append('(')
        for (i in 0 until n) sb.append(')')
        assertEquals(1, solver.solution(sb.toString()))
    }

    @Test
    fun testLongUnbalanced() {
        val n = 10000
        val sb = StringBuilder()
        for (i in 0 until n) sb.append('(')
        for (i in 0 until n - 1) sb.append(')')
        assertEquals(0, solver.solution(sb.toString()))
    }
}
