package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindTheSmallestDivisorGivenAThresholdTest {
    private val solver = FindTheSmallestDivisorGivenAThreshold()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 2, 5, 9)
        assertEquals(5, solver.smallestDivisor(nums, 6))
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(44, 22, 33, 11, 1)
        assertEquals(44, solver.smallestDivisor(nums, 5))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(10)
        assertEquals(10, solver.smallestDivisor(nums, 1))
    }

    @Test
    fun `threshold larger than sum`() {
        val nums = intArrayOf(2, 3)
        assertEquals(1, solver.smallestDivisor(nums, 10))
    }

    @Test
    fun `all ones`() {
        val nums = intArrayOf(1, 1, 1, 1)
        assertEquals(1, solver.smallestDivisor(nums, 4))
    }
}
