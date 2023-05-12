import problem_one_two_sum.TwoSumProblem

fun main(args: Array<String>) {
    // Two Sum Solution
    val exmArray = intArrayOf(1,3,7)
    val examTarget = 8
    val result =  TwoSumProblem.twoSum(exmArray,examTarget).toList()



    // Print solution
    println(result)

}