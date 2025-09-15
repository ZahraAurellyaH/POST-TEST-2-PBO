# POST-TEST-2-PBO

## NAMA: ZAHRA AURELLYA HERDIANSYAH

## NIM:2409116062

<img width="341" height="221" alt="image" src="https://github.com/user-attachments/assets/98d4c589-bc69-4169-94ee-126b09c982d5" />


1. `main`
- Berisi Main.java
- Fungsi: Menjadi titik masuk (entry point) program. Di sini terdapat menu interaktif untuk user (CRUD: Tambah, Lihat, Ubah, Hapus).
2. `model`
- Berisi Peminjaman.java
- Fungsi: Menyimpan struktur data (atribut nama, nim, departemen, namaBarang, jumlah) beserta constructor. Class ini merepresentasikan objek peminjaman.
3. `service`
- Berisi PeminjamanService.java
- Fungsi: Mengelola logika CRUD. Berisi method untuk menambah, melihat, mengubah, dan menghapus data Peminjaman

### PEMINJAMAN.JAVA
<img width="196" height="25" alt="image" src="https://github.com/user-attachments/assets/ff275713-b856-4cd8-a570-a40ca91fda3b" />


Package `model` berisi class yang merepresentasikan struktur data peminjaman. Di dalamnya terdapat properti, constructor, dan metode akses yang digunakan sebagai dasar pengolahan data pada sistem manajemen peminjaman barang.

#
<img width="591" height="92" alt="image" src="https://github.com/user-attachments/assets/b3c3067a-9147-49fa-ba36-24d6de593991" />

Class `Peminjaman` di atas berfungsi untuk merepresentasikan data peminjaman barang. Memiliki 5 properti, 4 diantaranya tipe  data string :nama, nim, departemen, namaBarang; dan yang satunya tipe data integer yaitu jumlah. 
#
<img width="1096" height="196" alt="image" src="https://github.com/user-attachments/assets/1b51816e-71d4-4e71-ae49-ab091d2a6b8c" />

`Constructor Peminjaman` berfungsi untuk membuat objek baru dan langsung mengisi semua atribut (nama, nim, departemen, barang, jumlah) dengan data yang diberikan saat objek dibuat.

#
<img width="713" height="224" alt="image" src="https://github.com/user-attachments/assets/60a16ddb-d9d6-45ba-9f77-c37fb1cd7127" />

Disediakan method `tampilkanInfo()` yang langsung menampilkan semua informasi peminjaman ke layar.

### PEMINJAMANSERVICE.JAVA
<img width="207" height="26" alt="image" src="https://github.com/user-attachments/assets/3e78bf60-7612-44d7-98bc-bc967346b79a" />

Menyatakan bahwa class ini berada di dalam `package service`.

#
<img width="369" height="89" alt="image" src="https://github.com/user-attachments/assets/cbb29ebe-bb20-4eee-b8e3-99fb60ead115" />

- Mengimpor `class Peminjaman` dari package model. Dibutuhkan supaya service bisa membuat, membaca, mengubah, atau menghapus objek Peminjaman.
- Mengimpor `class ArrayList` dari Java Collections Framework. Digunakan untuk menyimpan data Peminjaman secara dinamis (bisa bertambah atau berkurang).
- Mengimpor `class Scanner` untuk membaca input dari user lewat keyboard (misalnya nama, nim, barang, dll).

#
<img width="651" height="91" alt="image" src="https://github.com/user-attachments/assets/3eab6d8f-36c6-4ad3-b757-e2afab0a952c" />

Class `PeminjamanService` dideklarasikan dengan public, artinya bisa diakses dari package lain. Membuat ArrayList yang menyimpan objek Peminjaman. Membuat objek Scanner untuk membaca input dari pengguna melalui keyboard.

#
<img width="901" height="250" alt="image" src="https://github.com/user-attachments/assets/70414091-e2e0-48fb-9462-1646bd30ad78" />

Metode `inputString` digunakan untuk membaca input teks dari pengguna dan memastikan input tidak kosong sebelum dikembalikan.

