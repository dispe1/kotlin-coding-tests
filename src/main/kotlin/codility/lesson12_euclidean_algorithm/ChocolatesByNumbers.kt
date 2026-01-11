/**
 * https://app.codility.com/programmers/lessons/12-euclidean_algorithm/chocolates_by_numbers/
 * Difficulty: Easy
 */
package codility.lesson12_euclidean_algorithm

class ChocolatesByNumbers {
    fun solution(N: Int, M: Int): Int {
        val g = gcd(N, M)
        return N / g
    }

    private fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val r = x % y
            x = y
            y = r
        }
        return x
    }
}
