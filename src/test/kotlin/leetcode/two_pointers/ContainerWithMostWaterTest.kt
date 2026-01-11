package leetcode.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
    private val solver = ContainerWithMostWater()

    @Test
    fun `example from problem`() {
        val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        assertEquals(49, solver.maxArea(height))
    }

    @Test
    fun `monotone increasing`() {
        val height = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(6, solver.maxArea(height))
    }

    @Test
    fun `monotone decreasing`() {
        val height = intArrayOf(5, 4, 3, 2, 1)
        assertEquals(6, solver.maxArea(height))
    }

    @Test
    fun `all equal heights`() {
        val height = intArrayOf(5, 5, 5, 5)
        assertEquals(15, solver.maxArea(height))
    }

    @Test
    fun `two elements`() {
        val height = intArrayOf(1, 1)
        assertEquals(1, solver.maxArea(height))
    }
}
