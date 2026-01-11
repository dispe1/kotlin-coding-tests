package codility.lesson12_euclidean_algorithm

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ChocolatesByNumbersTest {
    private val solver = ChocolatesByNumbers()

    @Test
    fun `sample case`() {
        assertEquals(5, solver.solution(10, 4))
    }

    @Test
    fun `coprime numbers`() {
        assertEquals(10, solver.solution(10, 3))
    }

    @Test
    fun `same numbers`() {
        assertEquals(1, solver.solution(12, 12))
    }

    @Test
    fun `large gcd`() {
        assertEquals(3, solver.solution(6, 4))
    }

    @Test
    fun `m equals one`() {
        assertEquals(10, solver.solution(10, 1))
    }
}
