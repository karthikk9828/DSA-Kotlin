package _02_BinarySearch

import kotlin.math.floor

class BinarySearch {
  fun search(array: IntArray, target: Int): Int {
    var start = 0
    var end = array.size - 1

    while (start <= end) {
      /*
        for very large input, (start + end) might throw error as integer has a max value that it can store
        so use start + (end - start) / 2
        It is basically same
      */
      val mid = floor(start + ((end - start) / 2.0)).toInt()

        if (target == array[mid]) {
            return mid;
        } else if (target < array[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return -1
  }
}

fun main() {
  val binarySearch = BinarySearch()
  val array = intArrayOf(-10, -4, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48)
  println(binarySearch.search(array, -87))
}