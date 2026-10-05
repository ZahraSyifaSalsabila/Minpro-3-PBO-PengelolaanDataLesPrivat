# Sistem Pengelolaan Data Les Privat

## Deskripsi Singkat Program

Sistem Pengelolaan Data Les Privat adalah aplikasi berbasis Java console (CLI) yang dirancang untuk mengelola tiga entitas data utama: **Siswa**, **Tutor**, dan **Jadwal Les**. Sistem ini mengimplementasikan prinsip Pemrograman Berorientasi Objek (PBO) secara menyeluruh, mencakup **Encapsulation**, **Inheritance**, **Polymorphism**, **Abstraction**, serta arsitektur **MVC (Model-View-Controller)** dan penggunaan **Interface**.

Program menyediakan lima fitur utama (CRUD):
1. **Tambah Data**: Menambahkan data Siswa, Tutor, atau Jadwal dengan validasi unik ID dan pengecekan keberadaan relasi data.
2. **Tampilkan Data**: Menampilkan seluruh data tersimpan menggunakan penerapan *polymorphism*.
3. **Update Data**: Memperbarui informasi data dengan fitur *System Enter* (tekan Enter jika tidak ingin mengubah/mempertahankan data lama).
4. **Hapus Data**: Menghapus data spesifik berdasarkan ID.
5. **Keluar**: Menghentikan eksekusi program.

Aplikasi ini dilengkapi dengan penanganan validasi input yang ketat menggunakan pembacaan buffer `scanner.nextLine().trim()` sehingga terhindar dari *error newline buffer*, kebal terhadap input kosong/Enter, serta mampu memvalidasi tipe data angka maupun rentang menu secara presisi.

## Penjelasan Alur Program

Ketika program dijalankan melalui class MainApp, program akan menyiapkan Scanner untuk menerima input dari pengguna. Setelah itu, program membuat object yang digunakan untuk mengelola data les privat dan menampilkan menu utama.

Menu utama terdiri dari:

1. Tambah Data
2. Tampilkan Data
3. Update Data
4. Hapus Data
5. Keluar

Menu utama dijalankan menggunakan perulangan while sehingga menu akan terus muncul dan dapat digunakan berkali-kali selama program masih berjalan. Pilihan yang dimasukkan pengguna kemudian diproses menggunakan switch-case.

Setiap pilihan pada menu utama akan diteruskan melalui LesPrivatController. LesPrivatController kemudian menjalankan method yang sesuai pada LayananLesPrivat. Dengan begitu, MainApp tidak langsung melakukan proses tambah, tampil, update, atau hapus data, tetapi meneruskan proses tersebut ke bagian yang memang digunakan untuk mengelola data.

Jika pengguna memilih menu nomor 1, program menjalankan proses Tambah Data. Jika memilih nomor 2, program menjalankan proses Tampilkan Data. Nomor 3 digunakan untuk Update Data, nomor 4 untuk Hapus Data, sedangkan nomor 5 digunakan untuk keluar dari program.

### 1. Tambah Data

Menu Tambah Data digunakan untuk memasukkan data baru ke dalam sistem. Setelah memilih menu ini, pengguna akan diberikan tiga pilihan data yang dapat ditambahkan, yaitu Siswa, Tutor, dan Jadwal.

### a. Data Siswa

Jika pengguna memilih Data Siswa, program akan meminta beberapa informasi, yaitu ID Siswa, Nama, Jenjang, dan Mata Pelajaran.

ID Siswa harus berupa angka. Sebelum data ditambahkan, program akan memeriksa apakah ID tersebut sudah digunakan oleh siswa lain. Jika ID sudah digunakan, program akan menampilkan pesan bahwa ID sudah digunakan dan meminta pengguna memasukkan ID lain.

Setelah ID berhasil dimasukkan, pengguna dapat mengisi nama siswa, jenjang pendidikan, dan mata pelajaran. Data teks tersebut juga diperiksa agar tidak boleh kosong.

