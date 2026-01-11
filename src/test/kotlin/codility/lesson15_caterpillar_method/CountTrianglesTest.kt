package codility.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTrianglesTest {
    private val solver = CountTriangles()

    @Test
    fun `sample case`() {
        val A = intArrayOf(10, 2, 5, 1, 8, 12)
        assertEquals(4, solver.solution(A))
    }

    @Test
    fun `no triangles`() {
        val A = intArrayOf(1, 2, 3)
        assertEquals(0, solver.solution(A))
    }

    @Test
    fun `all equal sides`() {
        val A = intArrayOf(5, 5, 5, 5)
        assertEquals(4, solver.solution(A))
    }

    @Test
    fun `large values`() {
        val A = intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, Int.MAX_VALUE)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `minimal length`() {
        assertEquals(0, solver.solution(intArrayOf(2, 3)))
    }
}
