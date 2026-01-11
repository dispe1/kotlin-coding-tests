package leetcode.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestRectangleInHistogramTest {
    private val solver = LargestRectangleInHistogram()

    @Test
    fun `sample from problem`() {
        val heights = intArrayOf(2, 1, 5, 6, 2, 3)
        assertEquals(10, solver.solution(heights))
    }

    @Test
    fun `single bar`() {
        val heights = intArrayOf(5)
        assertEquals(5, solver.solution(heights))
    }

    @Test
    fun `monotone increasing`() {
        val heights = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(9, solver.solution(heights))
    }

    @Test
    fun `monotone decreasing`() {
        val heights = intArrayOf(5, 4, 3, 2, 1)
        assertEquals(9, solver.solution(heights))
    }

    @Test
    fun `zeros included`() {
        val heights = intArrayOf(0, 0, 2, 0, 3)
        assertEquals(3, solver.solution(heights))
    }
}
