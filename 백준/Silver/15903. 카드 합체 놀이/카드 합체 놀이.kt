fun main() {
    val (n,m) = readln().split(" ").map { it.toLong() }
    var card = readln().split(" ").map { it.toLong() }.sorted().toMutableList()

    repeat(m.toInt()){
        card = card.sorted().toMutableList()
        var sum = card[0] + card[1]
        card[0] = sum
        card[1] = sum
    }

    println(card.sum())
}