package codility.lesson04_counting_elements

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxCountersTest {
    private val solver = MaxCounters()

    @Test
    fun testExample1() {
        // N = 5, A = [3, 4, 4, 6, 1, 4, 4]
        // 3: [0, 0, 1, 0, 0], max=1
        // 4: [0, 0, 1, 1, 0], max=1
        // 4: [0, 0, 1, 2, 0], max=2
        // 6: Max(N+1) -> All 2
        // 1: [3, 2, 2, 2, 2], max=3
        // 4: [3, 2, 2, 3, 2], max=3
        // 4: [3, 2, 2, 4, 2], max=4
        val result = solver.solution(5, intArrayOf(3, 4, 4, 6, 1, 4, 4))
        assertArrayEquals(intArrayOf(3, 2, 2, 4, 2), result)
    }

    @Test
    fun testSingleCounterIncreaseOnly() {
        // N = 1, A = [1, 1, 1]
        val result = solver.solution(1, intArrayOf(1, 1, 1))
        assertArrayEquals(intArrayOf(3), result)
    }

    @Test
    fun testSingleCounterMaxOnly() {
        // N = 1, A = [2, 2] (MaxCounter operations)
        // Initial 0 -> Max -> 0
        val result = solver.solution(1, intArrayOf(2, 2))
        assertArrayEquals(intArrayOf(0), result)
    }

    @Test
    fun testOnlyMaxCounters() {
        // N = 3, A = [4, 4, 4]
        val result = solver.solution(3, intArrayOf(4, 4, 4))
        assertArrayEquals(intArrayOf(0, 0, 0), result)
    }

    @Test
    fun testIncreaseThenMax() {
        // N = 3, A = [1, 3, 4]
        // [1, 0, 0] -> [1, 0, 1] -> Max(1) -> [1, 1, 1]
        val result = solver.solution(3, intArrayOf(1, 3, 4))
        assertArrayEquals(intArrayOf(1, 1, 1), result)
    }

    @Test
    fun testMaxThenIncrease() {
        // N = 3, A = [1, 4, 2]
        // [1, 0, 0] -> Max(1) -> [1, 1, 1] -> [1, 2, 1]
        val result = solver.solution(3, intArrayOf(1, 4, 2))
        assertArrayEquals(intArrayOf(1, 2, 1), result)
    }

    @Test
    fun testLargeInput() {
        // N = 100,000, M = 100,000
        // Operations: Increase 1, Increase 2, ..., Increase N
        val n = 100000
        val a = IntArray(n) { it + 1 } // 1, 2, ..., N
        val result = solver.solution(n, a)
        
        // Expected: All 1s
        val expected = IntArray(n) { 1 }
        assertArrayEquals(expected, result)
    }

    @Test
    fun testLargeInputWithMaxCounter() {
        // N = 100, M = 100,000
        // Many max counters
        val n = 100
        val m = 100000
        val a = IntArray(m)
        
        // Fill with increase 1 and max counter alternately
        // But to test performance, let's do: Increase 1 many times, then Max, then Increase 1
        for (i in 0 until m - 2) {
            a[i] = 1
        }
        a[m - 2] = n + 1 // Max Counter
        a[m - 1] = 1     // Increase 1
        
        // 1 was increased (m-2) times. So max is m-2.
        // Then Max Counter sets all to m-2.
        // Then 1 is increased -> 1 becomes m-1. Others m-2.
        
        val result = solver.solution(n, a)
        
        assertEquals(m - 1, result[0])
        for (i in 1 until n) {
            assertEquals(m - 2, result[i])
        }
    }
}
