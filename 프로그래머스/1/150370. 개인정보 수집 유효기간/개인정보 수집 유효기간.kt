class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = ArrayList<Int>()
        val termMaps = HashMap<String, Int>()
        val date = getDate(today)
        for (i in terms) {
            val (type, num) = i.split(" ").map{ it.toString()}
            termMaps[type] = num.toInt()
        }
        for (i in privacies.indices) {
            val (privacyDate, type) = privacies[i].split(" ").map{ it.toString() }
            if (getDate(privacyDate) + termMaps[type]!! * 28 <= date) {
                answer.add(i + 1)
            }
        }
        return answer.toIntArray()
    }
    
    fun getDate(today: String): Int {
        val (year, month, day) = today.split(".").map{it.toInt()}
        return year * 12 * 28 + month * 28 + day
    }
}