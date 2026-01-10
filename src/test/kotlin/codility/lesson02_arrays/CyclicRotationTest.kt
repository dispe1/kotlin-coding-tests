package codility.lesson02_arrays

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CyclicRotationTest {
    private val solver = CyclicRotation()

    @Test
    fun testExample1() {
        // A = [3, 8, 9, 7, 6], K = 3 -> [9, 7, 6, 3, 8]
        val result = solver.solution(intArrayOf(3, 8, 9, 7, 6), 3)
        assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), result)
    }

    @Test
    fun testExample2() {
        // A = [0, 0, 0], K = 1 -> [0, 0, 0]
        val result = solver.solution(intArrayOf(0, 0, 0), 1)
        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }

    @Test
    fun testExample3() {
        // A = [1, 2, 3, 4], K = 4 -> [1, 2, 3, 4] (K % N == 0)
        val result = solver.solution(intArrayOf(1, 2, 3, 4), 4)
        assertArrayEquals(intArrayOf(1, 2, 3, 4), result)
    }

    @Test
    fun testEmptyArray() {
        // Edge case: Empty array
        val result = solver.solution(intArrayOf(), 5)
        assertArrayEquals(intArrayOf(), result)
    }

    @Test
    fun testSingleElement() {
        // Edge case: Single element
        val result = solver.solution(intArrayOf(10), 100)
        assertArrayEquals(intArrayOf(10), result)
    }

    @Test
    fun testRotationGreaterThanSize() {
        // A = [1, 2, 3], K = 4 -> same as K = 1 -> [3, 1, 2]
        val result = solver.solution(intArrayOf(1, 2, 3), 4)
        assertArrayEquals(intArrayOf(3, 1, 2), result)
    }

    @Test
    fun testZeroRotation() {
        // K = 0 -> No change
        val result = solver.solution(intArrayOf(1, 2, 3), 0)
        assertArrayEquals(intArrayOf(1, 2, 3), result)
    }

    @Test
    fun testLargeRotationIndex() {
        // N = 5, K = 12 -> 12 % 5 = 2 rotations
        // [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
        val result = solver.solution(intArrayOf(1, 2, 3, 4, 5), 12)
        assertArrayEquals(intArrayOf(4, 5, 1, 2, 3), result)
    }

    @Test
    fun testNegativeNumbers() {
        // Array containing negative numbers
        // [-1, -2, -3, -4], K = 2 -> [-3, -4, -1, -2]
        val result = solver.solution(intArrayOf(-1, -2, -3, -4), 2)
        assertArrayEquals(intArrayOf(-3, -4, -1, -2), result)
    }
}
