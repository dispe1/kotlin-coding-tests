package leetcode.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JumpGameTest {
    private val solver = JumpGame()

    @Test
    fun `example can reach`() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        assertTrue(solver.canJump(nums))
    }

    @Test
    fun `example cannot reach`() {
        val nums = intArrayOf(3, 2, 1, 0, 4)
        assertFalse(solver.canJump(nums))
    }

    @Test
    fun `single element`() {
        val nums = intArrayOf(0)
        assertTrue(solver.canJump(nums))
    }

    @Test
    fun `large jump early`() {
        val nums = intArrayOf(5, 0, 0, 0, 0)
        assertTrue(solver.canJump(nums))
    }

    @Test
    fun `stuck near end`() {
        val nums = intArrayOf(2, 0, 0, 0)
        assertFalse(solver.canJump(nums))
    }
}
