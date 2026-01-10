package codility.lesson08_leader

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EquiLeaderTest {
    private val equiLeader = EquiLeader()

    @Test
    fun `sample test`() {
        val A = intArrayOf(4, 3, 4, 4, 4, 2)
        assertEquals(2, equiLeader.solution(A))
    }

    @Test
    fun `empty array`() {
        assertEquals(0, equiLeader.solution(intArrayOf()))
    }

    @Test
    fun `single element`() {
        assertEquals(0, equiLeader.solution(intArrayOf(5)))
    }

    @Test
    fun `two same elements`() {
        assertEquals(1, equiLeader.solution(intArrayOf(1, 1)))
    }
    
    @Test
    fun `two different elements`() {
        assertEquals(0, equiLeader.solution(intArrayOf(1, 2)))
    }

    @Test
    fun `all same elements`() {
        assertEquals(2, equiLeader.solution(intArrayOf(1, 1, 1)))
    }

    @Test
    fun `no leader global`() {
        assertEquals(0, equiLeader.solution(intArrayOf(1, 2, 3)))
    }

    @Test
    fun `leader exists but no equi leader`() {
        assertEquals(0, equiLeader.solution(intArrayOf(1, 1, 1, 0, 0)))
    }

    @Test
    fun `large values`() {
        val max = Int.MAX_VALUE
        assertEquals(2, equiLeader.solution(intArrayOf(max, max, max)))
    }
}
