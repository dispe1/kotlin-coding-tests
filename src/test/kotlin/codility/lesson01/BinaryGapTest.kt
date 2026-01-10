package codility.lesson01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryGapTest {
    private val solver = BinaryGap()

    @Test
    fun testExample1() {
        assertEquals(2, solver.solution(9))
    }

    @Test
    fun testExample2() {
        assertEquals(4, solver.solution(529))
    }

    @Test
    fun testExample3() {
        assertEquals(1, solver.solution(20))
    }

    @Test
    fun testExample4() {
        assertEquals(0, solver.solution(15))
    }

    @Test
    fun testExample5() {
        assertEquals(0, solver.solution(32))
    }

    @Test
    fun testBoundaryMinimumValue() {
        // Necessary comment: explains specific test case input/output logic
        // 1 = 1
        assertEquals(0, solver.solution(1))
    }

    @Test
    fun testBoundaryMaximumValue() {
        // Necessary comment: explains specific test case input/output logic
        // Int.MAX_VALUE = 2147483647 = 1111...1111 (31 ones)
        assertEquals(0, solver.solution(Int.MAX_VALUE))
    }

    @Test
    fun testEdgeCaseTrailingZerosWithoutClosingOne() {
        // Necessary comment: explains specific test case input/output logic
        // 6 = 110 (gap is not closed)
        assertEquals(0, solver.solution(6))
        // 328 = 101001000 (gaps: 1, 2) -> max 2
        assertEquals(2, solver.solution(328))
    }

    @Test
    fun testEdgeCaseLargeGap() {
        // Necessary comment: explains specific test case input/output logic
        // 2^30 + 1 = 1073741825 = 100...001 (29 zeros)
        assertEquals(29, solver.solution(1073741825))
    }

    @Test
    fun testEdgeCaseAlternating() {
        // Necessary comment: explains specific test case input/output logic
        // 0x55555555 = 10101010...101
        assertEquals(1, solver.solution(0x55555555))
    }
}
