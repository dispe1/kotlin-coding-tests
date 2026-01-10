/**
 * https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 * Difficulty: Medium
 */
package codility.lesson06_sorting

class NumberOfDiscIntersections {
    fun solution(A: IntArray): Int {
        val n = A.size
        if (n < 2) return 0

        val left = LongArray(n)
        val right = LongArray(n)

        for (i in A.indices) {
            val r = A[i].toLong()
            left[i] = i - r
            right[i] = i + r
        }

        left.sort()
        right.sort()

        var l = 0
        var r = 0

        var activate = 0L
        var intersect = 0L

        while (l < n) {
            if (left[l] <= right[r]) {
                intersect += activate
                if (intersect > 10_000_000L) return -1
                activate++
                l++
            } else {
                activate--
                r++
            }
        }

        return intersect.toInt()
    }
}
