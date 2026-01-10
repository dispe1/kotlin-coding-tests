package codility.lesson05_prefix_sums

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class GenomicRangeQueryTest {
    private val solver = GenomicRangeQuery()

    @Test
    fun testExample1() {
        // S = "CAGCCTA"
        // P=[2, 5, 0], Q=[4, 5, 6]
        // 0: S[2..4] = "GCC" -> min('G','C','C') = 'C'(2)
        // 1: S[5..5] = "T"   -> min('T') = 'T'(4)
        // 2: S[0..6] = "CAGCCTA" -> min = 'A'(1)
        val s = "CAGCCTA"
        val p = intArrayOf(2, 5, 0)
        val q = intArrayOf(4, 5, 6)
        assertArrayEquals(intArrayOf(2, 4, 1), solver.solution(s, p, q))
    }

    @Test
    fun testSingleCharacterA() {
        // S="A", P=[0], Q=[0] -> 1
        assertArrayEquals(intArrayOf(1), solver.solution("A", intArrayOf(0), intArrayOf(0)))
    }

    @Test
    fun testSingleCharacterT() {
        // S="T", P=[0], Q=[0] -> 4
        assertArrayEquals(intArrayOf(4), solver.solution("T", intArrayOf(0), intArrayOf(0)))
    }

    @Test
    fun testAllSameCharacters() {
        // S="CCCC", P=[0, 1, 2], Q=[0, 2, 3] -> All 2
        val s = "CCCC"
        val p = intArrayOf(0, 1, 2)
        val q = intArrayOf(0, 2, 3)
        assertArrayEquals(intArrayOf(2, 2, 2), solver.solution(s, p, q))
    }

    @Test
    fun testNoAInString() {
        // S="CCGGTT"
        // 0..1(CC)->2, 2..3(GG)->3, 4..5(TT)->4
        val s = "CCGGTT"
        val p = intArrayOf(0, 2, 4)
        val q = intArrayOf(1, 3, 5)
        assertArrayEquals(intArrayOf(2, 3, 4), solver.solution(s, p, q))
    }

    @Test
    fun testFullRangeQuery() {
        // S="GTAC", P=[0], Q=[3] -> 'A' exists -> 1
        assertArrayEquals(intArrayOf(1), solver.solution("GTAC", intArrayOf(0), intArrayOf(3)))
    }

    @Test
    fun testLargeInput() {
        // S = 100,000 chars of 'T', except last one 'A'
        // N = 100,000, M = 1
        val sb = StringBuilder()
        for (i in 0 until 99999) sb.append('T')
        sb.append('A')
        val s = sb.toString()

        // Query 1: 0..99998 (All T) -> 4
        // Query 2: 0..99999 (Includes A) -> 1
        val p = intArrayOf(0, 0)
        val q = intArrayOf(99998, 99999)
        
        assertArrayEquals(intArrayOf(4, 1), solver.solution(s, p, q))
    }
}
