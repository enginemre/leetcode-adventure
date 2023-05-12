import problem_one_two_sum.TwoSumProblem
import problem_two_add_two_numbers.AddTwoNumbers
import problem_two_add_two_numbers.ListNode

fun main() {
    // Two Sum Solution
    // val exmArray = intArrayOf(1,3,7)
    // val examTarget = 8
    // val result =  TwoSumProblem.twoSum(exmArray,examTarget).toList()

    // Add Two Numbers Solution
    val l1 = ListNode(7)
    l1.next = ListNode(8)
    val l2 =ListNode(2)
    l2.next = ListNode(6)
    val result = AddTwoNumbers.addTwoNumbersIterative(l1,l2)

    // Print solution
    println(result.toString())

}