package problem_seven_reverse_integer

class ReverseInteger {

    companion object{
        fun reverseInteger(integer : Int) : Int{
            var rev = 0
            var x = integer
            while (x != 0) {
                val pop: Int = x % 10
                x /= 10
                if (rev > Int.MAX_VALUE / 10 || rev == Int.MAX_VALUE / 10 && pop > 7) return 0
                if (rev < Int.MIN_VALUE / 10 || rev == Int.MIN_VALUE / 10 && pop < -8) return 0
                rev = rev * 10 + pop
            }
            return rev


        }
    }
}