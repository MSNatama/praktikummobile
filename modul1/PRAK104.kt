package modul1

class Olahraga(nama: String, umur: Int, Olahraga: String) {
    var nama: String = nama
    var umur: Int = umur
    var Olahraga: String = Olahraga

    fun Tampil(){
        println("Nama : $nama")
        println("Umur : $umur")
        println("Olahraga Favorit : $Olahraga")
    }
}
fun main() {
    val person1 = Olahraga("Shafa", 20, "Voli")
    person1.Tampil()
}