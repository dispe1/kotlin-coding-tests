package codility.lesson02_arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OddOccurrencesInArrayTest {
    private val solver = OddOccurrencesInArray()

    @Test
    fun testExample1() {
        // [9, 3, 9, 3, 9, 7, 9] -> 7
        val result = solver.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))
        assertEquals(7, result)
    }

    @Test
    fun testSingleElement() {
        // [42] -> 42
        val result = solver.solution(intArrayOf(42))
        assertEquals(42, result)
    }

    @Test
    fun testSimplePair() {
        // [2, 2, 3, 3, 4] -> 4
        val result = solver.solution(intArrayOf(2, 2, 3, 3, 4))
        assertEquals(4, result)
    }

    @Test
    fun testLargeNumbers() {
        // [1000000000, 5, 1000000000] -> 5
        val result = solver.solution(intArrayOf(1000000000, 5, 1000000000))
        assertEquals(5, result)
    }

    @Test
    fun testManyElements() {
        // 5 elements (2 pairs + 1 unique)
        // [5, 5, 1, 2, 2] -> 1
        val result = solver.solution(intArrayOf(5, 5, 1, 2, 2))
        assertEquals(1, result)
    }

    @Test
    fun testLargeArrayWithSamePairValues() {
        // Construct array: 100,000 ones + one 2
        // Size: 100,001 (odd)
        // [1, 1, ..., 1, 2]
        val n = 100000
        val arr = IntArray(n + 1)
        for (i in 0 until n) {
            arr[i] = 1
        }
        arr[n] = 2 // The unique element

        assertEquals(2, solver.solution(arr))
    }

    @Test
    fun testExtremeLargeArray() {
        // Construct array: 999,998 elements (499,999 pairs) + 1 unique
        // Using distinct pairs to stress test XOR
        // Pairs: 0,0, 1,1, 2,2, ...
        val pairsCount = 499999
        val arr = IntArray(pairsCount * 2 + 1)
        
        for (i in 0 until pairsCount) {
            arr[2 * i] = i
            arr[2 * i + 1] = i
        }
        // Unique element at the end
        val uniqueVal = 999999
        arr[arr.size - 1] = uniqueVal

        assertEquals(uniqueVal, solver.solution(arr))
    }
}
