class Solution {
    fun solution(n: Int, tops: IntArray): Int {
        var answer: Int = 0
        val dp1 = IntArray(n) { 0 }
        val dp2 = IntArray(n) { 0 }
        
        dp1[0] = 1
        dp2[0] = 2 + tops[0]

        for (i in 1 until n) {
            dp1[i] = (dp1[i - 1] + dp2[i - 1]) % 10007
            dp2[i] = ((dp1[i - 1] * (1 + tops[i])) + (dp2[i - 1] * (2 + tops[i]))) % 10007
        }
        answer = (dp1.last() + dp2.last()) % 10007
        return answer
    }
}