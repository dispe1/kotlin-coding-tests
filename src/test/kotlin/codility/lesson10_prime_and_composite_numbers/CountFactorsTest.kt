package codility.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountFactorsTest {
    private val solver = CountFactors()

    @Test
    fun `example test`() {
        assertEquals(8, solver.solution(24))
    }

    @Test
    fun `one`() {
        assertEquals(1, solver.solution(1))
    }

    @Test
    fun `prime number`() {
        assertEquals(2, solver.solution(17))
    }

    @Test
    fun `square number`() {
        assertEquals(3, solver.solution(9))
    }

    @Test
    fun `perfect cube`() {
        assertEquals(4, solver.solution(27))
    }

    @Test
    fun `large value`() {
        assertEquals(24, solver.solution(360))
    }

    @Test
    fun `zero and negatives`() {
        assertEquals(0, solver.solution(0))
        assertEquals(0, solver.solution(-5))
    }
}
