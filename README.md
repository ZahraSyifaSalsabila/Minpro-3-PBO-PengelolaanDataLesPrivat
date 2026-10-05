# Sistem Pengelolaan Data Les Privat

## Deskripsi Singkat Program

Sistem Pengelolaan Data Les Privat merupakan aplikasi berbasis Java (Console/CLI) yang dirancang untuk mengelola tiga entitas data utama secara terstruktur, yaitu data siswa (ID, nama, jenjang, mata pelajaran), data tutor (ID, nama, keahlian, nomor telepon), serta data jadwal les (ID jadwal, ID siswa, ID tutor, hari, dan jam). Seluruh data tersebut disimpan secara dinamis menggunakan ArrayList selama program berjalan.

Program ini menyediakan lima menu utama yaitu Tambah Data, Tampilkan Data, Update Data, Hapus Data, dan Keluar. Selain itu, sistem dilengkapi dengan mekanisme validasi input untuk memastikan data angka dan teks terisi dengan benar, mencegah input kosong (termasuk pencegahan enter langsung), serta menghindari duplikasi ID agar data tetap konsisten dan aman.

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

**Contoh penambahan data siswa:**

<img width="486" height="164" alt="image" src="https://github.com/user-attachments/assets/20ba3a5c-c471-4b03-95ee-b6dd31da0970" />

### b. Data Tutor

Jika pengguna memilih Data Tutor, program akan meminta ID Tutor, Nama, Keahlian, dan No. Telepon.

ID Tutor harus berupa angka dan program akan melakukan pengecekan terlebih dahulu untuk memastikan ID tersebut belum digunakan oleh tutor lain. Jika ID sudah ada, pengguna harus memasukkan ID lain.

Setelah itu, pengguna memasukkan nama tutor, keahlian yang dimiliki, dan nomor telepon. Data tersebut tidak boleh dikosongkan.

Jika semua data sudah berhasil dimasukkan, program membuat object Tutor baru dan menyimpannya ke dalam ArrayList daftarTutor.

Data tersebut dapat digunakan ketika pengguna menampilkan data tutor, melakukan perubahan informasi tutor, atau menghapus data tutor.

**Contoh penambahan data tutor:**

<img width="588" height="170" alt="image" src="https://github.com/user-attachments/assets/614fe04b-013a-45ea-8b06-8d68576beba2" />

### c. Data Jadwal

Jika pengguna memilih Data Jadwal, program akan meminta ID Jadwal, ID Siswa, ID Tutor, Hari, dan Jam.

ID Jadwal harus berupa angka dan tidak boleh sama dengan ID jadwal yang sudah tersimpan. Setelah ID jadwal berhasil dimasukkan, pengguna memasukkan ID siswa dan ID tutor yang berkaitan dengan jadwal tersebut.

Selanjutnya pengguna memasukkan hari dan jam pelaksanaan les. Setelah semua informasi selesai dimasukkan, program membuat object Jadwal baru dan menyimpannya ke dalam ArrayList daftarJadwal.

ID siswa dan ID tutor yang terdapat pada jadwal digunakan untuk mengetahui siswa dan tutor yang berkaitan dengan jadwal tersebut. Ketika jadwal ditampilkan, program mencari nama siswa berdasarkan ID siswa dan nama tutor berdasarkan ID tutor sehingga hasil yang ditampilkan bukan hanya berupa ID.

**Contoh penambahan data jadwal:**

<img width="620" height="175" alt="image" src="https://github.com/user-attachments/assets/e2229cda-3872-4119-bed7-71d264291caf" />

### 2. Tampilkan Data

Menu Tampilkan Data digunakan untuk melihat data yang sudah tersimpan dalam program. Pengguna dapat memilih data yang ingin ditampilkan, yaitu Data Siswa, Data Tutor, atau Data Jadwal.

a. Jika pengguna memilih Data Siswa, program melakukan perulangan pada daftarSiswa dan menampilkan setiap data siswa yang tersimpan. Informasi yang ditampilkan yaitu ID, nama, jenjang, dan mata pelajaran.

