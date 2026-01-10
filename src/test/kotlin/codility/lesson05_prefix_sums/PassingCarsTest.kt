package codility.lesson05_prefix_sums

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PassingCarsTest {
    private val solver = PassingCars()

    @Test
    fun testExample1() {
        // [0, 1, 0, 1, 1] -> 5
        assertEquals(5, solver.solution(intArrayOf(0, 1, 0, 1, 1)))
    }

    @Test
    fun testOnlyZeros() {
        // [0, 0, 0] -> 0 passing cars
        assertEquals(0, solver.solution(intArrayOf(0, 0, 0)))
    }

    @Test
    fun testOnlyOnes() {
        // [1, 1, 1] -> 0 passing cars
        assertEquals(0, solver.solution(intArrayOf(1, 1, 1)))
    }

    @Test
    fun testOneZeroThenOne() {
        // [0, 1] -> 1 passing car
        assertEquals(1, solver.solution(intArrayOf(0, 1)))
    }

    @Test
    fun testOneOneThenZero() {
        // [1, 0] -> 0 passing cars
        assertEquals(0, solver.solution(intArrayOf(1, 0)))
    }

    @Test
    fun testAlternating() {
        // [0, 1, 0, 1] -> (0,1), (0,3), (2,3) -> 3 passing cars
        assertEquals(3, solver.solution(intArrayOf(0, 1, 0, 1)))
    }

    @Test
    fun testLargeInput() {
        // 50,000 zeros followed by 50,000 ones
        // Total pairs = 50,000 * 50,000 = 2,500,000,000 -> Exceeds 1,000,000,000 -> -1
        val n = 100000
        val arr = IntArray(n)
        for (i in 0 until n / 2) {
            arr[i] = 0
        }
        for (i in n / 2 until n) {
            arr[i] = 1
        }
        assertEquals(-1, solver.solution(arr))
    }

    @Test
    fun testMaxAllowedInput() {
        // Find a case close to 1,000,000,000 but not exceeding.
        // If we have 1000 zeros and 1,000,000 ones -> 1,000,000,000.
        // Array size roughly 1,001,000 (problem limit is 100,000 usually).
        // Let's use smaller N within constraint N=100,000.
        // sqrt(2*10^9) is approx 44721.
        // If we have ~44721 zeros and enough ones, we might hit limits.
        
        // Let's try construct exactly 1,000,000,000.
        // 20,000 zeros followed by 50,000 ones = 1,000,000,000 -> Should return 1,000,000,000
        val zeros = 20000
        val ones = 50000
        val arr = IntArray(zeros + ones)
        for (i in 0 until zeros) arr[i] = 0
        for (i in zeros until zeros + ones) arr[i] = 1
        
        assertEquals(1000000000, solver.solution(arr))
    }

    @Test
    fun testJustOverMaxInput() {
        // 20,000 zeros followed by 50,001 ones = 1,000,020,000 -> Return -1
        val zeros = 20000
        val ones = 50001
        val arr = IntArray(zeros + ones)
        for (i in 0 until zeros) arr[i] = 0
        for (i in zeros until zeros + ones) arr[i] = 1
        
        assertEquals(-1, solver.solution(arr))
    }
}
