package codility.lesson02_arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OddOccurrencesInArrayTest {
    private val solver = OddOccurrencesInArray()

    @Test
    fun testExample1() {
        // [9, 3, 9, 3, 9, 7, 9] -> 7
        val result = solver.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))
        assertEquals(7, result)
    }

    @Test
    fun testSingleElement() {
        // [42] -> 42
        val result = solver.solution(intArrayOf(42))
        assertEquals(42, result)
    }

    @Test
    fun testSimplePair() {
        // [2, 2, 3, 3, 4] -> 4
        val result = solver.solution(intArrayOf(2, 2, 3, 3, 4))
        assertEquals(4, result)
    }

    @Test
    fun testLargeNumbers() {
        // [1000000000, 5, 1000000000] -> 5
        val result = solver.solution(intArrayOf(1000000000, 5, 1000000000))
        assertEquals(5, result)
    }

    @Test
    fun testManyElements() {
        // 5 elements (2 pairs + 1 unique)
        // [5, 5, 1, 2, 2] -> 1
        val result = solver.solution(intArrayOf(5, 5, 1, 2, 2))
        assertEquals(1, result)
    }
}
