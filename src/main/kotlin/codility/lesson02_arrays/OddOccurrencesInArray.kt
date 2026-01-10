/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 * Difficulty: Easy
 */
package codility.lesson02_arrays

class OddOccurrencesInArray {
    fun solution(A: IntArray): Int {
        var x = 0
        for (v in A) {
            x = x xor v
        }
        return x
    }
}
