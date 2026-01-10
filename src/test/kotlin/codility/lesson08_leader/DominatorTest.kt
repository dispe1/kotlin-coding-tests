package codility.lesson08_leader

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DominatorTest {
    
    private val dominator = Dominator()

    @Test
    fun `sample test`() {
        val A = intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)
        val validIndices = setOf(0, 2, 4, 6, 7)
        val result = dominator.solution(A)
        assertTrue(result in validIndices, "Expected one of $validIndices, but got $result")
    }

    @Test
    fun `empty array`() {
        assertEquals(-1, dominator.solution(intArrayOf()))
    }

    @Test
    fun `single element`() {
        assertEquals(0, dominator.solution(intArrayOf(5)))
    }

    @Test
    fun `two different elements`() {
        assertEquals(-1, dominator.solution(intArrayOf(1, 2)))
    }

    @Test
    fun `two same elements`() {
        val result = dominator.solution(intArrayOf(1, 1))
        assertTrue(result in setOf(0, 1))
    }

    @Test
    fun `no dominator - exactly half`() {
        assertEquals(-1, dominator.solution(intArrayOf(1, 2, 1, 2)))
    }

    @Test
    fun `no dominator - various`() {
        assertEquals(-1, dominator.solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `dominator at start`() {
        val result = dominator.solution(intArrayOf(1, 1, 1, 2))
        assertTrue(result in setOf(0, 1, 2))
    }

    @Test
    fun `dominator at end`() {
        val result = dominator.solution(intArrayOf(1, 2, 2, 2))
        assertTrue(result in setOf(1, 2, 3))
    }

    @Test
    fun `large values`() {
        val max = Int.MAX_VALUE
        val min = Int.MIN_VALUE
        val A = intArrayOf(max, min, max, max, max)
        val result = dominator.solution(A)
        assertTrue(result in setOf(0, 2, 3, 4))
    }

    @Test
    fun `alternating pattern with dominator`() {
        val result = dominator.solution(intArrayOf(5, 1, 5, 2, 5))
        assertTrue(result in setOf(0, 2, 4))
    }
}
