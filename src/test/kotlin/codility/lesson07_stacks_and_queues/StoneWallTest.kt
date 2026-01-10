package codility.lesson07_stacks_and_queues

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneWallTest {
    @Test
    fun `sample test`() {
        val H = intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)
        assertEquals(7, StoneWall().solution(H))
    }

    @Test
    fun `empty array`() {
        assertEquals(0, StoneWall().solution(intArrayOf()))
    }

    @Test
    fun `single element`() {
        assertEquals(1, StoneWall().solution(intArrayOf(5)))
    }

    @Test
    fun `flat wall`() {
        assertEquals(1, StoneWall().solution(intArrayOf(5, 5, 5, 5, 5)))
    }

    @Test
    fun `strictly increasing`() {
        assertEquals(5, StoneWall().solution(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `strictly decreasing`() {
        assertEquals(5, StoneWall().solution(intArrayOf(5, 4, 3, 2, 1)))
    }

    @Test
    fun `v shape`() {
        assertEquals(3, StoneWall().solution(intArrayOf(5, 1, 5)))
    }

    @Test
    fun `pyramid shape`() {
        assertEquals(2, StoneWall().solution(intArrayOf(1, 5, 1)))
    }

    @Test
    fun `sawtooth shape`() {
        assertEquals(3, StoneWall().solution(intArrayOf(1, 2, 1, 2)))
    }
}
