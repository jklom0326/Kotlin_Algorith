package 프로그래머스.lv0
fun hateEnglish(numbers: String): Long {
    var answer: Long = 0
    var number = numbers
    var numstr = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
    for (i in 0..9){

        number = number.replace(numstr,i.toString())
    }
    return answer
}
fun main() {
    println(hateEnglish("onetwothreefourfivesixseveneightnine"))
}