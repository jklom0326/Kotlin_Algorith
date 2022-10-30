package 온보딩

fun solution7(
    user: String, friends: List<List<String>>, visitors: List<String>
): List<String> {
    println(friends)
    val friendSet = mutableSetOf<String>()
    val friendMap = mutableMapOf<String, List<String>>()
    // 유저의 친구 목록
    searchFriends(friends, user, friendSet)
    println(friendSet)

    friends.forEach {
        if (friendSet.contains(it[0]))
            friendMap[it[0]] = it
    }

    return listOf()
}

private fun searchFriends(
    friends: List<List<String>>, user: String, friendSet: MutableSet<String>
) {
    friends.forEach {
        if (it[1] == user || it[0] == user) {
            friendSet += it[0]
        }
    }
}

fun isValidUserName(nickName: String): Boolean = "[a-z]{1,30}".toRegex().matches(nickName)

fun main() {
    solution7(
        "mrko", listOf(
            listOf("donut", "andole"),
            listOf("donut", "jun"),
            listOf("donut", "mrko"),
            listOf("shakevan", "andole"),
            listOf("shakevan", "jun"),
            listOf("shan", "donchoi"),
            listOf("shakevan", "mrko")
        ), listOf("bedi", "bedi", "donut", "bedi", "shakevan")
    )
}