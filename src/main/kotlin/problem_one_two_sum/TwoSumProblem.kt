package problem_one_two_sum

import util.SolutionNotFoundException

class TwoSumProblem {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = mutableMapOf<Int,Int>()
            nums.forEachIndexed { index, num ->
                val temp =  target - num
                if (map.containsKey(temp))
                    return intArrayOf(index,map.getValue(temp))
                map[num] = index
            }

            throw SolutionNotFoundException()
        }
    }

}