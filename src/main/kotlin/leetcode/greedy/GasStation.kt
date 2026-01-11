/**
 * https://leetcode.com/problems/gas-station/
 * Problem ID: 134
 * Difficulty: Medium
 */
package leetcode.greedy

class GasStation {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val n = gas.size

        var total = 0L
        var tank = 0L
        var start = 0

        for (i in 0 until n) {
            val diff = gas[i] - cost[i]
            total += diff
            tank += diff

            if (tank < 0) {
                start = i + 1
                tank = 0
            }
        }

        return if (total >= 0) start else -1
    }
}
