package codility.lesson06_sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfDiscIntersectionsTest {
    private val solver = NumberOfDiscIntersections()

    @Test
    fun testExample() {
        assertEquals(11, solver.solution(intArrayOf(1, 5, 2, 1, 4, 0)))
    }

    @Test
    fun testEmptyArray() {
        assertEquals(0, solver.solution(intArrayOf()))
    }

    @Test
    fun testSingleElementZero() {
        assertEquals(0, solver.solution(intArrayOf(0)))
    }

    @Test
    fun testNoIntersectionsAllZero() {
        assertEquals(0, solver.solution(intArrayOf(0, 0, 0, 0, 0)))
    }

    @Test
    fun testTouchingEdgesCountsIntersection() {
        assertEquals(1, solver.solution(intArrayOf(1, 0)))
    }

    @Test
    fun testSeparatedThenTouching() {
        assertEquals(1, solver.solution(intArrayOf(0, 0, 1)))
    }

    @Test
    fun testSimpleIntersections() {
        assertEquals(3, solver.solution(intArrayOf(1, 0, 1)))
    }

    @Test
    fun testLargeRadiusDoesNotOverflow() {
        assertEquals(1, solver.solution(intArrayOf(Int.MAX_VALUE, 0)))
    }

    @Test
    fun testAllIntersectBelowLimit() {
        val n = 2000
        val arr = IntArray(n) { n }
        val expected = n.toLong() * (n - 1) / 2
        assertEquals(expected.toInt(), solver.solution(arr))
    }

    @Test
    fun testExceedLimitReturnsMinusOne() {
        val n = 4473
        val arr = IntArray(n) { n }
        assertEquals(-1, solver.solution(arr))
    }
}
