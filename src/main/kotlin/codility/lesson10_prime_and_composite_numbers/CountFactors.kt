package codility.lesson10_prime_and_composite_numbers

class CountFactors {
    fun solution(N: Int): Int {
        if (N <= 0) return 0

        val target = N.toLong()
        var result = 0
        var i = 1L

        while (i * i < target) {
            if (N % i.toInt() == 0) result += 2
            i++
        }
        if (i * i == target) result++

        return result
    }
}
