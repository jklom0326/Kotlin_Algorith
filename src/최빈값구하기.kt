fun main() {
    val array = readLine()!!.split(" ").map { it.toInt() }
    val intmap = mutableMapOf<Int,Int>()
    for (i in array) {
        if (!intmap.containsKey(i)){
            intmap[i] = 1
        } else {
            intmap[i] = intmap[i]!! + 1
        }
    }
    val mapsort = intmap.toList().sortedByDescending { it.second }.toMap().toMutableMap()
    val mapval = mapsort.map { it.value }
    val mapkey = mapsort.map { it.key }
    if (intmap.size > 1) {
        if (mapval[0] == mapval[1]) println (-1)
    }
    println(mapkey[0])
}