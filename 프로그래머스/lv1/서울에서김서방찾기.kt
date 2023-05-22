package 프로그래머스.lv1

fun findKim(seoul: Array<String>): String =
   "김서방은 ${seoul.indexOf("Kim")}에 있다"


fun main() {
    println(findKim(arrayOf("Jane","Kims","ans","droids","Kim")))
}