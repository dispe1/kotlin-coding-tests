/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 * Difficulty: Easy
 */
package codility.lesson05_prefix_sums

class PassingCars {
    fun solution(A: IntArray): Int {
        var zeroCount = 0
        var passingCars = 0L

        for (car in A) {
            if (car == 0) {
                zeroCount++
            } else {
                passingCars += zeroCount
                if (passingCars > 1_000_000_000) return -1
            }
        }

        return passingCars.toInt()
    }
}
