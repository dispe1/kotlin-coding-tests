package codility.lesson14_binary_search_algorithm

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinMaxDivisionTest {
    private val solver = MinMaxDivision()

    @Test
    fun `sample case`() {
        val A = intArrayOf(2, 1, 5, 1, 2, 2, 2)
        assertEquals(6, solver.solution(3, 5, A))
    }

    @Test
    fun `single block`() {
        val A = intArrayOf(1, 2, 3)
        assertEquals(6, solver.solution(1, 3, A))
    }

    @Test
    fun `each element its own block`() {
        val A = intArrayOf(1, 2, 3)
        assertEquals(3, solver.solution(3, 3, A))
    }

    @Test
    fun `all equal elements`() {
        val A = intArrayOf(4, 4, 4, 4)
        assertEquals(8, solver.solution(2, 4, A))
    }

    @Test
    fun `empty array`() {
        assertEquals(0, solver.solution(3, 5, intArrayOf()))
    }
}
