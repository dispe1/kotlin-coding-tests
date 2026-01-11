package codility.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountDistinctSlicesTest {
    private val solver = CountDistinctSlices()

    @Test
    fun `sample case`() {
        val A = intArrayOf(3, 4, 5, 5, 2)
        assertEquals(9, solver.solution(6, A))
    }

    @Test
    fun `all unique small`() {
        val A = intArrayOf(0, 1, 2, 3)
        assertEquals(10, solver.solution(5, A))
    }

    @Test
    fun `all identical`() {
        val A = intArrayOf(1, 1, 1)
        assertEquals(3, solver.solution(2, A))
    }

    @Test
    fun `empty array`() {
        assertEquals(0, solver.solution(5, intArrayOf()))
    }

    @Test
    fun `hits limit`() {
        val n = 50_000
        val A = IntArray(n) { it }
        assertEquals(1_000_000_000, solver.solution(n, A))
    }
}
