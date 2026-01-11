package leetcode.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {
    private val solver = BestTimeToBuyAndSellStock()

    @Test
    fun `example from problem`() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        assertEquals(5, solver.maxProfit(prices))
    }

    @Test
    fun `monotone decreasing yields zero`() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        assertEquals(0, solver.maxProfit(prices))
    }

    @Test
    fun `single day`() {
        val prices = intArrayOf(5)
        assertEquals(0, solver.maxProfit(prices))
    }

    @Test
    fun `peak then dip then new peak`() {
        val prices = intArrayOf(3, 8, 2, 5, 7)
        assertEquals(5, solver.maxProfit(prices))
    }

    @Test
    fun `all equal prices`() {
        val prices = intArrayOf(4, 4, 4, 4)
        assertEquals(0, solver.maxProfit(prices))
    }
}
