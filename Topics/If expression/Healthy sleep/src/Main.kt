import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val atLeast = scanner.nextInt()
    val atMax = scanner.nextInt()
    val actual = scanner.nextInt()

    if (actual < atLeast) {
        println("Deficiency")
    } else if (actual > atMax) {
        println("Excess")
    } else {
        println("Normal")
    }
}