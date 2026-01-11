package codility.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AbsDistinctTest {
    private val solver = AbsDistinct()

    @Test
    fun `sample case`() {
        val A = intArrayOf(-5, -3, -1, 0, 3, 6)
        assertEquals(5, solver.solution(A))
    }

    @Test
    fun `all identical positive`() {
        val A = intArrayOf(4, 4, 4, 4)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `all identical negative`() {
        val A = intArrayOf(-2, -2, -2)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `single element`() {
        assertEquals(1, solver.solution(intArrayOf(0)))
    }

    @Test
    fun `symmetric pairs`() {
        val A = intArrayOf(-3, -3, -2, -2, 2, 2, 3, 3)
        assertEquals(2, solver.solution(A))
    }
}
