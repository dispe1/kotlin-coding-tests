/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Problem ID: 121
 * Difficulty: Easy
 */
package leetcode.array

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                val profit = price - minPrice
                maxProfit = maxOf(maxProfit, profit)
            }
        }

        return maxProfit
    }
}
