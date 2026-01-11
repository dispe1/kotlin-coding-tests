package codility.lesson13_fibonacci_numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibFrogTest {
    private val solver = FibFrog()

    @Test
    fun `sample case`() {
        val A = intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)
        assertEquals(3, solver.solution(A))
    }

    @Test
    fun `direct jump possible`() {
        val A = intArrayOf(0, 0, 0, 0, 0, 0, 0)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `no leaves reachable`() {
        val A = intArrayOf(0, 0, 0, 0, 0)
        assertEquals(-1, solver.solution(A))
    }

    @Test
    fun `single leaf at end`() {
        val A = intArrayOf(0, 0, 0, 1)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `multiple hops required`() {
        val A = intArrayOf(0, 0, 1, 0, 0)
        assertEquals(2, solver.solution(A))
    }
}
