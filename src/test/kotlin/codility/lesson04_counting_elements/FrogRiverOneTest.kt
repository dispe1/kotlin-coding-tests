package codility.lesson04_counting_elements

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrogRiverOneTest {
    private val solver = FrogRiverOne()

    @Test
    fun testExample1() {
        // X = 5
        // A = [1, 3, 1, 4, 2, 3, 5, 4]
        // Time 0: pos 1 (rem 4)
        // Time 1: pos 3 (rem 3)
        // Time 2: pos 1 (dup)
        // Time 3: pos 4 (rem 2)
        // Time 4: pos 2 (rem 1)
        // Time 5: pos 3 (dup)
        // Time 6: pos 5 (rem 0) -> Return 6
        assertEquals(6, solver.solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
    }

    @Test
    fun testSingleElement() {
        // X = 1, A = [1] -> Time 0
        assertEquals(0, solver.solution(1, intArrayOf(1)))
    }

    @Test
    fun testImpossibleToCross() {
        // X = 2, A = [1, 1, 1] -> Missing 2
        assertEquals(-1, solver.solution(2, intArrayOf(1, 1, 1)))
    }

    @Test
    fun testImpossibleMissingIntermediate() {
        // X = 5, A = [1, 2, 3, 5] -> Missing 4
        assertEquals(-1, solver.solution(5, intArrayOf(1, 2, 3, 5)))
    }

    @Test
    fun testValuesLargerThanX() {
        // X = 2, A = [1, 3, 4, 2]
        // Time 0: 1 (rem 1)
        // Time 1: 3 (ignore)
        // Time 2: 4 (ignore)
        // Time 3: 2 (rem 0) -> Return 3
        assertEquals(3, solver.solution(2, intArrayOf(1, 3, 4, 2)))
    }

    @Test
    fun testReverseOrder() {
        // X = 3, A = [3, 2, 1] -> Last one is 1 at time 2
        assertEquals(2, solver.solution(3, intArrayOf(3, 2, 1)))
    }

    @Test
    fun testLargeInput() {
        // X = 100,000
        // A = [1, 2, ..., 100,000]
        val x = 100000
        val a = IntArray(x) { it + 1 }
        // Last element 100,000 appears at index 99,999
        assertEquals(99999, solver.solution(x, a))
    }
}
