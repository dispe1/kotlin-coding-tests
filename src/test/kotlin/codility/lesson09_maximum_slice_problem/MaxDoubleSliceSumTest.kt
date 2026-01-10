package codility.lesson09_maximum_slice_problem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxDoubleSliceSumTest {
    private val maxDouble = MaxDoubleSliceSum()

    @Test
    fun `sample test`() {
        val A = intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)
        assertEquals(17, maxDouble.solution(A))
    }

    @Test
    fun `minimum length`() {
        assertEquals(0, maxDouble.solution(intArrayOf(0, 0, 0)))
    }

    @Test
    fun `all positives`() {
        assertEquals(12, maxDouble.solution(intArrayOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun `mixed positives and negatives`() {
        assertEquals(4, maxDouble.solution(intArrayOf(5, -2, 3, 1, 2)))
    }

    @Test
    fun `negatives only`() {
        assertEquals(0, maxDouble.solution(intArrayOf(-3, -5, -8, -2, -1)))
    }

    @Test
    fun `zeroes and positives`() {
        val A = intArrayOf(0, 3, 0, 3, 0)
        assertEquals(6, maxDouble.solution(A))
    }

    @Test
    fun `peak in middle`() {
        val A = intArrayOf(0, 10, -5, 10, 0)
        assertEquals(20, maxDouble.solution(A))
    }
}
