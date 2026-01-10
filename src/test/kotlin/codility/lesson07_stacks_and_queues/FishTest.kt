package codility.lesson07_stacks_and_queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FishTest {
    private val solver = Fish()

    @Test
    fun testExample() {
        // A = [4, 3, 2, 1, 5], B = [0, 1, 0, 0, 0] -> 2 survivors
        val a = intArrayOf(4, 3, 2, 1, 5)
        val b = intArrayOf(0, 1, 0, 0, 0)
        assertEquals(2, solver.solution(a, b))
    }

    @Test
    fun testAllSameDirectionUpstream() {
        // [4, 3, 2, 1, 5], [0, 0, 0, 0, 0] -> 5
        val a = intArrayOf(4, 3, 2, 1, 5)
        val b = intArrayOf(0, 0, 0, 0, 0)
        assertEquals(5, solver.solution(a, b))
    }

    @Test
    fun testAllSameDirectionDownstream() {
        // [4, 3, 2, 1, 5], [1, 1, 1, 1, 1] -> 5
        val a = intArrayOf(4, 3, 2, 1, 5)
        val b = intArrayOf(1, 1, 1, 1, 1)
        assertEquals(5, solver.solution(a, b))
    }

    @Test
    fun testSingleFish() {
        assertEquals(1, solver.solution(intArrayOf(10), intArrayOf(0)))
        assertEquals(1, solver.solution(intArrayOf(10), intArrayOf(1)))
    }

    @Test
    fun testTwoFishNoMeeting() {
        // Fish 0 (size 10, up), Fish 1 (size 5, down) -> Never meet
        assertEquals(2, solver.solution(intArrayOf(10, 5), intArrayOf(0, 1)))
    }

    @Test
    fun testTwoFishMeetingUpstreamWins() {
        // Fish 0 (size 10, down), Fish 1 (size 5, up) -> 0 wins
        assertEquals(1, solver.solution(intArrayOf(10, 5), intArrayOf(1, 0)))
    }

    @Test
    fun testTwoFishMeetingDownstreamWins() {
        // Fish 0 (size 5, down), Fish 1 (size 10, up) -> 1 wins
        assertEquals(1, solver.solution(intArrayOf(5, 10), intArrayOf(1, 0)))
    }

    @Test
    fun testBigOneEatsAll() {
        // [10, 1, 2, 3, 4], [1, 0, 0, 0, 0] -> 1 (10 eats everyone)
        val a = intArrayOf(10, 1, 2, 3, 4)
        val b = intArrayOf(1, 0, 0, 0, 0)
        assertEquals(1, solver.solution(a, b))
    }

    @Test
    fun testChainEating() {
        // [1, 2, 10, 5, 4], [1, 1, 1, 0, 0] -> 3 (10 survived + 1, 2 eat nothing but stay in stack)
        // Wait: 1 and 2 are downstream, 10 is downstream. 5 and 4 are upstream.
        // 10 eats 5 and 4. Stack has [1, 2, 10]. Total 3.
        val a = intArrayOf(1, 2, 10, 5, 4)
        val b = intArrayOf(1, 1, 1, 0, 0)
        assertEquals(3, solver.solution(a, b))
    }

    @Test
    fun testLargeInput() {
        val n = 100000
        val a = IntArray(n) { it }
        val b = IntArray(n) { 0 }
        // All upstream
        assertEquals(n, solver.solution(a, b))
    }
}
