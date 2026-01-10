package codility.lesson05_prefix_sums

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinAvgTwoSliceTest {
    private val solver = MinAvgTwoSlice()

    @Test
    fun testExample1() {
        // [4, 2, 2, 5, 1, 5, 8]
        // 1. (4+2)/2=3, (2+2)/2=2, (2+5)/2=3.5, (5+1)/2=3, (1+5)/2=3, (5+8)/2=6.5
        // 2. (4+2+2)/3=2.66, (2+2+5)/3=3, (2+5+1)/3=2.66, (5+1+5)/3=3.66, (1+5+8)/3=4.66
        // Min avg is 2.0 at index 1 (slice [2, 2])
        assertEquals(1, solver.solution(intArrayOf(4, 2, 2, 5, 1, 5, 8)))
    }

    @Test
    fun testMinimumSize() {
        // N=2, [1, 2] -> Avg 1.5 -> Index 0
        assertEquals(0, solver.solution(intArrayOf(1, 2)))
    }

    @Test
    fun testWithNegatives() {
        // [10, 10, -20]
        // slice(0,1) -> 10
        // slice(1,2) -> -5
        // slice(0,2) -> 0
        // Min is -5 at index 1
        assertEquals(1, solver.solution(intArrayOf(10, 10, -20)))
    }

    @Test
    fun testAllSameValues() {
        // [10, 10, 10, 10] -> Min avg 10 at index 0
        assertEquals(0, solver.solution(intArrayOf(10, 10, 10, 10)))
    }

    @Test
    fun testMultipleMinima() {
        // [1, 1, 10, 1, 1]
        // Slice(0,1) avg 1.0
        // Slice(3,4) avg 1.0
        // Should return smallest starting position -> 0
        assertEquals(0, solver.solution(intArrayOf(1, 1, 10, 1, 1)))
    }

    @Test
    fun testDecreasingSequence() {
        // [5, 4, 3, 2, 1]
        // (5,4)->4.5, (4,3)->3.5, (3,2)->2.5, (2,1)->1.5
        // (5,4,3)->4, (4,3,2)->3, (3,2,1)->2
        // Min avg 1.5 at index 3 ([2,1])
        assertEquals(3, solver.solution(intArrayOf(5, 4, 3, 2, 1)))
    }

    @Test
    fun testLargeInput() {
        // N = 100,000
        // [10, 10, ..., 10, 1, 1]
        // Min avg 1.0 at index N-2
        val n = 100000
        val arr = IntArray(n) { 10 }
        arr[n - 2] = 1
        arr[n - 1] = 1
        
        assertEquals(n - 2, solver.solution(arr))
    }

    @Test
    fun testLargeNegativeValues() {
        // [-1000, -1000, 1000, 1000]
        // slice(0,1) avg -1000 -> Index 0
        assertEquals(0, solver.solution(intArrayOf(-1000, -1000, 1000, 1000)))
    }
}