Setelah seluruh informasi berhasil dimasukkan, program membuat data siswa baru dan memasukkannya ke dalam daftar siswa menggunakan ArrayList. Data yang sudah ditambahkan kemudian dapat dilihat melalui menu Tampilkan Data.

Data siswa yang disimpan terdiri dari ID, nama, jenjang, dan mata pelajaran sehingga program dapat mengetahui identitas siswa dan informasi mengenai jenjang dan mata pelajaran yang diikuti.

### b. Data Tutor

Jika pengguna memilih Data Tutor, program akan meminta ID Tutor, Nama, Keahlian, dan No. Telepon.

ID Tutor harus berupa angka dan program akan melakukan pengecekan terlebih dahulu untuk memastikan ID tersebut belum digunakan oleh tutor lain. Jika ID sudah ada, pengguna harus memasukkan ID lain.

Setelah itu, pengguna memasukkan nama tutor, keahlian yang dimiliki, dan nomor telepon. Data tersebut tidak boleh dikosongkan.

Jika semua data sudah berhasil dimasukkan, program membuat object Tutor baru dan menyimpannya ke dalam ArrayList daftarTutor.

Data tersebut dapat digunakan ketika pengguna menampilkan data tutor, melakukan perubahan informasi tutor, atau menghapus data tutor.

### c. Data Jadwal

Jika pengguna memilih Data Jadwal, program akan meminta ID Jadwal, ID Siswa, ID Tutor, Hari, dan Jam.

ID Jadwal harus berupa angka dan tidak boleh sama dengan ID jadwal yang sudah tersimpan. Setelah ID jadwal berhasil dimasukkan, pengguna memasukkan ID siswa dan ID tutor yang berkaitan dengan jadwal tersebut.

Selanjutnya pengguna memasukkan hari dan jam pelaksanaan les. Setelah semua informasi selesai dimasukkan, program membuat object Jadwal baru dan menyimpannya ke dalam ArrayList daftarJadwal.

ID siswa dan ID tutor yang terdapat pada jadwal digunakan untuk mengetahui siswa dan tutor yang berkaitan dengan jadwal tersebut. Ketika jadwal ditampilkan, program mencari nama siswa berdasarkan ID siswa dan nama tutor berdasarkan ID tutor sehingga hasil yang ditampilkan bukan hanya berupa ID.

### 2. Tampilkan Data

Menu Tampilkan Data digunakan untuk melihat data yang sudah tersimpan dalam program. Pengguna dapat memilih data yang ingin ditampilkan, yaitu Data Siswa, Data Tutor, atau Data Jadwal.

a. Jika pengguna memilih Data Siswa, program melakukan perulangan pada daftarSiswa dan menampilkan setiap data siswa yang tersimpan. Informasi yang ditampilkan yaitu ID, nama, jenjang, dan mata pelajaran.

b. Jika pengguna memilih Data Tutor, program melakukan perulangan pada daftarTutor dan menampilkan informasi setiap tutor. Informasi yang ditampilkan yaitu ID, nama, keahlian, dan nomor telepon.

c. Jika pengguna memilih Data Jadwal, program melakukan perulangan pada daftarJadwal. Untuk setiap jadwal, program mengambil ID siswa dan ID tutor yang tersimpan pada jadwal tersebut. ID tersebut kemudian digunakan untuk mencari nama siswa dan nama tutor dari daftar masing-masing.

d. Setelah nama siswa dan tutor ditemukan, informasi jadwal ditampilkan berupa ID jadwal, nama siswa, nama tutor, hari, dan jam. Dengan cara tersebut, pengguna tidak perlu mengingat ID siswa dan ID tutor untuk mengetahui siapa yang mengikuti dan mengajar pada suatu jadwal.

Pada saat pertama kali program dijalankan, menu Tampilkan Data juga sudah dapat digunakan karena program sudah memiliki data awal berupa satu siswa, satu tutor, dan satu jadwal.

### 3. Update Data

Menu Update Data digunakan untuk mengubah informasi dari data yang sudah tersimpan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin diubah, yaitu Siswa, Tutor, atau Jadwal. Setelah memilih jenis data, pengguna memasukkan ID dari data yang ingin diubah.

