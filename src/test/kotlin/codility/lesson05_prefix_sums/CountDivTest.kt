package codility.lesson05_prefix_sums

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountDivTest {
    private val solver = CountDiv()

    @Test
    fun testExample1() {
        // [6, 11], K=2 -> 6, 8, 10 -> 3
        assertEquals(3, solver.solution(6, 11, 2))
    }

    @Test
    fun testStartIsDivisible() {
        // [10, 10], K=2 -> 10 -> 1
        assertEquals(1, solver.solution(10, 10, 2))
    }

    @Test
    fun testStartIsNotDivisible() {
        // [11, 13], K=2 -> 12 -> 1
        assertEquals(1, solver.solution(11, 13, 2))
    }

    @Test
    fun testZeroStart() {
        // [0, 10], K=2 -> 0, 2, 4, 6, 8, 10 -> 6
        // B/K = 5, A/K = 0. A%K(0%2)==0 -> 5 - 0 + 1 = 6
        assertEquals(6, solver.solution(0, 10, 2))
    }

    @Test
    fun testZeroRange() {
        // [0, 0], K=11 -> 0 is divisible by any K -> 1
        assertEquals(1, solver.solution(0, 0, 11))
    }

    @Test
    fun testLargeK() {
        // [6, 11], K=20 -> No numbers divisible -> 0
        assertEquals(0, solver.solution(6, 11, 20))
    }

    @Test
    fun testKEqualsOne() {
        // [6, 11], K=1 -> 6, 7, 8, 9, 10, 11 -> 6
        assertEquals(6, solver.solution(6, 11, 1))
    }

    @Test
    fun testMaxRange() {
        // [0, 2_000_000_000], K=2 -> 1,000,000,001 numbers
        // 0, 2, ..., 2B -> B/2 + 1
        assertEquals(1000000001, solver.solution(0, 2000000000, 2))
    }

    @Test
    fun testMaxRangeMaxK() {
        // [0, 2_000_000_000], K=2_000_000_000
        // 0 and 2_000_000_000 are divisible -> 2
        assertEquals(2, solver.solution(0, 2000000000, 2000000000))
    }
}
