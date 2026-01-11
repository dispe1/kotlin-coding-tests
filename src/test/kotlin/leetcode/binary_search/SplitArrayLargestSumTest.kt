package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SplitArrayLargestSumTest {
    private val solver = SplitArrayLargestSum()

    @Test
    fun `sample case`() {
        val nums = intArrayOf(7, 2, 5, 10, 8)
        assertEquals(18, solver.splitArray(nums, 2))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(5)
        assertEquals(5, solver.splitArray(nums, 1))
    }

    @Test
    fun `each element own part`() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertEquals(4, solver.splitArray(nums, 4))
    }

    @Test
    fun `all in one part`() {
        val nums = intArrayOf(2, 2, 2)
        assertEquals(6, solver.splitArray(nums, 1))
    }

    @Test
    fun `large values overflow guard`() {
        val nums = intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE)
        assertEquals(Int.MAX_VALUE, solver.splitArray(nums, 2))
    }
}
