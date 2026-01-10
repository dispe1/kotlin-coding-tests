package codility.lesson07_stacks_and_queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BracketsTest {
    private val solver = Brackets()

    @Test
    fun testExampleBalanced() {
        // "{[()()]}" -> Balanced -> 1
        assertEquals(1, solver.solution("{[()()]}"))
    }

    @Test
    fun testExampleUnbalanced() {
        // "([)()]" -> Not balanced -> 0
        assertEquals(0, solver.solution("([)()]"))
    }

    @Test
    fun testEmptyString() {
        // "" -> Empty is balanced -> 1
        assertEquals(1, solver.solution(""))
    }

    @Test
    fun testSingleOpen() {
        // "(" -> Not balanced -> 0
        assertEquals(0, solver.solution("("))
        // "[" -> Not balanced -> 0
        assertEquals(0, solver.solution("["))
        // "{" -> Not balanced -> 0
        assertEquals(0, solver.solution("{"))
    }

    @Test
    fun testSingleClose() {
        // ")" -> Not balanced -> 0
        assertEquals(0, solver.solution(")"))
        // "]" -> Not balanced -> 0
        assertEquals(0, solver.solution("]"))
        // "}" -> Not balanced -> 0
        assertEquals(0, solver.solution("}"))
    }

    @Test
    fun testSimpleBalanced() {
        // "()" -> 1
        assertEquals(1, solver.solution("()"))
        // "[]" -> 1
        assertEquals(1, solver.solution("[]"))
        // "{}" -> 1
        assertEquals(1, solver.solution("{}"))
    }

    @Test
    fun testWrongOrder() {
        // ")(" -> 0
        assertEquals(0, solver.solution(")("))
        // "][" -> 0
        assertEquals(0, solver.solution("]["))
        // "}{" -> 0
        assertEquals(0, solver.solution("}{"))
    }

    @Test
    fun testNestedMixed() {
        // "{[()]}" -> 1
        assertEquals(1, solver.solution("{[()]}"))
        // "{{{}}}" -> 1
        assertEquals(1, solver.solution("{{{}}}"))
    }

    @Test
    fun testMismatch() {
        // "(]" -> 0
        assertEquals(0, solver.solution("(]"))
        // "[}" -> 0
        assertEquals(0, solver.solution("[}"))
        // "{)" -> 0
        assertEquals(0, solver.solution("{)"))
    }

    @Test
    fun testLongBalanced() {
        // N = 200,000 is limit. Create a long string.
        val sb = StringBuilder()
        for (i in 0 until 10000) sb.append('(')
        for (i in 0 until 10000) sb.append(')')
        assertEquals(1, solver.solution(sb.toString()))
    }

    @Test
    fun testLongUnbalanced() {
        // 10000 '(' and 9999 ')'
        val sb = StringBuilder()
        for (i in 0 until 10000) sb.append('(')
        for (i in 0 until 9999) sb.append(')')
        assertEquals(0, solver.solution(sb.toString()))
    }
}
