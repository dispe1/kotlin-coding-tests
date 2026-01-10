/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 * Difficulty: Easy
 */
package codility.lesson01

import kotlin.math.max

class BinaryGap {
    fun solution(N: Int): Int {
        val sb = StringBuilder()
        var n = N
        while (n > 0) {
            sb.append(n % 2)
            n /= 2
        }
        val twoN = sb.toString()

        var lastOne = -1
        var ans = 0

        for (i in twoN.indices) {
            if (twoN[i] == '1') {
                if (lastOne != -1) {
                    ans = max(ans, i - lastOne - 1)
                }
                lastOne = i
            }
        }
        return ans
    }
}
