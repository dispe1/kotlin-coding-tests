package codility.lesson06_sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfDiscIntersectionsTest {
    private val solver = NumberOfDiscIntersections()

    @Test
    fun testExample1() {
        // [1, 5, 2, 1, 4, 0] -> 11 pairs
        assertEquals(11, solver.solution(intArrayOf(1, 5, 2, 1, 4, 0)))
    }

    @Test
    fun testEmptyArray() {
        // [] -> 0
        assertEquals(0, solver.solution(intArrayOf()))
    }

    @Test
    fun testSingleElement() {
        // [0] -> 0
        assertEquals(0, solver.solution(intArrayOf(0)))
    }

    @Test
    fun testNoIntersections() {
        // [0, 0, 0, 0, 0] -> all disjoint points
        assertEquals(0, solver.solution(intArrayOf(0, 0, 0, 0, 0)))
    }

    @Test
    fun testTouchingEdges() {
        // [1, 0] -> Disc 0: [0-1, 0+1]=[-1, 1], Disc 1: [1-0, 1+0]=[1, 1]
        // Intersect at 1. Count = 1
        assertEquals(1, solver.solution(intArrayOf(1, 0)))
    }

    @Test
    fun testSeparatedThenTouching() {
        // [0, 0, 1] -> Disc 0: [0,0], Disc 1: [1,1], Disc 2: [1,3]
        // Disc 0 & 1: No
        // Disc 0 & 2: No
        // Disc 1 & 2: Yes (at 1). Count = 1
        assertEquals(1, solver.solution(intArrayOf(0, 0, 1)))
    }

    @Test
    fun testSimpleIntersections() {
        // [1, 0, 1] -> Disc 0: [-1, 1], Disc 1: [1, 1], Disc 2: [1, 3]
        // 0-1 (touch at 1) -> Yes
        // 0-2 (touch at 1) -> Yes
        // 1-2 (touch at 1) -> Yes
        // Total 3
        assertEquals(3, solver.solution(intArrayOf(1, 0, 1)))
    }

    @Test
    fun testLargeRadiusOverflow() {
        // [MAX, 0] -> Disc 0 covers everything. Disc 1 is inside.
        // Intersect = 1.
        // Check for long overflow in calculation (i + A[i])
        assertEquals(1, solver.solution(intArrayOf(Int.MAX_VALUE, 0)))
    }

    @Test
    fun testLargeInputBelowLimit() {
        // n = 2000, all radii = 2000. All pairs intersect.
        // Pairs = 2000 * 1999 / 2 = 1,999,000 < 10,000,000
        val n = 2000
        val arr = IntArray(n) { n }
        val expected = n.toLong() * (n - 1) / 2
        assertEquals(expected.toInt(), solver.solution(arr))
    }

    @Test
    fun testExceedLimit() {
        // n = 4473. Pairs = 4473 * 4472 / 2 = 10,005,628 > 10,000,000
        // Should return -1
        val n = 4473
        val arr = IntArray(n) { n }
        assertEquals(-1, solver.solution(arr))
    }
}
