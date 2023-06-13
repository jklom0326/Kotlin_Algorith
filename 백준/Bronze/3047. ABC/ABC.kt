fun main() {
    val n = readln().split(" ").map { it.toInt() }.sorted()
    val abc = readln().split("")
    val list = mutableListOf<Int>()
    abc.forEach {
        when(it){
            "A" -> list.add(0)
            "B" -> list.add(1)
            "C" -> list.add(2)
        }
    }
    print("${n[list[0]]} ${n[list[1]]} ${n[list[2]]}")
}