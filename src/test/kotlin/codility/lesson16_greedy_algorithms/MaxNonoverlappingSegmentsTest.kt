package codility.lesson16_greedy_algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxNonoverlappingSegmentsTest {
    private val solver = MaxNonoverlappingSegments()

    @Test
    fun `sample case`() {
        val A = intArrayOf(1, 3, 7, 9, 9)
        val B = intArrayOf(5, 6, 8, 9, 10)
        assertEquals(3, solver.solution(A, B))
    }

    @Test
    fun `single segment`() {
        assertEquals(1, solver.solution(intArrayOf(2), intArrayOf(3)))
    }

    @Test
    fun `no overlap all taken`() {
        val A = intArrayOf(1, 3, 5)
        val B = intArrayOf(2, 4, 6)
        assertEquals(3, solver.solution(A, B))
    }

    @Test
    fun `all overlapping only first counts`() {
        val A = intArrayOf(1, 1, 1)
        val B = intArrayOf(5, 5, 5)
        assertEquals(1, solver.solution(A, B))
    }

    @Test
    fun `empty input`() {
        assertEquals(0, solver.solution(intArrayOf(), intArrayOf()))
    }
}
