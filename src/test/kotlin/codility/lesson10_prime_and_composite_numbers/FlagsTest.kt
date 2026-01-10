package codility.lesson10_prime_and_composite_numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlagsTest {
    private val solver = Flags()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
        assertEquals(3, solver.solution(A))
    }

    @Test
    fun `no peaks`() {
        assertEquals(0, solver.solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `single peak`() {
        assertEquals(1, solver.solution(intArrayOf(1, 3, 2)))
    }

    @Test
    fun `two close peaks`() {
        val A = intArrayOf(0, 2, 0, 2, 0)
        assertEquals(2, solver.solution(A))
    }

    @Test
    fun `limited by distance`() {
        val A = intArrayOf(0, 2, 0, 1, 0, 1, 0)
        assertEquals(2, solver.solution(A))
    }

    @Test
    fun `large symmetric peaks`() {
        val A = IntArray(100) { if (it % 2 == 0) 1 else 3 }
        assertEquals(10, solver.solution(A))
    }

    @Test
    fun `flat plateau no peaks`() {
        assertEquals(0, solver.solution(intArrayOf(2, 2, 2, 2)))
    }
}
