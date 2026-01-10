package codility.lesson06_sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TriangleTest {
    private val solver = Triangle()

    @Test
    fun testExample1() {
        // [10, 2, 5, 1, 8, 20] -> sorted [1, 2, 5, 8, 10, 20]
        // 5 + 8 > 10 (True)
        assertEquals(1, solver.solution(intArrayOf(10, 2, 5, 1, 8, 20)))
    }

    @Test
    fun testExample2() {
        // [10, 50, 5, 1] -> sorted [1, 5, 10, 50]
        // 1+5 > 10 (False), 5+10 > 50 (False)
        assertEquals(0, solver.solution(intArrayOf(10, 50, 5, 1)))
    }

    @Test
    fun testSmallSize() {
        // N < 3
        assertEquals(0, solver.solution(intArrayOf()))
        assertEquals(0, solver.solution(intArrayOf(1)))
        assertEquals(0, solver.solution(intArrayOf(1, 2)))
    }

    @Test
    fun testMaxIntOverflow() {
        // [Int.MAX, Int.MAX, Int.MAX]
        // If not using Long: overflow to negative -> returns 0 (Wrong)
        // With Long: MAX + MAX > MAX -> returns 1 (Correct)
        assertEquals(1, solver.solution(intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE)))
    }

    @Test
    fun testJustNotTriangle() {
        // [2, 2, 4] -> 2 + 2 > 4 (False)
        assertEquals(0, solver.solution(intArrayOf(2, 2, 4)))
    }

    @Test
    fun testJustTriangle() {
        // [2, 2, 3] -> 2 + 2 > 3 (True)
        assertEquals(1, solver.solution(intArrayOf(2, 2, 3)))
    }

    @Test
    fun testNegativeNumbers() {
        // [-10, -5, -2] -> sorted [-10, -5, -2]
        // -10 + -5 = -15. -15 > -2 (False)
        assertEquals(0, solver.solution(intArrayOf(-10, -5, -2)))
    }

    @Test
    fun testMixedNumbers() {
        // [-5, -2, 1, 2, 10] -> sorted [-5, -2, 1, 2, 10]
        // -5+-2 > 1 (F)
        // -2+1 > 2 (F)
        // 1+2 > 10 (F)
        assertEquals(0, solver.solution(intArrayOf(-5, -2, 1, 2, 10)))
    }
}
