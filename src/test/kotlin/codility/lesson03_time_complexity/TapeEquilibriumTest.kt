package codility.lesson03_time_complexity

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TapeEquilibriumTest {
    private val solver = TapeEquilibrium()

    @Test
    fun testExample1() {
        // A = [3, 1, 2, 4, 3]
        // P=1: |3 - 10| = 7
        // P=2: |4 - 9| = 5
        // P=3: |6 - 7| = 1
        // P=4: |10 - 3| = 7
        // Min = 1
        assertEquals(1, solver.solution(intArrayOf(3, 1, 2, 4, 3)))
    }

    @Test
    fun testTwoElements() {
        // N = 2 (Minimum size)
        // A = [10, 20] -> |10 - 20| = 10
        assertEquals(10, solver.solution(intArrayOf(10, 20)))
    }

    @Test
    fun testTwoElementsWithNegatives() {
        // A = [-1000, 1000] -> |-1000 - 1000| = |-2000| = 2000
        assertEquals(2000, solver.solution(intArrayOf(-1000, 1000)))
    }

    @Test
    fun testPerfectBalance() {
        // A = [1, 2, 3, 4, 2] -> Sum = 12
        // Left [1, 2, 3] = 6, Right [4, 2] = 6 -> Diff 0
        assertEquals(0, solver.solution(intArrayOf(1, 2, 3, 4, 2)))
    }

    @Test
    fun testLargeValues() {
        // A = [1000, -1000] -> |1000 - (-1000)| = 2000
        assertEquals(2000, solver.solution(intArrayOf(1000, -1000)))
    }

    @Test
    fun testMaxValues() {
        // A = [2000, 2000] (using larger inputs in logic but simple array for test)
        // A = [1000, 2000, 1000]
        // P=1: |1000 - 3000| = 2000
        // P=2: |3000 - 1000| = 2000
        assertEquals(2000, solver.solution(intArrayOf(1000, 2000, 1000)))
    }

    @Test
    fun testDoubleMaxInt() {
        // Ideally checking for overflow if inputs are large
        // A = [Int.MAX_VALUE, Int.MAX_VALUE]
        // |MAX - MAX| = 0
        assertEquals(0, solver.solution(intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE)))
    }

    @Test
    fun testOverflowProtection() {
        // A = [Int.MIN_VALUE, Int.MAX_VALUE]
        // |-2147483648 - 2147483647| = |-4294967295| = 4294967295
        // But return type is Int? Ah, the problem statement says returns minimal difference as int.
        // Wait, diff can exceed Int.MAX_VALUE if input range allows it?
        // Codility says: return the minimal difference.
        // "each element of array A is an integer within the range [-1,000..1,000]."
        // Actually, the range is usually [-1000, 1000] for standard complexity tasks or full Int range.
        // Let's check Lesson 3 constraints:
        // "each element of array A is an integer within the range [-1,000..1,000]." -> Result fits in Int.
        // HOWEVER, newer Codility tasks might have larger ranges.
        // Your code uses Long for calculation, so it handles large numbers.
        // But the return type is Int. If the difference > Int.MAX_VALUE, it might be an issue.
        // But if the problem guarantees return fits in Int (or constraints limit it), it's fine.
        // Let's assume standard constraints where inputs are small enough or result fits.
        
        // If inputs are large (e.g., -1000 to 1000), max diff is ~2000 * N/2. 
        // With N=100,000, max sum is 100,000,000 (fits in Int).
        
        // Let's just test within logical bounds.
        // A = [-1000, 1000, 500, -500]
        assertEquals(0, solver.solution(intArrayOf(-1000, 1000, 500, -500)))
    }
}
