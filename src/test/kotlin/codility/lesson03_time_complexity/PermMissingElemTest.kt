package codility.lesson03_time_complexity

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermMissingElemTest {
    private val solver = PermMissingElem()

    @Test
    fun testExample1() {
        // A = [2, 3, 1, 5], missing 4
        assertEquals(4, solver.solution(intArrayOf(2, 3, 1, 5)))
    }

    @Test
    fun testEmptyArray() {
        // N = 0, Range 1..(0+1) -> [1], missing 1
        assertEquals(1, solver.solution(intArrayOf()))
    }

    @Test
    fun testSingleElementMissingFirst() {
        // N = 1, Range 1..2 -> [2], missing 1
        assertEquals(1, solver.solution(intArrayOf(2)))
    }

    @Test
    fun testSingleElementMissingSecond() {
        // N = 1, Range 1..2 -> [1], missing 2
        assertEquals(2, solver.solution(intArrayOf(1)))
    }

    @Test
    fun testMissingFirstElement() {
        // N = 4, Range 1..5 -> [2, 3, 4, 5], missing 1
        assertEquals(1, solver.solution(intArrayOf(2, 3, 4, 5)))
    }

    @Test
    fun testMissingLastElement() {
        // N = 4, Range 1..5 -> [1, 2, 3, 4], missing 5
        assertEquals(5, solver.solution(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun testLargeInput() {
        // N = 100,000
        // Missing element is 100,001
        // Array contains 1..100,000
        val n = 100000
        val arr = IntArray(n)
        for (i in 0 until n) {
            arr[i] = i + 1
        }
        assertEquals(100001, solver.solution(arr))
    }

    @Test
    fun testLargeInputMissingOne() {
        // N = 100,000
        // Missing element is 1
        // Array contains 2..100,001
        val n = 100000
        val arr = IntArray(n)
        for (i in 0 until n) {
            arr[i] = i + 2
        }
        assertEquals(1, solver.solution(arr))
    }
}
