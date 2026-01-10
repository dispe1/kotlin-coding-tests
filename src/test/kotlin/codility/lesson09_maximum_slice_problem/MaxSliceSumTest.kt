package codility.lesson09_maximum_slice_problem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxSliceSumTest {
    private val maxSliceSum = MaxSliceSum()

    @Test
    fun `sample test`() {
        assertEquals(5, maxSliceSum.solution(intArrayOf(3, 2, -6, 4, 0)))
    }

    @Test
    fun `single positive element`() {
        assertEquals(10, maxSliceSum.solution(intArrayOf(10)))
    }

    @Test
    fun `single negative element`() {
        assertEquals(-10, maxSliceSum.solution(intArrayOf(-10)))
    }

    @Test
    fun `all negative elements`() {
        assertEquals(-1, maxSliceSum.solution(intArrayOf(-2, -5, -1)))
    }

    @Test
    fun `mixed elements`() {
        assertEquals(5, maxSliceSum.solution(intArrayOf(1, -2, 3, -4, 5)))
    }

    @Test
    fun `large slice`() {
        assertEquals(30, maxSliceSum.solution(intArrayOf(10, 10, 10)))
    }

    @Test
    fun `negative start but overall positive`() {
        assertEquals(7, maxSliceSum.solution(intArrayOf(-2, 5, -1, 3)))
    }

    @Test
    fun `alternating high values`() {
        assertEquals(10, maxSliceSum.solution(intArrayOf(5, -7, 3, 5, -2, 4)))
    }
}
