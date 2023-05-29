package problem_four_median_of_two_sorted_array

class MedianOfTwoSortedArray {

    companion object{

        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val mergedArray = nums1.plus(nums2)
            mergedArray.sort()
            val median = if (mergedArray.size % 2 != 0) {
                mergedArray[mergedArray.size / 2].toDouble()
            } else
                (mergedArray[mergedArray.size / 2].toDouble() + mergedArray[mergedArray.size / 2 - 1].toDouble()) / 2
            return median
        }
    }
}