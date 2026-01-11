package codility.lesson15_caterpillar_method

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinAbsSumOfTwoTest {
    private val solver = MinAbsSumOfTwo()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, 4, -3)
        assertEquals(1, solver.solution(A))
    }

    @Test
    fun `all positives`() {
        val A = intArrayOf(5, 2, 8)
        assertEquals(4, solver.solution(A))
    }

    @Test
    fun `all negatives`() {
        val A = intArrayOf(-8, -3, -1)
        assertEquals(2, solver.solution(A))
    }

    @Test
    fun `includes zero`() {
        val A = intArrayOf(0, 5, -7)
        assertEquals(0, solver.solution(A))
    }

    @Test
    fun `single element`() {
        val A = intArrayOf(5)
        assertEquals(10, solver.solution(A))
    }

    @Test
    fun `int min overflow guard`() {
        val A = intArrayOf(Int.MIN_VALUE, Int.MAX_VALUE)
        assertEquals(1, solver.solution(A))
    }
}