#
<img width="1107" height="252" alt="image" src="https://github.com/user-attachments/assets/f1252154-88f4-450f-96d5-1658c4a9cfa1" />

Metode `inputNIM` digunakan untuk membaca input NIM dari pengguna dan memastikan NIM yang dimasukkan berupa **10 digit angka** sebelum dikembalikan.

#
<img width="911" height="384" alt="image" src="https://github.com/user-attachments/assets/31248eb1-2ed1-4410-a002-49cf07ab9dc4" />

Metode `inputJumlah` digunakan untuk membaca input angka dari pengguna, memastikan nilainya **minimal 1**, dan mengembalikan `-1` jika input kosong (digunakan saat update untuk melewati perubahan jumlah).

#
<img width="869" height="251" alt="image" src="https://github.com/user-attachments/assets/26e25277-d26a-4ed7-8987-bb0e95684dd7" />

Metode `tambah` digunakan untuk menambahkan data peminjaman baru dengan meminta pengguna memasukkan **nama, NIM, departemen, nama barang, dan jumlah**, kemudian membuat objek `Peminjaman` dan menambahkannya ke daftar.

#
<img width="991" height="217" alt="image" src="https://github.com/user-attachments/assets/c3c48401-3ce8-43ba-8294-eea8b2b34617" />

Metode `lihat` digunakan untuk menampilkan semua data peminjaman yang tersimpan; jika daftar kosong, akan menampilkan pesan “Belum ada data.”.

#
<img width="755" height="438" alt="image" src="https://github.com/user-attachments/assets/811dac21-008f-4a21-bc84-190dab9952e6" />

Metode `ubah` digunakan untuk mengubah data peminjaman yang sudah ada; pengguna memilih nomor data yang ingin diubah, kemudian mengisi nilai baru untuk atribut seperti **nama**, dan nilai tersebut langsung menggantikan data lama.

#
<img width="718" height="607" alt="image" src="https://github.com/user-attachments/assets/76ee7749-c550-46b2-90f1-4f13dbc1e25a" />

Bagian kode ini adalah **lanjutan metode `ubah`**, fungsinya:

* Meminta pengguna memasukkan **NIM baru** dan memvalidasinya agar berupa **10 digit angka** sebelum mengganti NIM lama.
* Mengganti **departemen**, **nama barang**, dan **jumlah** dengan input baru dari pengguna.
* Setelah semua data diperbarui, menampilkan pesan **“Data berhasil diubah!”** sebagai konfirmasi.

#
<img width="1223" height="280" alt="image" src="https://github.com/user-attachments/assets/58628af8-3b31-4180-82d8-863a9c41e3a7" />

Metode `hapus` digunakan untuk menghapus data peminjaman tertentu; pengguna memilih nomor data yang ingin dihapus, kemudian data tersebut dihapus dari daftar, dan menampilkan pesan konfirmasi “Data berhasil dihapus!”.

### MAIN.JAVA
<img width="172" height="29" alt="image" src="https://github.com/user-attachments/assets/26a5d691-ad40-43d1-aa29-c5871876f69d" />

Menyatakan bahwa class ini berada di dalam package main.

#
<img width="699" height="148" alt="image" src="https://github.com/user-attachments/assets/2f2bfb80-f9ec-42a5-af43-357959277a02" />

Bagian kode ini adalah **awal dari class `Main`** dan **metode `main`**, fungsinya:

* Membuat objek `Scanner` (`sc`) untuk membaca input dari pengguna.
* Membuat objek `PeminjamanService` (`ps`) untuk mengelola operasi peminjaman (tambah, lihat, ubah, hapus).
* Mendeklarasikan variabel `pil` untuk menyimpan pilihan menu dari pengguna.

Ini menjadi **titik masuk (entry point) program** di mana menu interaktif akan dijalankan.

#
<img width="973" height="328" alt="image" src="https://github.com/user-attachments/assets/b36d0c10-06b0-420a-b525-37f8782474f3" />

