package leetcode.dynamic_programming

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumSubarrayTest {
    private val solver = MaximumSubarray()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        assertEquals(6, solver.maxSubArray(nums))
    }

    @Test
    fun `all negatives`() {
        val nums = intArrayOf(-3, -2, -5, -1)
        assertEquals(-1, solver.maxSubArray(nums))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(5)
        assertEquals(5, solver.maxSubArray(nums))
    }

    @Test
    fun `all positives`() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertEquals(10, solver.maxSubArray(nums))
    }

    @Test
    fun `zeros included`() {
        val nums = intArrayOf(0, -3, 1, 2, 0, -1, 2)
        assertEquals(4, solver.maxSubArray(nums))
    }
}
