class Solution {
    fun addStrings(num1: String, num2: String): String {
        var pt1 = num1.length -1
        var pt2 = num2.length -1
        var carry = 0
        val result = StringBuilder()
        while(pt1 >= 0 || pt2 >= 0) {
            val value1 = if(pt1 >= 0) Character.getNumericValue(num1[pt1]) else 0
            val value2 = if(pt2 >= 0) Character.getNumericValue(num2[pt2]) else 0
            val addition = value1 + value2 + carry
            result.append(addition%10)
            carry = addition/10
            pt1 -= 1
            pt2 -= 1
        }
        if(carry > 0) result.append(carry)
        return result.toString().reversed()
    }
}
