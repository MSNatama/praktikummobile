package modul1
import java.util.*

fun hasil(x: Int): Int {
    val x2 = x * x
    val f = (2 * x2) + (5 * x) - 8
    return f
}

fun main() {
    val input = Scanner(System.`in`)
    print("Nilai x = ")
    var x = input.nextInt()
    println(hasil(x))
}