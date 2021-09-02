// impor agar input bisa berbagai tipe data
import java.util.Scanner

// fungsi operator
fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b:Double): Double {
    return a - b
}

fun kali(a: Double, b:Double): Double {
    return a * b
}

fun bagi(a: Double, b:Double): Double {
    return a / b
}

// fungsi operasi yang akan memanggil fungsi operator
fun operasi(pilihanMenu:Int, a: Double, b:Double) {
    var hasil:Double

    // percabangan sesuai dengan menu
    if(pilihanMenu == 1) {
        hasil = tambah(a, b)
        println("$a + $b = $hasil")
    } else if(pilihanMenu == 2) {
        hasil = kurang(a, b)
        println("$a - $b = $hasil")
    } else if(pilihanMenu == 3) {
        hasil = kali(a, b)
        println("$a * $b = $hasil")
    } else if(pilihanMenu == 4) {
        hasil = bagi(a, b)
        println("$a : $b = $hasil")
    }

    // atau bisa juga menggunakan "when"
    /*
    hasil = when(pilihanMenu) {
        1 -> tambah(a,b)
        2 -> kurang(a,b)
        3 -> kali(a, b)
        4 -> bagi(a, b)
        else -> 0.0
    }
    println("Hasil = $hasil")
    */
}

fun main(args: Array<String>) {
    // menampilkan menu yang ada pada program
    println("Menu:\n" +
            "1. Pertambahan\n" +
            "2. Pengurangan\n" +
            "3. Perkalian\n" +
            "4. Pembagian")
    println("=========================")

    // membuat scanner
    val input = Scanner(System.`in`)

    // input angka dan menu
    print("Masukkan angka pertama: ")
    var a:Double = input.nextDouble()
    print("Masukkan angka kedua: ")
    var b:Double = input.nextDouble()
    println("=========================")
    print("Masukkan pilihan menu: ")
    var pilihanMenu:Int = input.nextInt()

    // cek pilihan apakah ada di menu
    if(pilihanMenu > 0 && pilihanMenu <= 4) {
        operasi(pilihanMenu, a, b)
    } else {
        println("Menu hanya 1-4!")
    }
}