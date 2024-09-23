private val n = readln().toInt()
private val m = readln().toInt()
private val parent = Array(n + 1) { 0 }

fun main() {
    val network = arrayListOf<Network>()
    repeat(m) {
        val (a, b, cost) = readln().split(" ").map { it.toInt() }
        network.add(Network(a, b, cost))
    }
    network.sortBy { it.cost }

    repeat(n + 1) { i ->
        parent[i] = i
    }

    var result = 0

    for (i in 0 until m) {
        if (find(network[i].a) != find(network[i].b)) {
            union(network[i].a, network[i].b)
            result += network[i].cost
        }
    }
    println(result)
}

private fun find(a: Int): Int {
    return if (parent[a] == a) a else find(parent[a]).also { parent[a] = it }
}

private fun union(
    a: Int,
    b: Int,
) {
    val pa: Int = find(a)
    val pb: Int = find(b)
    parent[pa] = pb
}

data class Network(val a: Int, val b: Int, val cost: Int)
