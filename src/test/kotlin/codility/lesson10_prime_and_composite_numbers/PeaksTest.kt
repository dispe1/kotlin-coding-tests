package codility.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PeaksTest {
    private val solver = Peaks()

    @Test
    fun `sample case matches expected`() {
        val A = intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
        assertEquals(3, solver.solution(A))
    }

    @Test
    fun `no peaks returns zero`() {
        assertEquals(0, solver.solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `single peak returns one`() {
        assertEquals(1, solver.solution(intArrayOf(1, 3, 2)))
    }

    @Test
    fun `dense peaks limited by divisor count`() {
        val A = intArrayOf(0, 2, 0, 2, 0, 2, 0, 2, 0)
        assertEquals(3, solver.solution(A))
    }

    @Test
    fun `sparse peaks allow many flags`() {
        val A = intArrayOf(
            0, 1, 0, 0, 0, 0, 0, 0, 1, 0,
            0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
            0, 0, 0, 0
        )
        assertEquals(2, solver.solution(A))
    }

    @Test
    fun `short arrays return zero`() {
        assertEquals(0, solver.solution(intArrayOf(4, 2)))
    }
}
