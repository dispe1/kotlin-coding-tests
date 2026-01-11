package leetcode.sliding_window

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FruitIntoBasketsTest {
    private val solver = FruitIntoBaskets()

    @Test
    fun `example`() {
        val fruits = intArrayOf(1, 2, 1)
        assertEquals(3, solver.totalFruit(fruits))
    }

    @Test
    fun `example 2`() {
        val fruits = intArrayOf(0, 1, 2, 2)
        assertEquals(3, solver.totalFruit(fruits))
    }

    @Test
    fun `example 3`() {
        val fruits = intArrayOf(1, 2, 3, 2, 2)
        assertEquals(4, solver.totalFruit(fruits))
    }

    @Test
    fun `single type`() {
        val fruits = intArrayOf(5, 5, 5, 5)
        assertEquals(4, solver.totalFruit(fruits))
    }

    @Test
    fun `switching types`() {
        val fruits = intArrayOf(1, 2, 1, 3, 4, 3, 5, 1, 2)
        assertEquals(3, solver.totalFruit(fruits))
    }
}
