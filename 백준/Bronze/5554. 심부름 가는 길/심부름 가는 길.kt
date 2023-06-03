fun main() {
    val homeToScool = readln().toInt()
    val schoolToPC = readln().toInt()
    val pcToEdu = readln().toInt()
    val eduToHome = readln().toInt()

    println((homeToScool + schoolToPC + pcToEdu + eduToHome) / 60)
    println((homeToScool + schoolToPC + pcToEdu + eduToHome) % 60)
}