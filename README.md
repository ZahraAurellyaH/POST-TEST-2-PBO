# POST-TEST-2-PBO

## NAMA: ZAHRA AURELLYA HERDIANSYAH

## NIM:2409116062

<img width="378" height="323" alt="Screenshot 2025-09-14 133527" src="https://github.com/user-attachments/assets/279b5825-7362-49df-b5fa-ec1a247312f7" />

1. com.mycompany.main
- Berisi Main.java
- Fungsi: Menjadi titik masuk (entry point) program. Di sini terdapat menu interaktif untuk user (CRUD: Tambah, Lihat, Ubah, Hapus).
2. com.mycompany.model
- Berisi Peminjaman.java
- Fungsi: Menyimpan struktur data (atribut namaPeminjam, nim, departemen, namaBarang, jumlah) beserta constructor, getter, dan setter. Class ini merepresentasikan objek peminjaman.
3. com.mycompany.service
- Berisi PeminjamanService.java
- Fungsi: Mengelola logika CRUD. Berisi method untuk menambah, melihat, mengubah, dan menghapus data Peminjaman

### PEMINJAMAN.JAVA
<img width="401" height="41" alt="Screenshot 2025-09-14 133622" src="https://github.com/user-attachments/assets/7c2633f1-2680-4424-a00b-d2d43d30ac7c" />

Package com.mycompany.model berisi class yang merepresentasikan struktur data peminjaman. Di dalamnya terdapat properti, constructor, dan metode akses (getter/setter) yang digunakan sebagai dasar pengolahan data pada sistem manajemen peminjaman barang.

#
<img width="311" height="168" alt="image" src="https://github.com/user-attachments/assets/f8f07dc5-1f20-47f3-a858-16b8ab11c09b" />

Class Peminjaman di atas berfungsi untuk merepresentasikan data peminjaman barang. Memiliki 5 properti: namaPeminjam, nim, departemen, namaBarang, dan jumlah. Terdapat constructor untuk mengisi data saat objek dibuat. Disediakan method tampilkanInfo() yang langsung menampilkan semua informasi peminjaman ke layar.

#
<img width="1305" height="188" alt="Screenshot 2025-09-14 133645" src="https://github.com/user-attachments/assets/1eed385b-be68-4bfa-a728-7ad13cf96247" />

Terdapat constructor untuk mengisi data saat objek dibuat.

#
<img width="863" height="213" alt="image" src="https://github.com/user-attachments/assets/9efbc18a-0f42-4a22-a56d-08163c2f76be" />

Disediakan method tampilkanInfo() yang langsung menampilkan semua informasi peminjaman ke layar.

### PEMINJAMANSERVICE.JAVA
<img width="424" height="37" alt="image" src="https://github.com/user-attachments/assets/337dba05-f047-4ce4-af5e-f0897110d1e9" />

Menyatakan bahwa class ini berada di dalam package service.

<img width="510" height="86" alt="image" src="https://github.com/user-attachments/assets/9e4fc2ef-d135-4e31-8cc8-351df7feea22" />

- Mengimpor class Peminjaman dari package model. Dibutuhkan supaya service bisa membuat, membaca, mengubah, atau menghapus objek Peminjaman.
- Mengimpor class ArrayList dari Java Collections Framework. Digunakan untuk menyimpan data Peminjaman secara dinamis (bisa bertambah atau berkurang).
- Mengimpor class Scanner untuk membaca input dari user lewat keyboard (misalnya nama, nim, barang, dll).

#
<img width="791" height="103" alt="image" src="https://github.com/user-attachments/assets/229fbead-470b-4f97-8b71-4d4716833bdc" />

Class PeminjamanService dideklarasikan dengan public, artinya bisa diakses dari package lain. Membuat ArrayList yang menyimpan objek Peminjaman. Membuat objek Scanner untuk membaca input dari pengguna melalui keyboard.

#
<img width="1020" height="575" alt="image" src="https://github.com/user-attachments/assets/5884f067-e729-4713-aa8a-00e5eebd9ff1" />

Method `public void tambahPeminjaman()` berfungsi untuk menambahkan data peminjaman baru ke dalam daftar. Pertama, program meminta input dari pengguna berupa nama, NIM, departemen, nama barang, dan jumlah barang menggunakan `Scanner`. Setelah itu dilakukan validasi, jika jumlah barang yang dimasukkan kurang dari 1 maka program menolak dan menampilkan pesan error. Jika valid, program akan membuat objek baru dari class `Peminjaman` dengan data yang dimasukkan, kemudian menambahkannya ke `ArrayList daftarPeminjaman`, dan memberikan konfirmasi bahwa data berhasil ditambahkan.

#
<img width="818" height="338" alt="image" src="https://github.com/user-attachments/assets/84e2faf7-35ad-4ea9-a4f2-bff361c525b0" />

Method `public void lihatPeminjaman()` digunakan untuk menampilkan seluruh data peminjaman yang tersimpan di dalam `ArrayList daftarPeminjaman`. Pertama, program mencetak judul daftar, lalu melakukan pengecekan apakah daftar masih kosong. Jika kosong, ditampilkan pesan bahwa belum ada data peminjaman. Namun, jika ada data, program akan melakukan perulangan `for` untuk menampilkan setiap data secara berurutan, dengan menampilkan nomor urut, memanggil method `tampilkanInfo()` dari objek `Peminjaman` untuk menampilkan detail peminjaman, lalu memberikan pemisah garis agar data terlihat lebih rapi.

