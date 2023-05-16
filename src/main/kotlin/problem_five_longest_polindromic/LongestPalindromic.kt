package problem_five_longest_polindromic

class LongestPalindromic {

    companion object{

        // Palindromic means that when we reverse the string it's same for each side
        // Example aba or abba both are valid.
        private fun foundPalindromic(s: String, resInit: String, i: Int, j: Int): String {
            var res = resInit
            var l = i
            var r = j

            while (l >= 0 && r < s.length && s[l]==s[r]) {
                if (r -l  +1 > res.length)
                    res = s.substring(IntRange(l, r))
                l--
                r++
            }
            return res
        }

        fun longestPalindromic(s: String): String {
            if (s.isEmpty())
                return ""
            var res: String = s[0].toString()

            for (i in s.indices) {
                res = foundPalindromic(s, res, i, i)
                res = foundPalindromic(s, res, i, i + 1)
            }
            return res
        }
    }
}