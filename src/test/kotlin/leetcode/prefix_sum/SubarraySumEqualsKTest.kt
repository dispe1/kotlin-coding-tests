package leetcode.prefix_sum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SubarraySumEqualsKTest {
    private val solver = SubarraySumEqualsK()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(1, 1, 1)
        assertEquals(2, solver.subarraySum(nums, 2))
    }

    @Test
    fun `handles negative numbers`() {
        val nums = intArrayOf(1, -1, 1, -1, 1)
        assertEquals(6, solver.subarraySum(nums, 0))
    }

    @Test
    fun `single element equals k`() {
        val nums = intArrayOf(3, 4, 7)
        assertEquals(1, solver.subarraySum(nums, 3))
    }

    @Test
    fun `no subarray found`() {
        val nums = intArrayOf(2, 4, 6)
        assertEquals(0, solver.subarraySum(nums, 1))
    }

    @Test
    fun `all zeros`() {
        val nums = intArrayOf(0, 0, 0)
        assertEquals(6, solver.subarraySum(nums, 0))
    }
}