b. Program kemudian melakukan pencarian pada ArrayList untuk menemukan data dengan ID yang sesuai.

c. Jika data siswa ditemukan, pengguna dapat mengubah nama, jenjang, dan mata pelajaran. ID siswa tetap digunakan sebagai identitas untuk mencari data tersebut.

d. Jika data tutor ditemukan, pengguna dapat mengubah nama, keahlian, dan nomor telepon.

e. Jika data jadwal ditemukan, pengguna dapat mengubah ID siswa, ID tutor, hari, dan jam.

Pada proses perubahan tersebut, program menggunakan setter yang tersedia pada masing-masing class. Jadi, informasi yang baru dimasukkan pengguna akan diberikan melalui method yang digunakan untuk mengubah data. Jika ID yang dimasukkan tidak ditemukan, program tidak melakukan perubahan dan menampilkan pesan bahwa data tidak ditemukan.

### 4. Hapus Data

Menu Hapus Data digunakan untuk menghapus data yang sudah tidak diperlukan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin dihapus, yaitu Siswa, Tutor, atau Jadwal. Setelah itu, pengguna memasukkan ID dari data yang ingin dihapus.

b. Program akan mencari ID tersebut pada ArrayList yang sesuai. Jika ID ditemukan, data tersebut akan dihapus dari daftar. Misalnya, jika pengguna memilih data siswa dan memasukkan ID siswa tertentu, program akan mencari siswa dengan ID tersebut pada daftarSiswa. Jika ditemukan, data siswa tersebut akan dihapus. Hal yang sama dilakukan untuk data tutor dan jadwal. Program akan mencari ID yang sesuai pada daftar masing-masing sebelum melakukan penghapusan.

c. Jika data berhasil ditemukan dan dihapus, program menampilkan pesan bahwa data berhasil dihapus. Jika ID yang dimasukkan tidak sesuai dengan data yang tersedia, tidak ada data yang dihapus.

### 5. Keluar

Menu Keluar digunakan untuk menghentikan program.

a. Ketika pengguna memilih menu nomor 5, nilai boolean berjalan pada MainApp diubah menjadi false. Kondisi tersebut membuat perulangan while berhenti sehingga menu utama tidak lagi ditampilkan.

b. Setelah perulangan berhenti, Scanner ditutup dan program selesai dijalankan.

Dengan menggunakan perulangan tersebut, pengguna dapat melakukan beberapa proses secara berurutan, misalnya menambahkan data kemudian langsung menampilkan data, melakukan update, menghapus data, dan kembali ke menu utama tanpa harus menjalankan program dari awal.

## Validasi Input

Program memiliki validasi input untuk membantu memastikan data yang dimasukkan sesuai dengan kebutuhan program.

a. Untuk input berupa angka, seperti pilihan menu dan ID, program menggunakan method inputAngka(). Method tersebut akan memeriksa apakah input yang diberikan merupakan angka. Jika pengguna memasukkan huruf atau input selain angka, program tidak langsung melanjutkan proses, tetapi meminta pengguna memasukkan angka kembali.

b. Untuk input berupa teks, program menggunakan method inputTeks(). Method ini digunakan untuk memeriksa apakah input yang diberikan kosong atau hanya berisi spasi. Jika input kosong, pengguna akan diminta memasukkan data kembali sampai memberikan teks yang sesuai.

c. Program juga melakukan validasi terhadap ID siswa, tutor, dan jadwal. Setiap ID diperiksa sebelum data baru ditambahkan. Pengecekan tersebut dilakukan menggunakan method isIdSiswaAda(), isIdTutorAda(), dan isIdJadwalAda(). Jika ID yang dimasukkan sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah digunakan dan pengguna harus memasukkan ID lain. Dengan begitu, data yang ditambahkan tidak menggunakan ID yang sama dengan data sebelumnya.