**Contoh tampilkan data siswa:**

<img width="494" height="231" alt="image" src="https://github.com/user-attachments/assets/4f91e15b-d188-473b-82ea-7c717b1d8ec3" />

b. Jika pengguna memilih Data Tutor, program melakukan perulangan pada daftarTutor dan menampilkan informasi setiap tutor. Informasi yang ditampilkan yaitu ID, nama, keahlian, dan nomor telepon.

**Contoh tampilkan data tutor:**

<img width="701" height="233" alt="image" src="https://github.com/user-attachments/assets/528413fb-2273-4f6f-9266-8bf317cc1499" />

c. Jika pengguna memilih Data Jadwal, program melakukan perulangan pada daftarJadwal. Untuk setiap jadwal, program mengambil ID siswa dan ID tutor yang tersimpan pada jadwal tersebut. ID tersebut kemudian digunakan untuk mencari nama siswa dan nama tutor dari daftar masing-masing.

**Contoh tampilkan data jadwal:**

<img width="674" height="250" alt="image" src="https://github.com/user-attachments/assets/5f8faea4-6e55-4eb5-ab88-d82f20ba3457" />

d. Setelah nama siswa dan tutor ditemukan, informasi jadwal ditampilkan berupa ID jadwal, nama siswa, nama tutor, hari, dan jam. Dengan cara tersebut, pengguna tidak perlu mengingat ID siswa dan ID tutor untuk mengetahui siapa yang mengikuti dan mengajar pada suatu jadwal.

Pada saat pertama kali program dijalankan, menu Tampilkan Data juga sudah dapat digunakan karena program sudah memiliki data awal berupa satu siswa, satu tutor, dan satu jadwal.

### 3. Update Data

Menu Update Data digunakan untuk mengubah informasi dari data yang sudah tersimpan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin diubah, yaitu Siswa, Tutor, atau Jadwal. Setelah memilih jenis data, pengguna memasukkan ID dari data yang ingin diubah.

b. Program kemudian melakukan pencarian pada ArrayList untuk menemukan data dengan ID yang sesuai.

c. Jika data siswa ditemukan, pengguna dapat mengubah nama, jenjang, dan mata pelajaran. ID siswa tetap digunakan sebagai identitas untuk mencari data tersebut.

**Contoh update data siswa:**

<img width="586" height="169" alt="image" src="https://github.com/user-attachments/assets/003be8b4-9b9c-4f5e-8c0b-c2ebd1b73a2c" />

Pengguna memasukkan ID siswa 1 dan memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan nama lama "Zahra", sementara data jenjang dan mata pelajaran berhasil diperbarui menjadi SMK dan Perkantoran

**Maka data setelah diupdate yaitu:**

<img width="640" height="227" alt="image" src="https://github.com/user-attachments/assets/8a7fb80c-25fe-49ac-b17d-e8d8fe42e753" />

d. Jika data tutor ditemukan, pengguna dapat mengubah nama, keahlian, dan nomor telepon.

**Contoh update data tutor:**

<img width="593" height="169" alt="image" src="https://github.com/user-attachments/assets/c4714530-e5e6-430b-8966-37024c01ade1" />

