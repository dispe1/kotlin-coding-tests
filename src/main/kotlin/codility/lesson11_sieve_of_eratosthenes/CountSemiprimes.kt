/**
 * https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_semiprimes/
 * Difficulty: Medium
 */
package codility.lesson11_sieve_of_eratosthenes

class CountSemiprimes {
    fun solution(N: Int, P: IntArray, Q: IntArray): IntArray {
        if (N < 1 || P.isEmpty()) return IntArray(P.size)

        val spf = IntArray(N + 1)
        var i = 2
        while (i * i <= N) {
            if (spf[i] == 0) {
                var k = i * i
                while (k <= N) {
                    if (spf[k] == 0) spf[k] = i
                    k += i
                }
            }
            i++
        }

        val isSemi = IntArray(N + 1)
        for (j in 4..N) {
            val p = spf[j]
            if (p != 0) {
                val q = j / p
                if (q >= 2 && spf[q] == 0) isSemi[j] = 1
            }
        }

        val prefix = IntArray(N + 1)
        for (j in 1..N) prefix[j] = prefix[j - 1] + isSemi[j]

        val m = P.size
        val result = IntArray(m)
        for (k in 0 until m) {
            val from = P[k]
            val to = Q[k]
            result[k] = prefix[to] - prefix[from - 1]
        }

        return result
    }
}
