package leetcode.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class DailyTemperaturesTest {
    private val solver = DailyTemperatures()

    @Test
    fun `example from problem`() {
        val temps = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
        assertContentEquals(intArrayOf(1, 1, 4, 2, 1, 1, 0, 0), solver.dailyTemperatures(temps))
    }

    @Test
    fun `monotone decreasing`() {
        val temps = intArrayOf(90, 80, 70)
        assertContentEquals(intArrayOf(0, 0, 0), solver.dailyTemperatures(temps))
    }

    @Test
    fun `all equal`() {
        val temps = intArrayOf(50, 50, 50)
        assertContentEquals(intArrayOf(0, 0, 0), solver.dailyTemperatures(temps))
    }

    @Test
    fun `single element`() {
        val temps = intArrayOf(100)
        assertContentEquals(intArrayOf(0), solver.dailyTemperatures(temps))
    }

    @Test
    fun `rise every day`() {
        val temps = intArrayOf(30, 40, 50, 60)
        assertContentEquals(intArrayOf(1, 1, 1, 0), solver.dailyTemperatures(temps))
    }
}
