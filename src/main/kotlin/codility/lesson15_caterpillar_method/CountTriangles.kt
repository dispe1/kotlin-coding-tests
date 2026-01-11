/**
 * https://app.codility.com/programmers/lessons/15-caterpillar_method/count_triangles/
 * Difficulty: Medium
 */
package codility.lesson15_caterpillar_method

class CountTriangles {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n < 3) return 0

        A.sort()
        var count = 0L

        for (i in 0 until n - 2) {
            var k = i + 2
            for (j in i + 1 until n - 1) {
                while (k < n && A[i].toLong() + A[j].toLong() > A[k].toLong()) {
                    k++
                }
                count += (k - j - 1)
            }
        }

        return count.toInt()
    }
}
