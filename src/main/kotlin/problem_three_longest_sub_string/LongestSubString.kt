package problem_three_longest_sub_string

import kotlin.math.max

class LongestSubString {

    companion object{
        fun getLongestSubString(string : String):Int{
            if(string.length < 2)
                return string.length
            val letters = string.toCharArray()
            val resultMap = mutableMapOf<Char,Int>(letters[0] to 0)
            var index = 1
            var currentStart = 0
            var maxRepeat = 1
            while (index <= letters.lastIndex){
                val char = letters[index]
                val prevIndex = resultMap[char]
                if (prevIndex != null && prevIndex >= currentStart){
                    val len = index - currentStart
                    maxRepeat = max(len,maxRepeat)
                    currentStart = prevIndex +1
                }
                else if(index == letters.lastIndex){
                    val len = index -currentStart +1
                    return max(len,maxRepeat)
                }
                resultMap[char] = index
                index += 1
            }
            return maxRepeat
        }
    }
}