package codility.lesson11_sieve_of_eratosthenes

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountSemiprimesTest {
    private val solver = CountSemiprimes()

    @Test
    fun `sample case`() {
        val P = intArrayOf(1, 4, 16)
        val Q = intArrayOf(26, 10, 20)
        assertArrayEquals(intArrayOf(10, 4, 0), solver.solution(26, P, Q))
    }

    @Test
    fun `single range`() {
        val P = intArrayOf(1)
        val Q = intArrayOf(1)
        assertArrayEquals(intArrayOf(0), solver.solution(1, P, Q))
    }

    @Test
    fun `no semiprimes in range`() {
        val P = intArrayOf(14)
        val Q = intArrayOf(16)
        assertArrayEquals(intArrayOf(2), solver.solution(20, P, Q))
    }

    @Test
    fun `minimal semiprimes`() {
        val P = intArrayOf(4)
        val Q = intArrayOf(6)
        assertArrayEquals(intArrayOf(2), solver.solution(6, P, Q))
    }

    @Test
    fun `full span mixed ranges`() {
        val P = intArrayOf(1, 5, 10)
        val Q = intArrayOf(6, 10, 30)
        assertArrayEquals(intArrayOf(2, 3, 7), solver.solution(30, P, Q))
    }
}
