package codility.lesson03_time_complexity

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrogJmpTest {
    private val solver = FrogJmp()

    @Test
    fun testExample1() {
        // X=10, Y=85, D=30 -> ceil((85-10)/30) = ceil(75/30) = ceil(2.5) = 3
        assertEquals(3, solver.solution(10, 85, 30))
    }

    @Test
    fun testNoJumpNeeded() {
        // X=10, Y=10, D=30 -> 0 jumps
        assertEquals(0, solver.solution(10, 10, 30))
    }

    @Test
    fun testExactJump() {
        // X=10, Y=100, D=30 -> (100-10)/30 = 90/30 = 3 jumps
        assertEquals(3, solver.solution(10, 100, 30))
    }

    @Test
    fun testOneJump() {
        // X=10, Y=11, D=30 -> 1 jump
        assertEquals(1, solver.solution(10, 11, 30))
    }

    @Test
    fun testLargeDistanceSmallJump() {
        // X=1, Y=1_000_000_000, D=1
        // jumps = 999,999,999
        assertEquals(999999999, solver.solution(1, 1000000000, 1))
    }

    @Test
    fun testMaxValues() {
        // X=1, Y=1_000_000_000, D=1_000_000_000
        // jumps = 1
        assertEquals(1, solver.solution(1, 1000000000, 1000000000))
    }

    @Test
    fun testMaxValuesWithLongJump() {
        // X=1, Y=1_000_000_000, D=2 (Odd distance)
        // dist=999,999,999 -> ceil(999,999,999 / 2) = 500,000,000
        assertEquals(500000000, solver.solution(1, 1000000000, 2))
    }
}
