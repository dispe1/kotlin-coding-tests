package codility.lesson10_prime_and_composite_numbers

class CountFactors {
    fun solution(N: Int): Int {
        if (N <= 0) return 0

        var result = 0
        var i = 1

        while (i * i < N) {
            if (N % i == 0) result += 2
            i++
        }
        if (i * i == N) result++

        return result
    }
}
