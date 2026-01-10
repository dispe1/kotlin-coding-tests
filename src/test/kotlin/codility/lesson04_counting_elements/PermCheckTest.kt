package codility.lesson04_counting_elements

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermCheckTest {
    private val solver = PermCheck()

    @Test
    fun testExample1() {
        // [4, 1, 3, 2] -> Permutation (1..4) -> 1
        assertEquals(1, solver.solution(intArrayOf(4, 1, 3, 2)))
    }

    @Test
    fun testExample2() {
        // [4, 1, 3] -> Not permutation (missing 2, max 4 > size 3) -> 0
        assertEquals(0, solver.solution(intArrayOf(4, 1, 3)))
    }

    @Test
    fun testSingleElementPermutation() {
        // [1] -> Permutation -> 1
        assertEquals(1, solver.solution(intArrayOf(1)))
    }

    @Test
    fun testSingleElementNotPermutation() {
        // [2] -> Not permutation -> 0
        assertEquals(0, solver.solution(intArrayOf(2)))
    }

    @Test
    fun testDuplicateElements() {
        // [1, 1] -> Duplicate -> 0
        assertEquals(0, solver.solution(intArrayOf(1, 1)))
        // [1, 2, 2, 3] -> Duplicate -> 0
        assertEquals(0, solver.solution(intArrayOf(1, 2, 2, 3)))
    }

    @Test
    fun testValueOutOfRange() {
        // [1, 5] -> Size 2, but 5 > 2 -> 0
        assertEquals(0, solver.solution(intArrayOf(1, 5)))
        // [1000] -> Size 1, 1000 > 1 -> 0
        assertEquals(0, solver.solution(intArrayOf(1000)))
    }

    @Test
    fun testSumIsCorrectButNotPermutation() {
        // Sum of [2, 2, 2] is 6, Sum of [1, 2, 3] is 6.
        // But [2, 2, 2] is not permutation.
        // Boolean array check handles this correctly.
        assertEquals(0, solver.solution(intArrayOf(2, 2, 2)))
    }

    @Test
    fun testLargePermutation() {
        // [1, 2, ..., 100,000]
        val n = 100000
        val arr = IntArray(n) { it + 1 }
        assertEquals(1, solver.solution(arr))
    }

    @Test
    fun testLargeNotPermutation() {
        // [1, 2, ..., 99999, 100001] -> Missing 100000, 100001 > N
        val n = 100000
        val arr = IntArray(n) { it + 1 }
        arr[n - 1] = 100001 // Modify last element
        assertEquals(0, solver.solution(arr))
    }
}
