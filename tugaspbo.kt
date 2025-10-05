////latihan 1
// fun main() {
//     val nilai = 85
    
//     val grade = when {
//         nilai >= 90 -> 'A'
//         nilai >= 80 -> 'B'
//         nilai >= 70 -> 'C'
//         nilai >= 60 -> 'D'
//         else -> 'E'
//     }

//     println("Nilai: $nilai")
//     println("Grade: $grade")
// }
//latihan 2
// fun main (){
//     val buku = 12000 
//     val pensil = 8500 
//     val penghapus = 20000 
    //     val daftar_harga = listOf(buku,pensil,penghapus)
//     val total = daftar_harga.sum()
    //     println("Total pembelian barang: $total")
// }
//latihan 3
//     fun main() {
    //     val bilangan = listOf(7, 4, 10, 3, 8, 5, 2, 9, 6)
//     val genap = bilangan.filter { it % 2 == 0 }
 //     println("Bilangan genap urut: $genap")
//latihan 4
// fun main() {        
//         val nama = listOf("Agus", "Bambang", "Dewi", "Christina")
//         val namaTerpanjang = nama.maxByOrNull {it.length}
        
//         println("nama terpuanjang = $namaTerpanjang")
//     }
//latihan 5
// fun main (){
//     val stok = listOf(10, 5, 8, 7)
//     val total = stok.sum()
    
//     println("total stok = $total")
// }
// //Latihan 6
// fun main() {
//     val dataKepuasan = mapOf(
//         "Agus" to listOf(5, 4, 3, 3, 5),
//         "Budi" to listOf(5, 5, 4, 4, 4),
//     )

//     println("Rata-rata dan status kepuasan:\n")

//     var rataTertinggi = 0
//     var siswaTertinggi = ""

//     dataKepuasan.forEach { (nama, skor) ->
//         val rata = skor.average()
//         val status = when {
//             rata >= 4 -> "Sangat Puas"
//             rata >= 3 -> "Puas"
//             else -> "Tidak Puas"
//         }

//         println("$nama, rata-rata: $rata, status: $status".format(rata))

//         if (rata > rataTertinggi) {
//             rataTertinggi = rata
//             siswaTertinggi = nama
//         }
//     }

//     println("Siswa dengan rata-rata tertinggi: $siswaTertinggi ")
// }
// latihan 7
// fun main() {
//     data class Peminjaman(val nama: String, val buku: List<String>, val sudahKembali: Boolean)

//     val data = listOf(
//         Peminjaman("Agus", listOf("Kotlin ", "Algoritma", " Java"), false),
//         Peminjaman("Budi", listOf("Matematika", "Fisika"), true),
//         Peminjaman("Yanto", listOf("Kotlin ", " Python", "Basis Data", "Desain UI"), false),
//         Peminjaman("Edo", listOf("Kimia", "Biologi", "Kotlin "), true),
//         Peminjaman("Kacin", listOf("Java", "Basis Data"), false)
//     )

//     println("Siswa yang belum mengembalikan buku:")
//     data.filter { !it.sudahKembali }.forEach { println(it.nama) }

//     println("\nJudul buku unik yang pernah dipinjam:")
//     data.flatMap { it.buku }.map { it.lowercase().replaceFirstChar { c -> c.uppercase() } }.toSet().forEach { println(it) }

//     println("\nJumlah siswa yang meminjam lebih dari 2 buku:")
//     println(data.count { it.buku.size > 2 })

//     println("\nSiswa yang meminjam buku 'Kotlin Dasar':")
//     data.filter { it.buku.any { judul -> judul.equals("Kotlin Dasar", ignoreCase = true) } }.forEach { println(it.nama) }

//     println("\nTotal seluruh buku yang dipinjam:")
//     println(data.sumOf { it.buku.size })
// }
// latihan 8 
// fun main() {
//     val kehadiran = mapOf(
//         "Andi" to listOf(true, true, true, false, true, true, true, true),
//         "Budi" to listOf(true, false, false, true, false, true, false, true),
//         "Citra" to listOf(true, true, true, true, true, true, true, true),
//         "Dewi" to listOf(false, false, true, false, true, false, true, false),
//         "Eka" to listOf(true, true, true, true, false, true, true, false),
//         "Fajar" to listOf(true, true, false, false, true, false, false, false),
//         "Gina" to listOf(true, true, true, true, true, true, false, true),
//         "Hadi" to listOf(false, false, false, true, false, true, true, true),
//         "Indra" to listOf(true, true, true, false, true, false, true, false),
//         "Joko" to listOf(true, false, true, false, false, false, false, false)
//     )

//     println("Jumlah kehadiran tiap siswa:")
//     val jumlahKehadiran = kehadiran.mapValues { it.value.count { hadir -> hadir } }
//     jumlahKehadiran.forEach { println("${it.key}: ${it.value}") }

