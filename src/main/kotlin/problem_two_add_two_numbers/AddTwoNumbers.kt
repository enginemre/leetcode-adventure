package problem_two_add_two_numbers

class AddTwoNumbers {


    companion object {

        fun  addTwoNumbersIterative(l1: ListNode?, l2: ListNode?) : ListNode?{
            var firstList = l1
            var secondList = l2
            val temp = ListNode(0)
            var result: ListNode? = temp
            var carry = 0
            while (firstList != null || secondList != null || carry > 0) {
                val number1 = firstList?.value ?: 0
                val number2 = secondList?.value ?: 0
                val sum = (number1 + number2 + carry) % 10
                carry = (number1 + number2 + carry) / 10
                result?.next = ListNode(sum)
                result = result?.next
                firstList?.let { firstList =  it.next }
                secondList?.let { secondList  = it.next }
            }
            return temp.next
        }
        fun addTwoNumbersRecursive(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
            if (l1 == null && l2 == null && carry == 0) return null
            val s = l1.value() + l2.value() + carry
            return ListNode(s % 10).apply { next = addTwoNumbersRecursive(l1?.next, l2?.next, s / 10) }
        }
    }
}
class ListNode(var value: Int) {
    var next: ListNode? = null
}

// Extension function for preventing null calling with replacing zero
fun ListNode?.value() = this?.value ?: 0