Bagian kode ini adalah **loop menu utama** program, fungsinya:
* Menampilkan daftar pilihan menu untuk manajemen peminjaman: **Tambah, Lihat, Ubah, Hapus, Keluar**.
* Membaca input pengguna sebagai string, lalu mencoba **mengubahnya menjadi angka** (`Integer.parseInt`).
* Jika input bukan angka, akan ditangani exception dan variabel `pil` di-set `-1` agar dianggap pilihan tidak valid.
Ini memungkinkan program tetap aman dari input yang salah dan terus menampilkan menu sampai pengguna memilih keluar.

#
<img width="897" height="297" alt="image" src="https://github.com/user-attachments/assets/ba15f8e6-7b80-4ce1-8a9d-f102ebe142f1" />

Bagian kode ini adalah **struktur pengendalian menu** di `Main`:
* Menggunakan `switch` untuk mengeksekusi **aksi sesuai pilihan** (`pil`) dari pengguna:
  * `1` → memanggil `ps.tambah()` untuk menambah data peminjaman.
  * `2` → memanggil `ps.lihat()` untuk menampilkan daftar peminjaman.
  * `3` → memanggil `ps.ubah()` untuk mengubah data peminjaman.
  * `4` → memanggil `ps.hapus()` untuk menghapus data peminjaman.
  * `5` → menampilkan pesan “Terima kasih!” dan keluar dari program.
  * `default` → menampilkan pesan “Pilihan tidak valid!” jika input tidak sesuai.
* `do…while(pil != 5)` memastikan **menu terus muncul** sampai pengguna memilih opsi keluar (`5`).

### OUTPUT
<img width="475" height="185" alt="image" src="https://github.com/user-attachments/assets/35efe001-75ea-4ea8-a200-76ef41745c05" />

Diatas merupakan output.

#
<img width="477" height="430" alt="image" src="https://github.com/user-attachments/assets/7a9035a1-7fe2-462b-a07d-bc0e596b49af" />

Diatas merupakan saat user memilih menu `nomor 1`, maka user akan diminta beberapa keterangan saat meminjam barang sekre. Saat memasukkan nim harus **sebanyak 10 angka**, jika kurang atau lebih maka akan ada peringatan. Dan juga saat memasukkan jumlah maka harus lebih dari nol nilainya.

#
<img width="473" height="349" alt="image" src="https://github.com/user-attachments/assets/616f6b65-496a-4b8c-9f76-db4bf1eaba22" />

Diatas saat user sudah melakukan pengisian data, dan memilih menu `nomor 2`. Maka akan menampilkan daftar orang yang sudah mengisi data peminjaman barang sekre.

#
<img width="467" height="541" alt="image" src="https://github.com/user-attachments/assets/084ab8a3-ff38-478a-9be7-0e17c08b3f7e" />

Diatas saat user ingin mengubah data orang yang pernah mengisi data peminjaman barang. User memilih menu `nomor 3` yang akan diminta untuk mengisi beberapa keterangan yang baru. Sama pada saat menambah peminjaman nim wajib berisi **10 angka**.

#
<img width="465" height="358" alt="image" src="https://github.com/user-attachments/assets/f1fd9089-7907-47f0-aebb-bf3860163a41" />

Diatas merupakan hasil yang telah diubah oleh user pada daftar peminjaman barang.

#
<img width="475" height="466" alt="image" src="https://github.com/user-attachments/assets/ec2ee201-0205-489b-80aa-413318e8606a" />

Disaat user ingin menghapus daftar peminjaman barang, maka akan memilih menu `nomor 4`. Yang akan ditampilkan daftar peminjaman apa saja yang ada dan akan diminta nomor berapa yang akan dihapus. Jika saat memilih nomor salah memasukkan, bukannya memasukkan angka malah memasukkan huruf maka akan ada peringatan.

#
<img width="483" height="263" alt="image" src="https://github.com/user-attachments/assets/1c7ec85f-62e5-4ea1-8def-5ecb34eed6db" />

Data peminjaman berhasil dihapus dalam daftar.

#
<img width="823" height="357" alt="image" src="https://github.com/user-attachments/assets/e6ee19d1-4599-41ef-88e1-28d3be2cb93e" />

Dan yang terakhir yaitu saat user memilih `menu nomor 5`, selanjutnya yaitu keluar dari program dan selesai.
