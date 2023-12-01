package _01_LinearSearch

private class LinearSearch {
    fun search(array: IntArray, target: Int): Int {
        for (i in array.indices) {
            if (array[i] == target) {
                return i
            }
        }
        return -1
    }
}

fun main( ) {
    val linearSearch = LinearSearch()
    val array = intArrayOf(10, 2, -3, 109, 8, 23, 64, 20, 19, 56, 9)
    println(linearSearch.search(array, 23))
}