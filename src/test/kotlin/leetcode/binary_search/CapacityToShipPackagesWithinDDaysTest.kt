package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CapacityToShipPackagesWithinDDaysTest {
    private val solver = CapacityToShipPackagesWithinDDays()

    @Test
    fun `example from problem`() {
        val weights = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertEquals(15, solver.shipWithinDays(weights, 5))
    }

    @Test
    fun `single day requires total sum`() {
        val weights = intArrayOf(3, 2, 2, 4, 1, 4)
        assertEquals(16, solver.shipWithinDays(weights, 1))
    }

    @Test
    fun `days equals items uses max weight`() {
        val weights = intArrayOf(3, 2, 2, 4, 1, 4)
        assertEquals(4, solver.shipWithinDays(weights, weights.size))
    }

    @Test
    fun `handles heavy value without overflow`() {
        val weights = intArrayOf(Int.MAX_VALUE, 1, 1)
        assertEquals(Int.MAX_VALUE, solver.shipWithinDays(weights, 2))
    }

    @Test
    fun `all equal weights`() {
        val weights = intArrayOf(5, 5, 5, 5)
        assertEquals(10, solver.shipWithinDays(weights, 2))
    }
}
