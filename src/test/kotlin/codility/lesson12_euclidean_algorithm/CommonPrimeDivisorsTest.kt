package codility.lesson12_euclidean_algorithm

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CommonPrimeDivisorsTest {
    private val solver = CommonPrimeDivisors()

    @Test
    fun `sample case`() {
        val A = intArrayOf(15, 10, 3)
        val B = intArrayOf(75, 30, 5)
        assertEquals(1, solver.solution(A, B))
    }

    @Test
    fun `all equal pairs`() {
        val A = intArrayOf(12, 12, 12)
        val B = intArrayOf(12, 12, 12)
        assertEquals(3, solver.solution(A, B))
    }

    @Test
    fun `coprime mismatches`() {
        val A = intArrayOf(5, 7, 11)
        val B = intArrayOf(6, 14, 33)
        assertEquals(0, solver.solution(A, B))
    }

    @Test
    fun `shared prime factors but extras`() {
        val A = intArrayOf(8, 27)
        val B = intArrayOf(24, 54)
        assertEquals(0, solver.solution(A, B))
    }

    @Test
    fun `mixed success`() {
        val A = intArrayOf(2, 4, 9, 45)
        val B = intArrayOf(4, 8, 27, 75)
        assertEquals(4, solver.solution(A, B))
    }
}
