import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    if (number < 0) {
        println("negative")
    } else if (number > 0) {
        println("positive")
    } else {
        println("zero")
    }
}