/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * Difficulty: Easy
 */
package codility.lesson02_arrays

class CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        val n = A.size
        if (n == 0) return A

        val k = K % n
        if (k == 0) return A

        val res = IntArray(n)
        for (i in 0 until n) {
            res[(i + k) % n] = A[i]
        }
        return res
    }
}
