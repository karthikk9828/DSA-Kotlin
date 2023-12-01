package _01_LinearSearch

/*
  https://leetcode.com/problems/richest-customer-wealth/
*/

private class MaxWealth {
    fun solve(accounts: Array<Array<Int>>): Int {
        var max = 0

        for (account in accounts) {
            var total = 0
            for (balance in account) {
                total += balance
                if (total > max) {
                    max = total;
                }
            }
        }
        return max
    }
}

fun main() {
    val maxWealth = MaxWealth()
    val array = arrayOf(arrayOf(2,1,5), arrayOf(30,6,100))
    println(maxWealth.solve(array))
}