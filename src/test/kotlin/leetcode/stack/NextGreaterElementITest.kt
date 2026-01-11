package leetcode.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class NextGreaterElementITest {
    private val solver = NextGreaterElementI()

    @Test
    fun `example from problem`() {
        val nums1 = intArrayOf(4, 1, 2)
        val nums2 = intArrayOf(1, 3, 4, 2)
        assertContentEquals(intArrayOf(-1, 3, -1), solver.nextGreaterElement(nums1, nums2))
    }

    @Test
    fun `all increasing nums2`() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf(1, 2, 3, 4)
        assertContentEquals(intArrayOf(2, 3, 4), solver.nextGreaterElement(nums1, nums2))
    }

    @Test
    fun `all decreasing nums2`() {
        val nums1 = intArrayOf(4, 3)
        val nums2 = intArrayOf(4, 3, 2, 1)
        assertContentEquals(intArrayOf(-1, -1), solver.nextGreaterElement(nums1, nums2))
    }

    @Test
    fun `single element`() {
        val nums1 = intArrayOf(5)
        val nums2 = intArrayOf(5)
        assertContentEquals(intArrayOf(-1), solver.nextGreaterElement(nums1, nums2))
    }

    @Test
    fun `mixed with negatives`() {
        val nums1 = intArrayOf(-1, 0)
        val nums2 = intArrayOf(-1, -2, 0, 3)
        assertContentEquals(intArrayOf(0, 3), solver.nextGreaterElement(nums1, nums2))
    }
}
