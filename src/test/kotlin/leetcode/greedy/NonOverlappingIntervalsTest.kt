package leetcode.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NonOverlappingIntervalsTest {
    private val solver = NonOverlappingIntervals()

    @Test
    fun `already non overlapping with touching boundaries`() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        assertEquals(0, solver.eraseOverlapIntervals(intervals))
    }

    @Test
    fun `identical intervals require removing all but one`() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 2))
        assertEquals(2, solver.eraseOverlapIntervals(intervals))
    }

    @Test
    fun `mixed overlaps unsorted`() {
        val intervals = arrayOf(intArrayOf(1, 100), intArrayOf(11, 22), intArrayOf(1, 11), intArrayOf(2, 12))
        assertEquals(2, solver.eraseOverlapIntervals(intervals))
    }

    @Test
    fun `handles negative coordinates`() {
        val intervals = arrayOf(intArrayOf(-100, -90), intArrayOf(-90, -80), intArrayOf(-50, 0), intArrayOf(0, 50))
        assertEquals(0, solver.eraseOverlapIntervals(intervals))
    }

    @Test
    fun `single interval`() {
        val intervals = arrayOf(intArrayOf(5, 10))
        assertEquals(0, solver.eraseOverlapIntervals(intervals))
    }
}
