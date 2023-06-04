fun main() {
    val first = readln().split(" ").map { it.toInt() }
    val second = readln().split(" ").map { it.toInt() }
    val third = readln().split(" ").map { it.toInt() }
    val forth = ArrayList<Int>()
    repeat(2){
        if (first[it] == second[it]){
            forth.add(third[it])
        } else {
            if (second[it] == third[it]) forth.add(first[it]) else forth.add(second[it])
        }
    }
    forth.forEach {
        print("$it ")
    }
}