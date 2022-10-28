package 온보딩

fun solution6(forms: List<List<String>>): List<String> {
    var result = listOf<String>()
    // 이메일 검사, 닉네임도 같이 검사해야할듯
    println(forms.filter { it -> isValidEmail(it[0]) && isValidNickName(it[1])})
    // 닉네임 중복 체크
    checkNickName(forms)
    // 이메일 정렬
    return listOf()
}

fun isValidEmail(email: String): Boolean = "[A-Za-z]*(@email.com)$".toRegex().matches(email)
fun isValidNickName(nickName: String): Boolean = "[가-힣]{1,19}".toRegex().matches(nickName)

fun checkNickName(forms: List<List<String>>):List<String> {
    for (i in forms){
        var window = i[1].split("").windowed(2).map { it.joinToString("") }.filter { it.length == 2 }
        for (j in forms){
            window.forEach {
               println("$it : ${j.contains(it)}")
            }
        }
        println(window)
    }
    println(forms.map { it.toString() })

    return listOf()
}


fun main() {
    solution6(
        listOf(
            listOf("jm@email.com", "제이엠슨닐"),
            listOf("jason@email.com", "제이슨"),
            listOf("woniee@email.com", "워니"),
            listOf("mj@email.com", "엠제이"),
            listOf("nowm@email.com", "이제엠"),
            listOf("nowm@email.ccom", "이제엠")
        )
    )
}