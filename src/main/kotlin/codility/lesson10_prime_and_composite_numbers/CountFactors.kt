package codility.lesson10_prime_and_composite_numbers

class CountFactors {
    fun solution(N: Int): Int {
        if (N <= 0) return 0

        var result = 0
        var i = 1
        val target = N.toLong()

        while (i.toLong() * i < target) {
            if (N % i == 0) result += 2
            i++
        }
        if (i.toLong() * i == target) result++

        return result
    }
}
