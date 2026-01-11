package codility.lesson13_fibonacci_numbers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LadderTest {
    private val solver = Ladder()

    @Test
    fun `sample case`() {
        val A = intArrayOf(4, 4, 5, 5, 1)
        val B = intArrayOf(3, 2, 4, 3, 1)
        assertArrayEquals(intArrayOf(5, 1, 8, 0, 1), solver.solution(A, B))
    }

    @Test
    fun `single rung`() {
        val A = intArrayOf(1)
        val B = intArrayOf(1)
        assertArrayEquals(intArrayOf(1), solver.solution(A, B))
    }

    @Test
    fun `max mask wraps`() {
        val A = intArrayOf(10)
        val B = intArrayOf(4)
        assertArrayEquals(intArrayOf(9), solver.solution(A, B))
    }

    @Test
    fun `empty ladders`() {
        assertArrayEquals(intArrayOf(), solver.solution(intArrayOf(), intArrayOf()))
    }
}
