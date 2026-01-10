/**
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/
 * Difficulty: Medium
 */
package codility.lesson10_prime_and_composite_numbers

import kotlin.math.min

class MinPerimeterRectangle {
    fun solution(N: Int): Int {
        val n = N.toLong()
        var minPerimeter = Long.MAX_VALUE

        var i = 1L
        while (i * i <= n) {
            if (n % i == 0L) {
                val perimeter = 2 * (i + n / i)
                minPerimeter = min(minPerimeter, perimeter)
            }
            i++
        }

        return minPerimeter.toInt()
    }
}
