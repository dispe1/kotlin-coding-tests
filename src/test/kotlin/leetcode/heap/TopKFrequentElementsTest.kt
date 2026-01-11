package leetcode.heap

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TopKFrequentElementsTest {
    private val solver = TopKFrequentElements()

    @Test
    fun `example from problem`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        assertEquals(setOf(1, 2), solver.topKFrequent(nums, 2).toSet())
    }

    @Test
    fun `single element array`() {
        val nums = intArrayOf(5)
        assertEquals(setOf(5), solver.topKFrequent(nums, 1).toSet())
    }

    @Test
    fun `k equals unique count`() {
        val nums = intArrayOf(4, 4, 6, 6, 7, 7)
        assertEquals(setOf(4, 6, 7), solver.topKFrequent(nums, 3).toSet())
    }

    @Test
    fun `ties resolved by bucket order`() {
        val nums = intArrayOf(4, 1, -1, 2, -1, 2, 3)
        assertEquals(setOf(-1, 2), solver.topKFrequent(nums, 2).toSet())
    }

    @Test
    fun `handles zeros and negatives`() {
        val nums = intArrayOf(0, 0, -1, -1, -1, 2)
        assertEquals(setOf(-1, 0), solver.topKFrequent(nums, 2).toSet())
    }
}
