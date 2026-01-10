package codility.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinPerimeterRectangleTest {
    private val solver = MinPerimeterRectangle()

    @Test
    fun `example test`() {
        assertEquals(22, solver.solution(30))
    }

    @Test
    fun `prime number`() {
        assertEquals(28, solver.solution(13))
    }

    @Test
    fun `perfect square`() {
        assertEquals(8, solver.solution(4))
    }

    @Test
    fun `one`() {
        assertEquals(4, solver.solution(1))
    }

    @Test
    fun `large square`() {
        val square = 100_000_000
        assertEquals(2 * (10_000 + 10_000), solver.solution(square))
    }

    @Test
    fun `large prime`() {
        val prime = 1_000_000_007
        assertEquals(2 * (1L + prime).toInt(), solver.solution(prime))
    }

    @Test
    fun `two factors near sqrt`() {
        assertEquals(2 * (100 + 101), solver.solution(10100))
    }
}
