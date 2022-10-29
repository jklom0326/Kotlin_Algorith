package 온보딩

fun solution7(
    user: String, friends: List<List<String>>, visitors: List<String>
): List<String> {

}

fun isValidUserName(nickName: String): Boolean = "[a-z]{1,30}".toRegex().matches(nickName)
