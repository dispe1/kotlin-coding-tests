package codility.lesson06_sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxProductOfThreeTest {
    private val solver = MaxProductOfThree()

    @Test
    fun testExample1() {
        // [-3, 1, 2, -2, 5, 6] -> sorted [-3, -2, 1, 2, 5, 6]
        // Opt1: 6*5*2 = 60
        // Opt2: -3*-2*6 = 36
        // Max = 60
        assertEquals(60, solver.solution(intArrayOf(-3, 1, 2, -2, 5, 6)))
    }

    @Test
    fun testNegativeProductIsMax() {
        // [-5, -5, 1, 2, 3] -> sorted [-5, -5, 1, 2, 3]
        // Opt1: 3*2*1 = 6
        // Opt2: -5*-5*3 = 75
        // Max = 75
        assertEquals(75, solver.solution(intArrayOf(-5, -5, 1, 2, 3)))
    }

    @Test
    fun testAllNegatives() {
        // [-5, -4, -3, -2, -1]
        // Opt1: -1*-2*-3 = -6
        // Opt2: -5*-4*-1 = -20
        // Max = -6 (Since result can be negative, we want closest to 0)
        assertEquals(-6, solver.solution(intArrayOf(-5, -4, -3, -2, -1)))
    }

    @Test
    fun testMinimumSize() {
        // [10, 20, 30] -> 6000
        assertEquals(6000, solver.solution(intArrayOf(10, 20, 30)))
    }

    @Test
    fun testWithZero() {
        // [-5, -4, 0, 1]
        // Opt1: 1*0*-4 = 0
        // Opt2: -5*-4*1 = 20
        // Max = 20
        assertEquals(20, solver.solution(intArrayOf(-5, -4, 0, 1)))
    }

    @Test
    fun testWithZeroResult() {
        // [-5, -4, 0] -> 0
        assertEquals(0, solver.solution(intArrayOf(-5, -4, 0)))
    }

    @Test
    fun testMixedValues() {
        // [-100, -100, -10, 0, 5, 10]
        // Opt1: 10*5*0 = 0
        // Opt2: -100*-100*10 = 100,000
        assertEquals(100000, solver.solution(intArrayOf(-100, -100, -10, 0, 5, 10)))
    }

    @Test
    fun testMaxIntValues() {
        // Codility inputs are -1000..1000, so Int overflow isn't an issue usually.
        // But let's check standard logic.
        // [1000, 1000, 1000] -> 1,000,000,000 (fits in Int)
        assertEquals(1000000000, solver.solution(intArrayOf(1000, 1000, 1000)))
    }
}