#
<img width="813" height="202" alt="image" src="https://github.com/user-attachments/assets/074f720d-0488-476c-b9ce-1acb1dda7bc7" />

Method `public void ubahPeminjaman()` digunakan untuk mengubah data peminjaman yang sudah ada. Pertama, method ini memanggil `lihatPeminjaman()` agar pengguna bisa melihat daftar data yang tersedia. Jika daftar masih kosong, method langsung dihentikan dengan `return`. Jika ada data, program meminta input nomor data yang ingin diubah, kemudian dikurangi 1 agar sesuai dengan indeks `ArrayList` (karena indeks dimulai dari 0), lalu `scanner.nextLine()` digunakan untuk membersihkan buffer input setelah pengguna memasukkan angka.

#
<img width="1316" height="547" alt="image" src="https://github.com/user-attachments/assets/973b766f-8040-4e3d-9bad-dd6b265630c3" />

Potongan kode di atas adalah bagian dari method `ubahPeminjaman()` yang berfungsi memperbarui data peminjaman. Pertama dicek apakah indeks yang dipilih (`idxUbah`) valid, yaitu berada dalam rentang ukuran `daftarPeminjaman`. Jika valid, program meminta input data baru dari pengguna, mulai dari nama, NIM, departemen, barang, hingga jumlah. Setelah itu dilakukan validasi jumlah agar tidak kurang dari 1. Jika jumlah valid, data lama pada posisi `idxUbah` diganti dengan objek `Peminjaman` baru menggunakan `daftarPeminjaman.set(idxUbah, p)`. Terakhir, sistem menampilkan pesan bahwa data berhasil diubah.

#
<img width="691" height="114" alt="image" src="https://github.com/user-attachments/assets/af7849f7-c7e3-4fa5-b83b-e452a8c63c4c" />

Potongan kode tersebut adalah bagian penutup dari method ubahPeminjaman(). Jika indeks yang dimasukkan pengguna (idxUbah) tidak sesuai dengan rentang data yang ada di daftarPeminjaman, maka blok else akan dijalankan dan menampilkan pesan "Nomor tidak valid!".

#
<img width="821" height="437" alt="image" src="https://github.com/user-attachments/assets/d23f3dbe-e8ed-40c1-bcab-1150b40ee43c" />

Method `hapusPeminjaman()` berfungsi untuk menghapus data peminjaman dari daftar. Pertama, method memanggil `lihatPeminjaman()` agar pengguna bisa melihat daftar data yang tersedia. Jika daftar kosong, method langsung berhenti dengan `return`. Jika ada data, pengguna diminta memilih nomor data yang ingin dihapus, lalu program mengurangi nilai input dengan `-1` agar sesuai dengan indeks `ArrayList`. Jika nomor valid (masuk dalam rentang data), maka data pada indeks tersebut dihapus dengan `remove()`, dan program menampilkan pesan **"Data berhasil dihapus!"**. Jika tidak valid, maka akan muncul pesan **"Nomor tidak valid!"**. Kurung kurawal terakhir `}` menutup method, dan `}` berikutnya menutup kelas `PeminjamanService`.

### MAIN.JAVA
<img width="394" height="38" alt="image" src="https://github.com/user-attachments/assets/45c3c5bc-8b28-4dad-a2d8-ebb63b83c103" />

Menyatakan bahwa class ini berada di dalam package main.

#
<img width="627" height="86" alt="image" src="https://github.com/user-attachments/assets/d08f8f23-939c-4131-919f-467b931be552" />

Mengimpor class PeminjamanService dari package com.mycompany.service, yang berisi logika CRUD peminjaman.
Mengimpor class InputMismatchException dari Java Utility, digunakan untuk menangani error ketika input user tidak sesuai tipe data yang diminta (misalnya memasukkan huruf padahal harus angka).
Mengimpor class Scanner yang dipakai untuk membaca input dari keyboard (user).

#
<img width="765" height="131" alt="image" src="https://github.com/user-attachments/assets/79af23dd-90c9-4e33-9409-a4b865d03e16" />

Kode di atas menambahkan **validasi input** dengan `try-catch` untuk mencegah error ketika user memasukkan selain angka; jika salah, program menampilkan pesan "Input harus berupa angka!" dan kembali ke menu tanpa crash.

#
<img width="980" height="324" alt="image" src="https://github.com/user-attachments/assets/5738ccfc-22f3-4622-aebe-c3054b6f1c9d" />

Potongan kode ini menampilkan menu utama lalu meminta input dari user. Input dibungkus dengan **try-catch** untuk mengantisipasi kesalahan, misalnya jika user memasukkan huruf saat diminta angka, sehingga program tetap aman dan tidak langsung error.

#
<img width="1071" height="801" alt="image" src="https://github.com/user-attachments/assets/8af92baa-f2f5-4fe8-9213-bf736defb834" />

Program ini menampilkan menu peminjaman dengan pilihan tambah, lihat, ubah, hapus, dan keluar, serta menangani input yang bukan angka.

### OUTPUT
<img width="475" height="185" alt="image" src="https://github.com/user-attachments/assets/35efe001-75ea-4ea8-a200-76ef41745c05" />
Diatas merupakan output.

#
