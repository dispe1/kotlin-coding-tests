package codility.lesson17_dynamic_programming

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberSolitaireTest {
    private val solver = NumberSolitaire()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, -2, 0, 9, -1, -2)
        assertEquals(8, solver.solution(A))
    }

    @Test
    fun `single cell`() {
        assertEquals(5, solver.solution(intArrayOf(5)))
    }

    @Test
    fun `all negative still pick best`() {
        val A = intArrayOf(-5, -4, -3, -2, -1)
        assertEquals(-6, solver.solution(A))
    }

    @Test
    fun `longer with mix`() {
        val A = intArrayOf(0, 0, 0, 0, 10, -5, 2, 3)
        assertEquals(15, solver.solution(A))
    }
}
