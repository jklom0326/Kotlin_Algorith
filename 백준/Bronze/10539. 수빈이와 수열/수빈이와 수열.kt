fun main() {
    val listSize = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val arrayList = ArrayList<Int>()
    var sum = 0
    for (i in 0 until listSize) {
        arrayList.add((list[i] * (i + 1)) - sum)
        sum += arrayList[i]
    }
    for (num in arrayList){
        print("$num ")
    }
}