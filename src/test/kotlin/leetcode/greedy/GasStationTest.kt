package leetcode.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GasStationTest {
    private val solver = GasStation()

    @Test
    fun `example feasible`() {
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3, 4, 5, 1, 2)
        assertEquals(3, solver.canCompleteCircuit(gas, cost))
    }

    @Test
    fun `example impossible`() {
        val gas = intArrayOf(2, 3, 4)
        val cost = intArrayOf(3, 4, 3)
        assertEquals(-1, solver.canCompleteCircuit(gas, cost))
    }

    @Test
    fun `single station feasible`() {
        val gas = intArrayOf(5)
        val cost = intArrayOf(4)
        assertEquals(0, solver.canCompleteCircuit(gas, cost))
    }

    @Test
    fun `single station infeasible`() {
        val gas = intArrayOf(1)
        val cost = intArrayOf(2)
        assertEquals(-1, solver.canCompleteCircuit(gas, cost))
    }

    @Test
    fun `wrap around start after deficit`() {
        val gas = intArrayOf(5, 1, 2, 3, 4)
        val cost = intArrayOf(4, 4, 1, 5, 1)
        assertEquals(4, solver.canCompleteCircuit(gas, cost))
    }

    @Test
    fun `all zeros`() {
        val gas = intArrayOf(0, 0, 0)
        val cost = intArrayOf(0, 0, 0)
        assertEquals(0, solver.canCompleteCircuit(gas, cost))
    }
}
