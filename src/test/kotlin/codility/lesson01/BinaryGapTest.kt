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
}
