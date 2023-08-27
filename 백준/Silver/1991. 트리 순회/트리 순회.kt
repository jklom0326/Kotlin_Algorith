import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

private lateinit var sb: StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val head = Node('A', null, null)
    sb = StringBuilder()

    repeat(n) {
        val st = StringTokenizer(br.readLine(), " ")
        val node = st.nextToken()[0]
        val left = st.nextToken()[0]
        val right = st.nextToken()[0]

        insertNode(head, node, left, right)
    }


    preNodeSearch(head)
    println()
    inNodeSearch(head)
    println()
    postNodeSearch(head)
    println()
}

fun insertNode(temp: Node?, head: Char, left: Char, right: Char) {

    if (temp?.head == head) {
        if (left == '.') {
            temp.left = null
        } else {
            temp.left = Node(left, null, null)
        }

        if (right == '.') {
            temp.right = null
        } else {
            temp.right = Node(right, null, null)
        }
    } else {
        if (temp?.left != null) {
            insertNode(temp.left!!, head, left, right)
        }
        if (temp?.right != null) {
            insertNode(temp.right!!, head, left, right)
        }
    }
}

fun preNodeSearch(node: Node?) {
    if (node == null) return
    print(node.head)
    preNodeSearch(node.left)
    preNodeSearch(node.right)
}

fun inNodeSearch(node: Node?) {
    if (node == null) return
    inNodeSearch(node.left)
    print(node.head)
    inNodeSearch(node.right)
}

fun postNodeSearch(node: Node?) {
    if (node == null) return
    postNodeSearch(node.left)
    postNodeSearch(node.right)
    print(node.head)
}


data class Node(var head: Char, var left: Node?, var right: Node?)