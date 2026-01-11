package leetcode.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumNumberOfArrowsToBurstBalloonsTest {
    private val solver = MinimumNumberOfArrowsToBurstBalloons()

    @Test
    fun `example case`() {
        val points = arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))
        assertEquals(2, solver.findMinArrowShots(points))
    }

    @Test
    fun `single balloon`() {
        val points = arrayOf(intArrayOf(1, 2))
        assertEquals(1, solver.findMinArrowShots(points))
    }

    @Test
    fun `empty input`() {
        val points = emptyArray<IntArray>()
        assertEquals(0, solver.findMinArrowShots(points))
    }

    @Test
    fun `all overlapping`() {
        val points = arrayOf(intArrayOf(1, 5), intArrayOf(2, 6), intArrayOf(3, 7))
        assertEquals(1, solver.findMinArrowShots(points))
    }

    @Test
    fun `disjoint intervals`() {
        val points = arrayOf(intArrayOf(1, 2), intArrayOf(4, 5), intArrayOf(7, 8))
        assertEquals(3, solver.findMinArrowShots(points))
    }

    @Test
    fun `large coordinates no overflow`() {
        val points = arrayOf(intArrayOf(Int.MIN_VALUE, -1), intArrayOf(-2, Int.MAX_VALUE))
        assertEquals(1, solver.findMinArrowShots(points))
    }
}
