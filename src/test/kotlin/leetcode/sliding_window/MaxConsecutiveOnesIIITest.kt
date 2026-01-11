package leetcode.sliding_window

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxConsecutiveOnesIIITest {
    private val solver = MaxConsecutiveOnesIII()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0)
        assertEquals(6, solver.longestOnes(nums, 2))
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 0, 0)
        assertEquals(3, solver.longestOnes(nums, 0))
    }

    @Test
    fun `all ones`() {
        val nums = intArrayOf(1, 1, 1, 1)
        assertEquals(4, solver.longestOnes(nums, 2))
    }

    @Test
    fun `all zeros within k`() {
        val nums = intArrayOf(0, 0, 0, 0)
        assertEquals(4, solver.longestOnes(nums, 4))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(0)
        assertEquals(1, solver.longestOnes(nums, 1))
    }
}
