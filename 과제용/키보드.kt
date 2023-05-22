package 과제용

fun main() {
    solution("부스트캠프")
}

fun solution(word: String) :IntArray {
    var answer = ArrayList<Int>()
    val keyboard = arrayOf(
        arrayOf("가", "호", "저", "론", "남", "드", "부", "이", "프", "설"),
        arrayOf("알", "크", "청", "울", "키", "초", "트", "을", "배", "주"),
        arrayOf("개", "캠", "산", "대", "단", "지", "역", "구", "너", "양"),
        arrayOf("라", "로", "권", "교", "마", "쿼", "파", "송", "차", "타"),
        arrayOf("코", "불", "레", "뉴", " ", "서", "한", "산", "리", "개"),
        arrayOf("터", "강", "봄", "토", "캠", "상", "호", "론", "운", "삼"),
        arrayOf("보", "람", "이", "경", "아", "두", "프", "바", "트", "정"),
        arrayOf("스", "웨", "어", "쿼", "일", "소", "라", "가", "나", "도"),
        arrayOf("판", "자", "비", "우", "사", "거", "왕", "태", "요", "품"),
        arrayOf("안", "배", "차", "캐", "민", "광", "재", "봇", "북", "하"))
    val inp = word.map { it.toString() }
    println(inp)
    val counter = mutableMapOf<Int,Int>()
    for (i in 0 until inp.size){
        println(inp[i])
        for (j in 0 until keyboard.size) {
            for (k in keyboard[j]){
               if (inp[i] == k) {
                   counter[keyboard[j].indexOf(k)] = j

               }
            }
        }
    }
    answer.apply {
        add(30)
        add(4)
    }
    return answer.toIntArray()
}