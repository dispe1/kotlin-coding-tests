/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 * Difficulty: Easy
 */
package codility.lesson04_counting_elements

class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val visited = BooleanArray(X + 1)
        var remaining = X
        for (i in A.indices) {
            val position = A[i]
            if (position <= X && !visited[position]) {
                visited[position] = true
                remaining--

                if (remaining == 0) return i
            }
        }

        return -1
    }
}
