package codility.lesson06_sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistinctTest {
    private val solver = Distinct()

    @Test
    fun testExample1() {
        // [2, 1, 1, 2, 3, 1] -> sorted [1, 1, 1, 2, 2, 3] -> distinct: 1, 2, 3 (count 3)
        assertEquals(3, solver.solution(intArrayOf(2, 1, 1, 2, 3, 1)))
    }

    @Test
    fun testEmptyArray() {
        // [] -> 0
        assertEquals(0, solver.solution(intArrayOf()))
    }

    @Test
    fun testSingleElement() {
        // [10] -> 1
        assertEquals(1, solver.solution(intArrayOf(10)))
    }

    @Test
    fun testAllSameElements() {
        // [1, 1, 1, 1] -> 1
        assertEquals(1, solver.solution(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun testAllDifferentElements() {
        // [1, 2, 3, 4, 5] -> 5
        assertEquals(5, solver.solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun testNegativeNumbers() {
        // [-1, -5, -1, -5, -2] -> distinct: -1, -2, -5 -> 3
        assertEquals(3, solver.solution(intArrayOf(-1, -5, -1, -5, -2)))
    }

    @Test
    fun testMixedNumbers() {
        // [-1, 0, 1, -1, 0, 1] -> distinct: -1, 0, 1 -> 3
        assertEquals(3, solver.solution(intArrayOf(-1, 0, 1, -1, 0, 1)))
    }

    @Test
    fun testLargeInput() {
        // N = 100,000, 50,000 unique values repeated twice
        val n = 100000
        val arr = IntArray(n)
        for (i in 0 until n / 2) {
            arr[i] = i
            arr[i + n / 2] = i
        }
        // [0, 1, ..., 49999, 0, 1, ..., 49999]
        assertEquals(50000, solver.solution(arr))
    }
}
