import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    if (number % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}