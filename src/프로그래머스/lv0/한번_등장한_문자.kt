package 프로그래머스.lv0

fun onecount(s: String): String {
        var answer: String = ""
        var answerset = s.toSet()
        for (i in answerset){
            if (s.count {i == it} == 1) answer += i
        }
        return answer.toList().sorted().joinToString("")
}

fun main() {
    println(onecount("abdc"))
}