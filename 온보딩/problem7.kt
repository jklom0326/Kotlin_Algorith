package 온보딩

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    val friendSet = mutableSetOf<String>()
    var friendMap = mutableMapOf<String, Int>()
    var result = listOf<String>()
    // 유저의 친구 목록
    searchFriends(friends, user, friendSet)
    // 친구의 친구 점수
    friendMap = friendsScore(friends, friendSet, user)
    // 방문자의 점수
    visitorScore(visitors, friendSet, friendMap)
    // 점수에 따른 정렬
    result = sortedByScore(friendMap)

    return result
}

private fun friendsScore(
    friends: List<List<String>>,
    friendSet: MutableSet<String>,
    user: String
): MutableMap<String, Int> {
    val friendMap = mutableMapOf<String, Int>()
    for (friend in friends) {
        val direction = when {
            friendSet.contains(friend[0]) && user != friend[1] -> friend[1]
            friendSet.contains(friend[1]) && user != friend[0] -> friend[0]
            else -> continue
        }
        friendMap[direction] = friendMap.getOrDefault(direction, 0) + 10
    }
    return friendMap
}

private fun sortedByScore(
    friendMap: MutableMap<String, Int>
) = friendMap.toList()
    .sortedByDescending { it.second }
    .map { it.first }
    .take(5)


private fun visitorScore(
    visitors: List<String>,
    friendSet: MutableSet<String>,
    friendMap: MutableMap<String, Int>
) {
    for (visitor in visitors) {
        if (visitor in friendSet) continue
        friendMap[visitor] = friendMap.getOrDefault(visitor, 0) + 1
    }
}

private fun searchFriends(
    friends: List<List<String>>,
    user: String,
    friendSet: MutableSet<String>
) {
    friends.forEach { friend ->
        if (friend[1] == user || friend[0] == user) {
            friendSet += friend[0]
        }
    }
}

fun main() {
    println(
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
    )
}