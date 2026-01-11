package leetcode.heap

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KthLargestElementInAnArrayTest {
    private val solver = KthLargestElementInAnArray()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(3, 2, 1, 5, 6, 4)
        assertEquals(5, solver.findKthLargest(nums, 2))
    }

    @Test
    fun `k equals 1 returns max`() {
        val nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
        assertEquals(6, solver.findKthLargest(nums, 1))
    }

    @Test
    fun `k equals n returns min`() {
        val nums = intArrayOf(7, 7, 7)
        assertEquals(7, solver.findKthLargest(nums, 3))
    }

    @Test
    fun `handles negatives and duplicates`() {
        val nums = intArrayOf(-1, -1, 0, 2, 2)
        assertEquals(0, solver.findKthLargest(nums, 3))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(42)
        assertEquals(42, solver.findKthLargest(nums, 1))
    }
}
