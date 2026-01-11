package codility.lesson14_binary_search_algorithm

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NailingPlanksTest {
    private val solver = NailingPlanks()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, 4, 5, 8)
        val B = intArrayOf(4, 5, 9, 10)
        val C = intArrayOf(4, 6, 7, 10, 2)
        assertEquals(4, solver.solution(A, B, C))
    }

    @Test
    fun `single plank single nail`() {
        val A = intArrayOf(2)
        val B = intArrayOf(2)
        val C = intArrayOf(2)
        assertEquals(1, solver.solution(A, B, C))
    }

    @Test
    fun `nails insufficient`() {
        val A = intArrayOf(1, 2)
        val B = intArrayOf(2, 3)
        val C = intArrayOf(1)
        assertEquals(-1, solver.solution(A, B, C))
    }

    @Test
    fun `nail at boundary`() {
        val A = intArrayOf(5, 7)
        val B = intArrayOf(7, 9)
        val C = intArrayOf(7, 9)
        assertEquals(1, solver.solution(A, B, C))
    }
}
