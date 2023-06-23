import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val answer: MutableList<Int> = ArrayList()
    val input = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }
    val height = LongArray(N)
    for (i in 0 until N) {
        height[i] = input[i].toInt().toLong()
    }
    val stack = Stack<StackInfo>()
    stack.add(StackInfo(1, height[0]))
    answer.add(0)
    var flag = true
    for (i in 1 until N) {
        while (!stack.isEmpty()) {
            val info = stack.peek()
            if (info.height <= height[i]) {
                stack.pop()
                flag = true
            } else {
                answer.add(info.index.toInt())
                stack.push(StackInfo((i + 1).toLong(), height[i]))
                flag = false
                break
            }
        }
        if (flag) {
            answer.add(stack.size)
            stack.push(StackInfo((i + 1).toLong(), height[i]))
        }
    }
    for (i in 0 until N) {
        print(answer[i].toString() + " ")
    }
}

data class StackInfo(var index: Long, var height: Long)
