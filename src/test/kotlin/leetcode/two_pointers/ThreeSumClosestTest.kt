package leetcode.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeSumClosestTest {
    private val solver = ThreeSumClosest()

    @Test
    fun `example`() {
        val nums = intArrayOf(-1, 2, 1, -4)
        assertEquals(2, solver.threeSumClosest(nums, 1))
    }

    @Test
    fun `exact hit`() {
        val nums = intArrayOf(0, 0, 0)
        assertEquals(0, solver.threeSumClosest(nums, 0))
    }

    @Test
    fun `single possible triple`() {
        val nums = intArrayOf(1, 1, 1)
        assertEquals(3, solver.threeSumClosest(nums, 2))
    }

    @Test
    fun `positive numbers far target`() {
        val nums = intArrayOf(5, 6, 7, 8)
        assertEquals(20, solver.threeSumClosest(nums, 20))
    }

    @Test
    fun `mixed signs`() {
        val nums = intArrayOf(-3, -2, -5, 3, -4)
        assertEquals(-2, solver.threeSumClosest(nums, -1))
    }
}
