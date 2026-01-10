/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 * Difficulty: Easy
 */
package codility.lesson03_time_complexity

class FrogJmp {
    fun solution(X: Int, Y: Int, D: Int): Int {
        val dist = (Y - X).toLong()
        val d = D.toLong()
        return ((dist + d - 1) / d).toInt()
    }
}