Pengguna memasukkan ID tutor 2, lalu memperbarui nama menjadi "Imsa" dan nomor telepon baru, dan memanfaatkan fitur System Enter pada bagian keahlian (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan data keahlian lama yaitu Jaringan

**Maka data setelah diupdate yaitu:**

<img width="468" height="231" alt="image" src="https://github.com/user-attachments/assets/93433cab-2760-4255-b195-e41493244c04" />

e. Jika data jadwal ditemukan, pengguna dapat mengubah ID siswa, ID tutor, hari, dan jam.

**Contoh update data jadwal:**

<img width="383" height="183" alt="image" src="https://github.com/user-attachments/assets/ae410cd7-9926-4808-ad5b-62ed11c2e7c9" />

Pengguna memasukkan ID jadwal 2, lalu memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan ID siswa dan ID tutor lama, sementara informasi hari dan jam berhasil diperbarui menjadi "Jumat" dan "16.00"

**Maka data setelah diupdate yaitu:**

<img width="541" height="250" alt="image" src="https://github.com/user-attachments/assets/0fcd0b7e-c217-4acf-9fa5-1aaccfd93812" />

Pada proses perubahan tersebut, program menggunakan setter yang tersedia pada masing-masing class. Jadi, informasi yang baru dimasukkan pengguna akan diberikan melalui method yang digunakan untuk mengubah data. Jika ID yang dimasukkan tidak ditemukan, program tidak melakukan perubahan dan menampilkan pesan bahwa data tidak ditemukan.

### 4. Hapus Data

Menu Hapus Data digunakan untuk menghapus data yang sudah tidak diperlukan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin dihapus, yaitu Siswa, Tutor, atau Jadwal. Setelah itu, pengguna memasukkan ID dari data yang ingin dihapus.

**Contoh hapus data siswa:**

<img width="611" height="109" alt="image" src="https://github.com/user-attachments/assets/58c64f3b-a341-4a00-b2c3-ebff5cdd8c1f" />
<img width="677" height="328" alt="image" src="https://github.com/user-attachments/assets/63def9f8-fb62-45af-8b6e-dc453e1d15a1" />


**Contoh hapus data tutor:**

<img width="443" height="108" alt="image" src="https://github.com/user-attachments/assets/efaff443-c55d-4d0b-8226-d1bc1425c3ce" />
<img width="587" height="326" alt="image" src="https://github.com/user-attachments/assets/a5c7cb9f-7f0c-4ab2-96c3-35007ba56089" />

**Contoh hapus data jadwal:**

<img width="473" height="125" alt="image" src="https://github.com/user-attachments/assets/7a416d61-cc3f-4084-b968-e4eef00005f9" />
<img width="569" height="332" alt="image" src="https://github.com/user-attachments/assets/7103b5e0-a88b-457d-8e77-d620ea2b0411" />

b. Program akan mencari ID tersebut pada ArrayList yang sesuai. Jika ID ditemukan, data tersebut akan dihapus dari daftar. Misalnya, jika pengguna memilih data siswa dan memasukkan ID siswa tertentu, program akan mencari siswa dengan ID tersebut pada daftarSiswa. Jika ditemukan, data siswa tersebut akan dihapus. Hal yang sama dilakukan untuk data tutor dan jadwal. Program akan mencari ID yang sesuai pada daftar masing-masing sebelum melakukan penghapusan.

c. Jika data berhasil ditemukan dan dihapus, program menampilkan pesan bahwa data berhasil dihapus. Jika ID yang dimasukkan tidak sesuai dengan data yang tersedia, tidak ada data yang dihapus.

### 5. Keluar

Menu Keluar digunakan untuk menghentikan program.

a. Ketika pengguna memilih menu nomor 5, nilai boolean berjalan pada MainApp diubah menjadi false. Kondisi tersebut membuat perulangan while berhenti sehingga menu utama tidak lagi ditampilkan.

**Contoh keluar program:**

<img width="506" height="131" alt="image" src="https://github.com/user-attachments/assets/f929a9bb-f033-4636-909d-7e6e96f09c1d" />


b. Setelah perulangan berhenti, Scanner ditutup dan program selesai dijalankan.

Dengan menggunakan perulangan tersebut, pengguna dapat melakukan beberapa proses secara berurutan, misalnya menambahkan data kemudian langsung menampilkan data, melakukan update, menghapus data, dan kembali ke menu utama tanpa harus menjalankan program dari awal.

## Validasi Input

Program memiliki validasi input untuk membantu memastikan data yang dimasukkan sesuai dengan kebutuhan program.

a. Untuk input berupa angka, seperti pilihan menu dan ID, program menggunakan method inputAngka(). Method tersebut akan memeriksa apakah input yang diberikan merupakan angka. Jika pengguna memasukkan huruf atau input selain angka, program tidak langsung melanjutkan proses, tetapi meminta pengguna memasukkan angka kembali.

**Contoh validasi input berupa angka:**

<img width="293" height="81" alt="image" src="https://github.com/user-attachments/assets/77d74eea-0623-436c-b050-bce564cb02a7" />


b. Untuk input berupa teks, program menggunakan method inputTeks(). Method ini digunakan untuk memeriksa apakah input yang diberikan kosong atau hanya berisi spasi. Jika input kosong, pengguna akan diminta memasukkan data kembali sampai memberikan teks yang sesuai.

**Contoh validasi input berupa teks:**

<img width="275" height="88" alt="image" src="https://github.com/user-attachments/assets/562732d5-f786-4af2-aa2b-3d591b3aadec" />


c. Program juga melakukan validasi terhadap ID siswa, tutor, dan jadwal. Setiap ID diperiksa sebelum data baru ditambahkan. Pengecekan tersebut dilakukan menggunakan method isIdSiswaAda(), isIdTutorAda(), dan isIdJadwalAda(). Jika ID yang dimasukkan sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah digunakan dan pengguna harus memasukkan ID lain. Dengan begitu, data yang ditambahkan tidak menggunakan ID yang sama dengan data sebelumnya.

**Contoh validasi terhadap ID yang sudah ada:**

<img width="234" height="75" alt="image" src="https://github.com/user-attachments/assets/bbffcdf5-8f4f-4db4-b158-c17dda1a80b0" />

<img width="202" height="77" alt="image" src="https://github.com/user-attachments/assets/76e84af9-b3ef-4d67-bae4-739de8354e28" />

<img width="196" height="80" alt="image" src="https://github.com/user-attachments/assets/812edfa4-775b-4162-9b62-a3019e55d120" />

d. Validasi juga digunakan pada proses input menu. Jika pengguna memasukkan pilihan selain pilihan yang tersedia, program akan menampilkan pesan bahwa pilihan tidak ada sehingga pengguna dapat memilih kembali menu yang sesuai. Validasi tersebut digunakan pada proses tambah data, update data, dan bagian lain yang membutuhkan input dari pengguna. Dengan adanya validasi, kesalahan input dapat dikurangi dan program dapat tetap berjalan ketika pengguna memasukkan data yang tidak sesuai.

**Contoh validasi proses input menu:**

<img width="260" height="77" alt="image" src="https://github.com/user-attachments/assets/9135a19d-1345-4dac-8a37-831371b06af9" />


## Penerapan Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menjadi private melalui penggunaan Access Modifier. Dengan menggunakan private, atribut tidak dapat diakses dan diubah secara langsung dari luar class. Pada class Pengguna, atribut id dan nama dibuat private. Kedua atribut tersebut memiliki getter untuk mengambil nilainya dan setter untuk mengubah nilainya.

**Contoh pemberian Access Modifier pada class pengguna:**

<img width="347" height="50" alt="image" src="https://github.com/user-attachments/assets/4364061d-f5d6-47f7-80c0-ac3014e0e0db" />

a. Getter digunakan ketika program membutuhkan informasi yang tersimpan. Contohnya, ketika LayananLesPrivat ingin mencari siswa berdasarkan ID, program menggunakan getId(). Ketika program ingin mengambil nama siswa untuk ditampilkan pada jadwal, program menggunakan getNama().

b. Setter digunakan ketika terdapat perubahan data. Contohnya, ketika pengguna melakukan Update Data Siswa, program menggunakan setNama(), setJenjang(), dan setMataPelajaran() untuk memasukkan informasi baru.

### Encapsulation getter dan setter pada class
a. Encapsulation juga diterapkan pada class Siswa. Atribut jenjang dan mataPelajaran dibuat private dan masing-masing memiliki getter dan setter. Dengan demikian, program dapat mengambil data menggunakan getJenjang() dan getMataPelajaran(), serta mengubahnya menggunakan setJenjang() dan setMataPelajaran().

**Penerapan encapsulation  pada siswa:**

<img width="582" height="370" alt="image" src="https://github.com/user-attachments/assets/6319dd32-bf4d-42f6-93c4-6d813e2c7ed4" />


b. Pada class Tutor, atribut keahlian dan noTelepon juga dibuat private. Program menyediakan getKeahlian(), setKeahlian(), getNoTelepon(), dan setNoTelepon() untuk mengambil dan mengubah data tersebut.

**Penerapan encapsulation pada tutor:**

<img width="604" height="302" alt="image" src="https://github.com/user-attachments/assets/b179c971-68dd-46c0-9646-4883dfe30b62" />

<img width="414" height="151" alt="image" src="https://github.com/user-attachments/assets/b9c748dc-63c7-43ac-934c-890045e02019" />

c. Pada class Jadwal, atribut idJadwal, idSiswa, idTutor, hari, dan jam dibuat private. Masing-masing atribut memiliki getter dan setter yang digunakan ketika data dibutuhkan atau diperbarui.

<img width="608" height="242" alt="image" src="https://github.com/user-attachments/assets/22c00fc2-7ef3-497a-83d4-4d198f38849a" />

d. Penerapan encapsulation juga dapat dilihat pada proses Update Data. Program tidak mengubah atribut secara langsung, tetapi menggunakan setter seperti setNama(), setJenjang(), setMataPelajaran(), setKeahlian(), setNoTelepon(), setIdSiswa(), setIdTutor(), setHari(), dan setJam().

<img width="580" height="239" alt="image" src="https://github.com/user-attachments/assets/d4f051f2-1477-41c6-b805-63a7a47ad2c1" />

<img width="562" height="165" alt="image" src="https://github.com/user-attachments/assets/1e6fdc77-47bf-47ab-82f8-241678e1feb7" />

<img width="548" height="329" alt="image" src="https://github.com/user-attachments/assets/9838faa8-28d1-457c-8c98-beca2691caca" />


Dengan cara tersebut, data yang dimiliki oleh setiap object dikelola melalui method yang sudah disediakan pada class masing-masing. Hal ini juga membuat proses pengambilan dan perubahan data menjadi lebih teratur.

## Penerapan Inheritance

Inheritance diterapkan dengan menggunakan class Pengguna sebagai superclass. Class Pengguna digunakan untuk menyimpan data yang sama-sama dimiliki oleh siswa dan tutor, yaitu ID dan nama.

a. Class Siswa dan Tutor menjadi subclass dari Pengguna. Pada class Siswa digunakan hubungan: "public class Siswa extends Pengguna". Sedangkan pada class Tutor digunakan: "public class Tutor extends Pengguna". Dengan menggunakan extends, Siswa dan Tutor dapat menggunakan data dan method yang berasal dari Pengguna.

**Penerapan Inheritence extends pada masing-masing subclass siswa dan tutor:**

<img width="234" height="17" alt="image" src="https://github.com/user-attachments/assets/3ed3c9c4-5d6d-4912-8f81-4b51a60ad3c0" />

<img width="236" height="19" alt="image" src="https://github.com/user-attachments/assets/2ad7cb2f-075a-4533-9f14-722e320a1854" />

b. Siswa memiliki data tambahan berupa jenjang dan mataPelajaran. Tutor memiliki data tambahan berupa keahlian dan noTelepon. Jadi, data yang umum untuk keduanya diletakkan pada Pengguna, sedangkan data yang berbeda diletakkan pada masing-masing class. Pada constructor Siswa dan Tutor juga digunakan super(id, nama). Bagian tersebut digunakan untuk mengirim nilai ID dan nama ke constructor Pengguna ketika object Siswa atau Tutor dibuat. Contohnya, ketika program membuat data siswa baru, program tidak perlu membuat ulang bagian ID dan nama sebagai atribut baru di dalam Siswa. Siswa cukup menggunakan atribut yang sudah dimiliki dari Pengguna, kemudian menambahkan data khusus siswa berupa jenjang dan mata pelajaran. Hal yang sama berlaku pada Tutor. Tutor menggunakan ID dan nama dari Pengguna, kemudian memiliki tambahan berupa keahlian dan nomor telepon.

**Tambahan atribut pada masing-masing subclass siswa dan tutor:**

<img width="607" height="74" alt="image" src="https://github.com/user-attachments/assets/c03632d3-bdfa-44c3-8a61-1e56b4761ac7" />

<img width="581" height="76" alt="image" src="https://github.com/user-attachments/assets/d955a72f-96b9-49ff-8ac3-096359508eb6" />

c. Penerapan inheritance membuat data yang sama tidak perlu dibuat berulang pada class Siswa dan Tutor. Data yang bersifat umum ditempatkan pada Pengguna, sedangkan data yang bersifat khusus ditempatkan pada masing-masing subclass. Dengan susunan tersebut, hubungan antara Pengguna, Siswa, dan Tutor dapat terlihat dengan jelas dan struktur class dalam program menjadi lebih teratur.

## MVC
Program menerapkan pemisahan package untuk mengatur bagian-bagian program berdasarkan fungsinya.

**a. Package Model**

Package model berisi class Pengguna, Siswa, Tutor, dan Jadwal yang digunakan untuk membentuk data dalam program. Pengguna digunakan sebagai dasar data yang dimiliki oleh Siswa dan Tutor, Siswa digunakan untuk menyimpan data siswa, Tutor untuk menyimpan data tutor, dan Jadwal untuk menyimpan data jadwal les. Pembagian package tersebut membuat bagian untuk menjalankan program, mengelola proses, dan membentuk data menjadi lebih teratur.

**Package Model:**

<img width="251" height="86" alt="image" src="https://github.com/user-attachments/assets/a6ceed23-dff5-4d30-b3b9-9046bdee19da" />


**b. Package Controller**

Package Controller berisi class LesPrivatController dan LayananLesPrivat. LesPrivatController digunakan sebagai penghubung antara MainApp dengan LayananLesPrivat, sedangkan LayananLesPrivat berisi proses utama pengelolaan data seperti menambah, menampilkan, mengubah, dan menghapus data, serta melakukan pencarian nama siswa dan tutor dan validasi input.

**Package Controller:**

<img width="245" height="44" alt="image" src="https://github.com/user-attachments/assets/ee2841e2-59e5-4f37-a91d-be9e4680e772" />


**c. Package View**

Package view berisi LesPrivatView yang bertanggung jawab penuh atas interaksi konsol dan penerimaan input. Alur program berjalan melalui perulangan while di menu utama yang memproses pilihan pengguna lewat switch-case dan meneruskannya ke controller.

**Package View:**

<img width="239" height="32" alt="image" src="https://github.com/user-attachments/assets/9c9803a8-16c9-48c1-a6c8-a78f3f29a2ed" />


**Screenshoot Struktur Folder:**

<img width="274" height="203" alt="image" src="https://github.com/user-attachments/assets/56ca0898-388f-48ae-bdd1-803db5285d7a" />


## Abstraction

Abstraction diterapkan melalui pembuatan abstract class dan abstract method pada hierarki class Pengguna. Class Pengguna dideklarasikan sebagai abstract class Pengguna implements CetakInfo, yang berfungsi sebagai kerangka dasar dan tidak dapat diinstansiasi secara langsung menjadi object baru menggunakan keyword new. Di dalam class Pengguna, terdapat abstract method public abstract String getPeran(); dan public abstract void tampilkanInfo();. Method-method abstrak ini tidak memiliki implementasi di superclass, melainkan wajib di-override dan diimplementasikan secara konkret oleh setiap class turunannya, yaitu Siswa dan Tutor.

**Abstract class pada class pengguna:**

<img width="352" height="50" alt="image" src="https://github.com/user-attachments/assets/dbdc21b9-f512-4782-b7f4-5e550e439399" />

**Abstract method pada class pengguna:**

<img width="318" height="65" alt="image" src="https://github.com/user-attachments/assets/74c3e535-1da2-4067-8e93-02330412e7cc" />

## Polymorphism

Polymorphism pada program ini diterapkan dalam dua bentuk utama, yaitu Overriding dan Overloading. Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract, kemudian dioverride ulang di dalam class Siswa untuk menampilkan informasi ID, nama, jenjang, dan mata pelajaran, serta dioverride di class Tutor untuk menampilkan ID, nama, keahlian, dan nomor telepon sesuai atribut masing-masing subclass. Sementara itu, overloading diterapkan pada class Jadwal melalui dua bentuk method tampilkanInfo() dengan parameter yang berbeda, yakni tampilkanInfo() tanpa parameter dan tampilkanInfo(String namaSiswa, String namaTutor) dengan parameter untuk menerjemahkan ID menjadi nama lengkap. Overloading juga diterapkan pada class LesPrivatView melalui variasi method inputAngkaWajib()

**Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract:**

<img width="302" height="62" alt="image" src="https://github.com/user-attachments/assets/42647365-3c8c-4f55-b74a-7cdb99eb8c26" />

**Overriding pada class siswa:**

<img width="440" height="170" alt="image" src="https://github.com/user-attachments/assets/38fa17bc-bdff-47d5-adb9-84df386d5641" />

**Overriding pada class tutor:**

<img width="409" height="172" alt="image" src="https://github.com/user-attachments/assets/55f3596e-43db-4895-a473-f82688bc3146" />

**Overloading pada class jadwal:**

<img width="488" height="221" alt="image" src="https://github.com/user-attachments/assets/80ff859b-c5a1-42e4-85c1-bed9e3dfc227" />

**Overloading pada class LesPrivatView melalui variasi method inputAngkaWajib():**

<img width="481" height="21" alt="image" src="https://github.com/user-attachments/assets/4f82a3e6-fc1e-41ff-b789-c0d92c621fe3" />


## Penjelasan Penerapan Nilai Tambah (Interface)

Sistem ini menerapkan Interface pada dua bagian utama. Pertama, interface PengelolaData pada package Controller yang mendefinisikan kontrak standar operasi CRUD (tambahData, tampilkanData, updateData, dan hapusData) yang diimplementasikan penuh pada LesPrivatController. Kedua, interface CetakInfo pada package model yang mendeklarasikan kontrak method tampilkanInfo() dan diimplementasikan oleh class Pengguna (serta diturunkan ke Siswa dan Tutor) serta diimplementasikan langsung oleh class Jadwal.

**Interface pada class pengguna:**

<img width="356" height="77" alt="image" src="https://github.com/user-attachments/assets/00be9be4-7122-462b-a5f9-d24b79ecc942" />

**Interface pada class jadwal:**

<img width="305" height="115" alt="image" src="https://github.com/user-attachments/assets/95eb46a9-2f8b-44f0-b8ac-8e93bc944e7b" />

**Interface PengelolaData pada package Controller:**

<img width="297" height="81" alt="image" src="https://github.com/user-attachments/assets/392c45c1-bcc3-4f59-b5af-9d4db5593096" />

## Struktur Program

Struktur program dibagi menjadi beberapa package dan class sesuai dengan fungsinya.

1. MainApp digunakan sebagai titik awal untuk memulai program.

2. LesPrivatController digunakan sebagai penghubung dan pengatur alur logika antara menu, validasi input, serta proses layanan.

3. LayananLesPrivat digunakan untuk mengelola proses CRUD, validasi duplikasi ID, dan penyimpanan data menggunakan ArrayList.

4. Pengguna bertindak sebagai abstract class (implements CetakInfo) yang menjadi superclass bagi Siswa dan Tutor.

5. Siswa, Tutor, dan Jadwal digunakan sebagai class entity pembentuk data utama, di mana Jadwal juga ikut mengimplementasikan interface CetakInfo.