//     println("\nSiswa yang hadir kurang dari 6 kali:")
//     jumlahKehadiran.filter { it.value < 6 }.forEach { println(it.key) }

//     val maxHadir = jumlahKehadiran.maxByOrNull { it.value }!!
//     val minHadir = jumlahKehadiran.minByOrNull { it.value }!!
//     println("\nKehadiran tertinggi: ${maxHadir.key} (${maxHadir.value})")
//     println("Kehadiran terendah: ${minHadir.key} (${minHadir.value})")

//     val totalPertemuan = kehadiran.values.first().size
//     val rataPersentase = jumlahKehadiran.values.sum() * 100.0 / (kehadiran.size * totalPertemuan)
//     println("\nPersentase rata-rata kehadiran kelas: ${"%.2f".format(rataPersentase)}%")

//     println("\nStatus kelayakan ikut ujian:")
//     jumlahKehadiran.forEach { (nama, hadir) ->
//         val persentase = hadir * 100.0 / totalPertemuan
//         if (persentase < 75) {
//             println("$nama: Tidak layak ikut ujian")
//         } else {
//             println("$nama: Layak ikut ujian")
//         }
//     }
// }
//latihan 9

// fun main() {
//     data class Pemesanan(
//         val nama: String,
//         val hari: String,
//         val jam: String,
//         val lab: String,
//         val disetujui: Boolean
//     )

//     val data = listOf(
//         Pemesanan("Andi", "Senin", "08.00–10.00", "Lab AI", true),
//         Pemesanan("Budi", "Jumat", "10.00–12.00", "Lab Jaringan", false),
//         Pemesanan("Citra", "Kamis", "08.00–10.00", "Lab AI", true),
//         Pemesanan("Dewi", "Jumat", "13.00–15.00", "Lab Multimedia", true),
//         Pemesanan("Eka", "Rabu", "08.00–10.00", "Lab AI", false),
//         Pemesanan("Andi", "Kamis", "13.00–15.00", "Lab Jaringan", true),
//         Pemesanan("Budi", "Senin", "08.00–10.00", "Lab AI", true)
//     )

//     println("Pemesanan yang belum disetujui:")
//     data.filter { !it.disetujui }.forEach { println(it) }

//     println("\nTotal pemesanan per laboratorium:")
//     data.groupingBy { it.lab }.eachCount().forEach { (lab, total) -> println("$lab: $total") }

//     println("\nSiswa yang memesan ruangan pada hari Jumat:")
//     data.filter { it.hari.equals("Jumat", ignoreCase = true) }.forEach { println(it.nama) }

//     fun cekLabAI(hari: String, jam: String): Boolean {
//         return data.any {
//             it.lab.equals("Lab AI", ignoreCase = true) &&
//             it.hari.equals(hari, ignoreCase = true) &&
//             it.jam.equals(jam, ignoreCase = true)
//         }
//     }

//     println("\nCek Lab AI pada Kamis 08.00–10.00:")
//     println(if (cekLabAI("Kamis", "08.00–10.00")) "Sudah digunakan" else "Tersedia")

//     println("\nSiswa yang memesan lebih dari satu kali:")
//     data.groupingBy { it.nama }.eachCount().filter { it.value > 1 }.forEach { println(it.key) }
// }
//latihan 10
// fun main() {
//     val pilihan = mapOf(
//         "Andi" to listOf("Kotlin", "Java", "Python"),
//         "Budi" to listOf("Python", "C++", "Java"),
//         "Citra" to listOf("Kotlin", "C", "C++"),
//         "Dewi" to listOf("Java", "Kotlin", "C#"),
//         "Eka" to listOf("Python", "Kotlin", "Java"),
//         "Fajar" to listOf("C#", "C", "Python")
//     )

//     println("1. Semua bahasa pemrograman yang pernah dipilih:")
//     pilihan.values.flatten().toSet().forEach { println(it) }

//     println("\n2. Jumlah pemilih setiap bahasa (urutan terbanyak):")
//     val hitungBahasa = pilihan.values.flatten().groupingBy { it }.eachCount()
//     hitungBahasa.entries.sortedByDescending { it.value }.forEach { println("${it.key}: ${it.value}") }

//     println("\n3. Siswa yang memilih 'Kotlin' sebagai pilihan pertama:")
//     pilihan.filter { it.value.first().equals("Kotlin", ignoreCase = true) }
//         .forEach { println(it.key) }

//     println("\n4. Jumlah siswa yang memilih 'Python' di posisi manapun:")
//     val jumlahPython = pilihan.count { it.value.any { bahasa -> bahasa.equals("Python", ignoreCase = true) } }
//     println(jumlahPython)

//     println("\n5. Bahasa yang tidak dipilih sama sekali:")
//     val semuaBahasa = listOf("Kotlin", "Java", "C++", "Python", "C", "C#")
//     val bahasaTidakDipilih = semuaBahasa.filter { it !in hitungBahasa.keys }
//     bahasaTidakDipilih.forEach { println(it) }
// }