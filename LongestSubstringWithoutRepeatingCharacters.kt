import LongestSubstringWithoutRepeatingCharacters.Companion.lengthOfLongestSubstring

class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     */

    /** EXAMPLE # 1
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     */

    companion object {
        fun lengthOfLongestSubstring(s: String): Int {

//            val charMap: MutableMap<Char, Int> = mutableMapOf()
//            val subStringMap: MutableMap<String, Int> = mutableMapOf()
//            val subString: StringBuilder = StringBuilder("");
//
//            s.forEach { c ->
//                if (charMap.containsKey(c)) {
//                    subStringMap[subString.toString()] = subString.length
//                    subString.delete(0, subString.length)
//                    charMap.clear();
//                }
//                charMap[c] = 1
//                subString.append(c)
//            }
//
//            subStringMap[subString.toString()] = subString.length
//            val maxEntry = subStringMap.maxWith { x, y -> x.value.compareTo(y.value) }
//            println(maxEntry.value)
//            return maxEntry.value

            var subStringList: MutableList<String> = mutableListOf(s)
            val tempList: MutableList<String> = mutableListOf()
            tempList.addAll(subStringList)
            var subString: String = "";
            var lastIndex = 0

            for (i in 0..subStringList.size) {
                subStringList[i].forEachIndexed { index, c ->
                    lastIndex = s.lastIndexOf(c)
                    if(index == s.lastIndexOf(c)){
                        lastIndex = s.length
                    }
                    subString = s.substring(index, lastIndex)
                    subStringList.add(subString)
                }

            }



           val maxLengthSubString = subStringList.maxWith { x, y -> x.compareTo(y) }.length
            println(maxLengthSubString)
            return maxLengthSubString;
        }
    }
}

fun main() {
//    lengthOfLongestSubstring("abcabcbb")
//    lengthOfLongestSubstring("bbbbb")
//    lengthOfLongestSubstring("pwwkew")
//    lengthOfLongestSubstring(" ")
    lengthOfLongestSubstring("aab")
}