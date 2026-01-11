package leetcode.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeSumTest {
    private val solver = ThreeSum()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expected = setOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        assertEquals(expected, solver.threeSum(nums).toSet())
    }

    @Test
    fun `all zeros`() {
        val nums = intArrayOf(0, 0, 0, 0)
        val expected = setOf(listOf(0, 0, 0))
        assertEquals(expected, solver.threeSum(nums).toSet())
    }

    @Test
    fun `no triplet`() {
        val nums = intArrayOf(1, 2, -2, -1)
        val expected = emptySet<List<Int>>()
        assertEquals(expected, solver.threeSum(nums).toSet())
    }

    @Test
    fun `duplicates handled once`() {
        val nums = intArrayOf(-2, 0, 0, 2, 2)
        val expected = setOf(listOf(-2, 0, 2))
        assertEquals(expected, solver.threeSum(nums).toSet())
    }

    @Test
    fun `mixed positives and negatives`() {
        val nums = intArrayOf(-4, -2, -1, 0, 1, 2, 3, 5)
        val expected = setOf(
            listOf(-4, -1, 5),
            listOf(-4, 1, 3),
            listOf(-2, -1, 3),
            listOf(-2, 0, 2),
            listOf(-1, 0, 1)
        )
        assertEquals(expected, solver.threeSum(nums).toSet())
    }
}
