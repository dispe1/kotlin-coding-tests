package leetcode.stack

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@Disabled("Implementation pending")
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
}
