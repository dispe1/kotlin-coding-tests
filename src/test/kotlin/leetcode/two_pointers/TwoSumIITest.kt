package leetcode.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumIITest {
    private val solver = TwoSumII()

    @Test
    fun `example from problem`() {
        val numbers = intArrayOf(2, 7, 11, 15)
        assertContentEquals(intArrayOf(1, 2), solver.twoSum(numbers, 9))
    }

    @Test
    fun `handles duplicates with any valid pair`() {
        val numbers = intArrayOf(2, 3, 3, 4)
        assertContentEquals(intArrayOf(1, 4), solver.twoSum(numbers, 6))
    }

    @Test
    fun `target achieved at boundaries`() {
        val numbers = intArrayOf(-5, -1, 0, 4, 10)
        assertContentEquals(intArrayOf(1, 5), solver.twoSum(numbers, 5))
    }

    @Test
    fun `no solution returns empty`() {
        val numbers = intArrayOf(1, 2, 3, 4)
        assertContentEquals(intArrayOf(), solver.twoSum(numbers, 100))
    }

    @Test
    fun `two element array`() {
        val numbers = intArrayOf(1, 3)
        assertContentEquals(intArrayOf(1, 2), solver.twoSum(numbers, 4))
    }
}
