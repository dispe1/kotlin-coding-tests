package codility.lesson11_sieve_of_eratosthenes

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountNonDivisibleTest {
    private val solver = CountNonDivisible()

    @Test
    fun `sample case`() {
        val A = intArrayOf(3, 1, 2, 3, 6)
        assertArrayEquals(intArrayOf(2, 4, 3, 2, 0), solver.solution(A))
    }

    @Test
    fun `all identical elements`() {
        val A = intArrayOf(2, 2, 2, 2)
        assertArrayEquals(intArrayOf(0, 0, 0, 0), solver.solution(A))
    }

    @Test
    fun `mixed divisors`() {
        val A = intArrayOf(4, 4, 2, 3)
        assertArrayEquals(intArrayOf(1, 1, 3, 3), solver.solution(A))
    }

    @Test
    fun `single element`() {
        assertArrayEquals(intArrayOf(0), solver.solution(intArrayOf(1)))
    }

    @Test
    fun `prime values within bound`() {
        val A = intArrayOf(7, 5, 7, 5, 1)
        assertArrayEquals(intArrayOf(2, 2, 2, 2, 4), solver.solution(A))
    }
}