d. Validasi juga digunakan pada proses input menu. Jika pengguna memasukkan pilihan selain pilihan yang tersedia, program akan menampilkan pesan bahwa pilihan tidak valid sehingga pengguna dapat memilih kembali menu yang sesuai. Validasi tersebut digunakan pada proses tambah data, update data, dan bagian lain yang membutuhkan input dari pengguna. Dengan adanya validasi, kesalahan input dapat dikurangi dan program dapat tetap berjalan ketika pengguna memasukkan data yang tidak sesuai.

## Penerapan Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menjadi private. Dengan menggunakan private, atribut tidak dapat diakses dan diubah secara langsung dari luar class. Pada class Pengguna, atribut id dan nama dibuat private. Kedua atribut tersebut memiliki getter untuk mengambil nilainya dan setter untuk mengubah nilainya.

a. Getter digunakan ketika program membutuhkan informasi yang tersimpan. Contohnya, ketika LayananLesPrivat ingin mencari siswa berdasarkan ID, program menggunakan getId(). Ketika program ingin mengambil nama siswa untuk ditampilkan pada jadwal, program menggunakan getNama().

b. Setter digunakan ketika terdapat perubahan data. Contohnya, ketika pengguna melakukan Update Data Siswa, program menggunakan setNama(), setJenjang(), dan setMataPelajaran() untuk memasukkan informasi baru.

### Encapsulation pada class
a. Encapsulation juga diterapkan pada class Siswa. Atribut jenjang dan mataPelajaran dibuat private dan masing-masing memiliki getter dan setter. Dengan demikian, program dapat mengambil data menggunakan getJenjang() dan getMataPelajaran(), serta mengubahnya menggunakan setJenjang() dan setMataPelajaran().

b. Pada class Tutor, atribut keahlian dan noTelepon juga dibuat private. Program menyediakan getKeahlian(), setKeahlian(), getNoTelepon(), dan setNoTelepon() untuk mengambil dan mengubah data tersebut.

c. Pada class Jadwal, atribut idJadwal, idSiswa, idTutor, hari, dan jam dibuat private. Masing-masing atribut memiliki getter dan setter yang digunakan ketika data dibutuhkan atau diperbarui.

d. Penerapan encapsulation juga dapat dilihat pada proses Update Data. Program tidak mengubah atribut secara langsung, tetapi menggunakan setter seperti setNama(), setJenjang(), setMataPelajaran(), setKeahlian(), setNoTelepon(), setIdSiswa(), setIdTutor(), setHari(), dan setJam().

Dengan cara tersebut, data yang dimiliki oleh setiap object dikelola melalui method yang sudah disediakan pada class masing-masing. Hal ini juga membuat proses pengambilan dan perubahan data menjadi lebih teratur.

## Penerapan Inheritance

Inheritance diterapkan dengan menggunakan class Pengguna sebagai superclass. Class Pengguna digunakan untuk menyimpan data yang sama-sama dimiliki oleh siswa dan tutor, yaitu ID dan nama.

a. Class Siswa dan Tutor menjadi subclass dari Pengguna. Pada class Siswa digunakan hubungan: "public class Siswa extends Pengguna". Sedangkan pada class Tutor digunakan: "public class Tutor extends Pengguna". Dengan menggunakan extends, Siswa dan Tutor dapat menggunakan data dan method yang berasal dari Pengguna.

b. Siswa memiliki data tambahan berupa jenjang dan mataPelajaran. Tutor memiliki data tambahan berupa keahlian dan noTelepon. Jadi, data yang umum untuk keduanya diletakkan pada Pengguna, sedangkan data yang berbeda diletakkan pada masing-masing class. Pada constructor Siswa dan Tutor juga digunakan super(id, nama). Bagian tersebut digunakan untuk mengirim nilai ID dan nama ke constructor Pengguna ketika object Siswa atau Tutor dibuat. Contohnya, ketika program membuat data siswa baru, program tidak perlu membuat ulang bagian ID dan nama sebagai atribut baru di dalam Siswa. Siswa cukup menggunakan atribut yang sudah dimiliki dari Pengguna, kemudian menambahkan data khusus siswa berupa jenjang dan mata pelajaran. Hal yang sama berlaku pada Tutor. Tutor menggunakan ID dan nama dari Pengguna, kemudian memiliki tambahan berupa keahlian dan nomor telepon.

