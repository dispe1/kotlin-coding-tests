package leetcode.sliding_window

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumSizeSubarraySumTest {
    private val solver = MinimumSizeSubarraySum()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(2, 3, 1, 2, 4, 3)
        assertEquals(2, solver.minSubArrayLen(7, nums))
    }

    @Test
    fun `no subarray reaches target`() {
        val nums = intArrayOf(1, 1, 1, 1)
        assertEquals(0, solver.minSubArrayLen(10, nums))
    }

    @Test
    fun `single element satisfies target`() {
        val nums = intArrayOf(5, 1, 1)
        assertEquals(1, solver.minSubArrayLen(5, nums))
    }

    @Test
    fun `minimal window at end`() {
        val nums = intArrayOf(1, 1, 1, 1, 6)
        assertEquals(1, solver.minSubArrayLen(6, nums))
    }

    @Test
    fun `handles large values without overflow`() {
        val nums = intArrayOf(Int.MAX_VALUE, 1, 2)
        assertEquals(1, solver.minSubArrayLen(Int.MAX_VALUE, nums))
    }
}
