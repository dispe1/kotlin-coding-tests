package codility.lesson16_greedy_algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TieRopesTest {
    private val solver = TieRopes()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, 2, 3, 4, 1, 1, 3)
        assertEquals(3, solver.solution(4, A))
    }

    @Test
    fun `all already long enough`() {
        val A = intArrayOf(5, 5, 5)
        assertEquals(3, solver.solution(4, A))
    }

    @Test
    fun `need aggregation`() {
        val A = intArrayOf(1, 1, 2, 2, 1)
        assertEquals(1, solver.solution(5, A))
    }

    @Test
    fun `no ropes`() {
        assertEquals(0, solver.solution(5, intArrayOf()))
    }

    @Test
    fun `exact multiples`() {
        val A = intArrayOf(2, 2, 2, 2)
        assertEquals(2, solver.solution(4, A))
    }
}
