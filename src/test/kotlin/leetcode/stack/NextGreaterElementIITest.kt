package leetcode.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class NextGreaterElementIITest {
    private val solver = NextGreaterElementII()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 2, 1)
        assertContentEquals(intArrayOf(2, -1, 2), solver.nextGreaterElements(nums))
    }

    @Test
    fun `strictly increasing`() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertContentEquals(intArrayOf(2, 3, 4, -1), solver.nextGreaterElements(nums))
    }

    @Test
    fun `strictly decreasing`() {
        val nums = intArrayOf(4, 3, 2, 1)
        assertContentEquals(intArrayOf(-1, 4, 4, 4), solver.nextGreaterElements(nums))
    }

    @Test
    fun `all equal`() {
        val nums = intArrayOf(5, 5, 5)
        assertContentEquals(intArrayOf(-1, -1, -1), solver.nextGreaterElements(nums))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(7)
        assertContentEquals(intArrayOf(-1), solver.nextGreaterElements(nums))
    }
}
