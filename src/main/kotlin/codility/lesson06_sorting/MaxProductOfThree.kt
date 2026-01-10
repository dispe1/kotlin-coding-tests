/**
 * https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 * Difficulty: Easy
 */
package codility.lesson06_sorting

import kotlin.math.max

class MaxProductOfThree {
    fun solution(A: IntArray): Int {
        A.sort()
        val n = A.size

        val option1 = A[n - 1] * A[n - 2] * A[n - 3]
        val option2 = A[0] * A[1] * A[n - 1]

        return max(option1, option2)
    }
}
