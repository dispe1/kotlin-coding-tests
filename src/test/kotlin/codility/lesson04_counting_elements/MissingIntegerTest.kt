package codility.lesson04_counting_elements

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MissingIntegerTest {
    private val solver = MissingInteger()

    @Test
    fun testExample1() {
        // [1, 3, 6, 4, 1, 2] -> 1, 2, 3, 4 present -> missing 5
        assertEquals(5, solver.solution(intArrayOf(1, 3, 6, 4, 1, 2)))
    }

    @Test
    fun testExample2() {
        // [1, 2, 3] -> 1, 2, 3 present -> missing 4
        assertEquals(4, solver.solution(intArrayOf(1, 2, 3)))
    }

    @Test
    fun testExample3() {
        // [-1, -3] -> No positive integers -> missing 1
        assertEquals(1, solver.solution(intArrayOf(-1, -3)))
    }

    @Test
    fun testSingleElementMissingOne() {
        // [2] -> missing 1
        assertEquals(1, solver.solution(intArrayOf(2)))
    }

    @Test
    fun testSingleElementOne() {
        // [1] -> missing 2
        assertEquals(2, solver.solution(intArrayOf(1)))
    }

    @Test
    fun testOnlyNegativeNumbers() {
        // [-1000, -1] -> missing 1
        assertEquals(1, solver.solution(intArrayOf(-1000, -1)))
    }

    @Test
    fun testMissingFirstPositive() {
        // [2, 3, 4, 5] -> missing 1
        assertEquals(1, solver.solution(intArrayOf(2, 3, 4, 5)))
    }

    @Test
    fun testAllPresent() {
        // [1, 2, 3, 4, 5] -> missing 6
        assertEquals(6, solver.solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun testWithDuplicates() {
        // [1, 1, 2, 2, 4] -> 1, 2, 4 present -> missing 3
        assertEquals(3, solver.solution(intArrayOf(1, 1, 2, 2, 4)))
    }

    @Test
    fun testLargeInput() {
        // N = 100,000
        // [1, 2, ..., 100,000] -> missing 100,001
        val n = 100000
        val a = IntArray(n) { it + 1 }
        assertEquals(100001, solver.solution(a))
    }

    @Test
    fun testLargeInputMissingOne() {
        // N = 100,000
        // [2, 3, ..., 100,001] -> missing 1
        val n = 100000
        val a = IntArray(n) { it + 2 }
        assertEquals(1, solver.solution(a))
    }
}