c. Penerapan inheritance membuat data yang sama tidak perlu dibuat berulang pada class Siswa dan Tutor. Data yang bersifat umum ditempatkan pada Pengguna, sedangkan data yang bersifat khusus ditempatkan pada masing-masing subclass. Dengan susunan tersebut, hubungan antara Pengguna, Siswa, dan Tutor dapat terlihat dengan jelas dan struktur class dalam program menjadi lebih teratur.

## Penerapan Nilai Tambah
### 1. MVC
Program menerapkan pemisahan package untuk mengatur bagian-bagian program berdasarkan fungsinya.

a. Package main 

Package main berisi class MainApp yang menjadi titik awal ketika program dijalankan. MainApp bertugas membuat Scanner, membuat object yang diperlukan, menampilkan menu utama, menerima pilihan pengguna, dan menjalankan menu sampai pengguna memilih Keluar. Ketika pengguna memilih salah satu menu, pilihan tersebut diteruskan ke LesPrivatController untuk menjalankan proses yang sesuai.

b. Package Controller 

Package Controller berisi class LesPrivatController dan LayananLesPrivat. LesPrivatController digunakan sebagai penghubung antara MainApp dengan LayananLesPrivat, sedangkan LayananLesPrivat berisi proses utama pengelolaan data seperti menambah, menampilkan, mengubah, dan menghapus data, serta melakukan pencarian nama siswa dan tutor dan validasi input.

c. Package model 

Package model berisi class Pengguna, Siswa, Tutor, dan Jadwal yang digunakan untuk membentuk data dalam program. Pengguna digunakan sebagai dasar data yang dimiliki oleh Siswa dan Tutor, Siswa digunakan untuk menyimpan data siswa, Tutor untuk menyimpan data tutor, dan Jadwal untuk menyimpan data jadwal les. Pembagian package tersebut membuat bagian untuk menjalankan program, mengelola proses, dan membentuk data menjadi lebih teratur.

### 2. Polymorphism

Polymorphism diterapkan melalui method tampilkanInfo() yang terdapat pada class Pengguna, kemudian dibuat kembali pada class Siswa dan Tutor dengan isi yang berbeda.

a. Pada class Pengguna terdapat method tampilkanInfo() yang digunakan untuk menampilkan informasi dasar berupa ID dan nama.

b. Pada class Siswa, method tampilkanInfo() di-override sehingga informasi yang ditampilkan menyesuaikan data siswa. Method tersebut menampilkan ID, nama, jenjang, dan mata pelajaran.

c. Pada class Tutor, method tampilkanInfo() juga di-override sehingga informasi yang ditampilkan menyesuaikan data tutor. Method tersebut menampilkan ID, nama, keahlian, dan nomor telepon.

d. Jadi, nama method yang digunakan tetap sama, yaitu tampilkanInfo(), tetapi isi yang dijalankan dapat berbeda sesuai dengan class yang menggunakannya. Pada program, penerapan tersebut digunakan ketika data siswa dan tutor ditampilkan. Ketika data siswa ditampilkan, informasi yang keluar disesuaikan dengan atribut siswa. Ketika data tutor ditampilkan, informasi yang keluar disesuaikan dengan atribut tutor.

e. Penggunaan overriding tersebut membuat proses penampilan informasi dapat disesuaikan dengan jenis data masing-masing tanpa harus menggunakan nama method yang berbeda untuk setiap jenis data.

## Struktur Program

Struktur program dibagi menjadi beberapa package dan class sesuai dengan fungsinya.

1. MainApp digunakan sebagai titik awal program dan menampilkan menu utama.

2. LesPrivatController digunakan sebagai penghubung antara MainApp dengan proses pada LayananLesPrivat.

3. LayananLesPrivat digunakan untuk mengelola proses CRUD dan menyimpan data pada ArrayList.

4. Pengguna digunakan sebagai superclass untuk Siswa dan Tutor.

5. Siswa, Tutor, dan Jadwal digunakan sebagai class yang membentuk data utama dalam sistem.
