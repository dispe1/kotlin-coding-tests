package codility.lesson09_maximum_slice_problem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxProfitTest {
    private val maxProfit = MaxProfit()

    @Test
    fun `sample test`() {
        val A = intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)
        assertEquals(356, maxProfit.solution(A))
    }

    @Test
    fun `empty array`() {
        assertEquals(0, maxProfit.solution(intArrayOf()))
    }

    @Test
    fun `single element`() {
        assertEquals(0, maxProfit.solution(intArrayOf(100)))
    }

    @Test
    fun `two elements - profit`() {
        assertEquals(10, maxProfit.solution(intArrayOf(10, 20)))
    }

    @Test
    fun `two elements - loss`() {
        assertEquals(0, maxProfit.solution(intArrayOf(20, 10)))
    }

    @Test
    fun `strictly increasing`() {
        assertEquals(40, maxProfit.solution(intArrayOf(10, 20, 30, 40, 50)))
    }

    @Test
    fun `strictly decreasing`() {
        assertEquals(0, maxProfit.solution(intArrayOf(50, 40, 30, 20, 10)))
    }

    @Test
    fun `v shape`() {
        assertEquals(40, maxProfit.solution(intArrayOf(50, 40, 30, 20, 10, 20, 30, 40, 50)))
    }

    @Test
    fun `mountain shape`() {
        assertEquals(40, maxProfit.solution(intArrayOf(10, 20, 30, 40, 50, 40, 30, 20, 10)))
    }

    @Test
    fun `global min after global max`() {
        assertEquals(100, maxProfit.solution(intArrayOf(100, 200, 50, 10, 50)))
    }

    @Test
    fun `complex fluctuation`() {
        assertEquals(13, maxProfit.solution(intArrayOf(5, 11, 2, 10, 15)))
    }
}
