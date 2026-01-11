package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KokoEatingBananasTest {
    private val solver = KokoEatingBananas()

    @Test
    fun `example 1`() {
        val piles = intArrayOf(3, 6, 7, 11)
        assertEquals(4, solver.minEatingSpeed(piles, 8))
    }

    @Test
    fun `tight hours`() {
        val piles = intArrayOf(30, 11, 23, 4, 20)
        assertEquals(30, solver.minEatingSpeed(piles, 5))
    }

    @Test
    fun `single pile`() {
        val piles = intArrayOf(9)
        assertEquals(9, solver.minEatingSpeed(piles, 1))
    }

    @Test
    fun `more hours than piles size`() {
        val piles = intArrayOf(5, 5, 5)
        assertEquals(3, solver.minEatingSpeed(piles, 6))
    }

    @Test
    fun `minimum speed 1 still fits`() {
        val piles = intArrayOf(1, 1, 1, 1)
        assertEquals(1, solver.minEatingSpeed(piles, 8))
    }
}
