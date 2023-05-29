package problem_eight_string_to_int_atoi

class StringToAtoI {
    companion object{
        fun myAtoI(s :String) : Int{
            var sign = 0
            var num: Long = Long.MAX_VALUE
            loop@ for (c in s) {
                when (c) {
                    ' ' -> {
                        if (sign != 0 || num != Long.MAX_VALUE)
                            break@loop
                    }
                    '+' -> {
                        if (num == Long.MAX_VALUE && sign == 0)
                            sign = 1
                        else break@loop
                    }
                    '-' -> {
                        if (num == Long.MAX_VALUE && sign == 0)
                            sign = -1
                        else break@loop
                    }
                    in '0'..'9' -> {
                        if (num == Long.MAX_VALUE) num = (c - '0').toLong()
                        else num = num * 10 + (c - '0').toLong()
                        if (num > Int.MAX_VALUE) break@loop
                    }
                    else -> break@loop

                }
            }

            if (num == Long.MAX_VALUE) return 0
            if (sign == 0) sign = 1
            val res = sign * num

            if (res > Int.MAX_VALUE) return Int.MAX_VALUE
            else if (res < Int.MIN_VALUE) return Int.MIN_VALUE
            else return res.toInt()
        }
    }
}