package 문자열

fun main() {
    val n = readLine()!!.toString()
    val arr = mutableListOf<Char>()
    arr[1].isUpperCase()
    for (i in n.indices) {
        arr.add(n[i].uppercaseChar())
    }
    val map = mutableMapOf<Char, Int>()
    arr.forEach {
        if (map.containsKey(it)) {
            map[it] = map[it]!!.plus(1)
        } else{
            map.set(it, 1)
        }
    }
    val max = map.maxByOrNull { it.value }
    // 예외처리구간
    if (map.filter { it.value == max!!.value }. count() > 1){
        println("?")
    }else{
        println(max!!.key)
    }
}