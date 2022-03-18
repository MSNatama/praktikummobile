package modul1
import java.util.*

fun main() {
    var waktu : String
    var nama : String
    var umur : Int

    val input = Scanner(System.`in`)
    print("Waktu Sekarang: ")
    waktu= input.nextLine()
    print("Nama Anda: ")
    nama= input.nextLine()
    print("Umur Anda: ")
    umur= input.nextInt()

    val suhu : Int = (35..37).random()
    val sDecimal : Int = (0..9).random()

    if (waktu == "Pagi" || waktu == "pagi"){
        println("Selamat $waktu, $nama.")
        println("Umur anda $umur Tahun.")
        println("Suhu Tubuh anda $suhu.$sDecimal derajat Celcius")
    }
    if (waktu == "Siang" || waktu == "siang"){
        println("Selamat $waktu, $nama.")
        println("Umur anda $umur Tahun.")
        println("Suhu Tubuh anda $suhu.$sDecimal derajat Celcius")
    }
    if (waktu == "Sore" || waktu == "sore"){
        println("Selamat $waktu, $nama.")
        println("Umur anda $umur Tahun.")
        println("Suhu Tubuh anda $suhu.$sDecimal derajat Celcius")
    }
    if (waktu == "Malam" || waktu == "malam"){
        println("Selamat $waktu, $nama.")
        println("Umur anda $umur Tahun.")
        println("Suhu Tubuh anda $suhu.$sDecimal derajat Celcius")
    }
}
