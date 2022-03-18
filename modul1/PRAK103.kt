package modul1
import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Input bilangan = ")
    var number = input.nextInt()
    var a = 0
    var i = 1
    while (i <= 5) {
        a += number
        if (a % 2 == 0 || a % 3 == 0) {
            print("$a ")
            i++
        }
    }
}