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
<img width="415" height="173" alt="Screenshot 2025-09-14 133631" src="https://github.com/user-attachments/assets/a55c896f-b888-418c-b167-f165fbc9e4de" />

Class Peminjaman pada package model berperan sebagai representasi data peminjaman barang. Class ini memiliki lima atribut utama yaitu namaPeminjam, nim, departemen, namaBarang, dan jumlah. Seluruh atribut bersifat private untuk menerapkan prinsip enkapsulasi sehingga pengaksesan dan perubahan nilainya dilakukan melalui constructor, getter, dan setter.

#
<img width="1305" height="188" alt="Screenshot 2025-09-14 133645" src="https://github.com/user-attachments/assets/1eed385b-be68-4bfa-a728-7ad13cf96247" />

Constructor pada class Peminjaman berfungsi untuk memberikan nilai awal pada setiap atribut saat objek baru dibuat. Parameter yang dimasukkan (nama peminjam, NIM, departemen, nama barang, dan jumlah) langsung disimpan ke dalam atribut class melalui keyword this. Dengan adanya constructor, proses pembuatan objek menjadi lebih mudah dan konsisten

#
<img width="499" height="78" alt="image" src="https://github.com/user-attachments/assets/ddc5eecd-1e03-492a-a901-332e8a5d6403" />

Getter getNamaPeminjam() berfungsi untuk mengembalikan nilai atribut namaPeminjam. Penggunaan getter memungkinkan akses data tetap terkontrol sesuai prinsip enkapsulasi dalam OOP.

#
<img width="689" height="86" alt="image" src="https://github.com/user-attachments/assets/1d641457-e6af-47b5-9680-90609beb0774" />

Setter setNamaPeminjam() berfungsi untuk memberikan atau memperbarui nilai pada atribut namaPeminjam. Metode ini menjaga prinsip enkapsulasi karena perubahan nilai tidak dilakukan secara langsung, melainkan melalui mekanisme setter.

#
<img width="389" height="90" alt="image" src="https://github.com/user-attachments/assets/85abfdb8-b774-4086-b9b7-a7ac0e3eaf31" />

Getter getNim() digunakan untuk mengambil nilai dari atribut nim. Dengan adanya getter, data tetap aman karena hanya bisa diakses melalui metode khusus, bukan langsung dari luar class.

#
<img width="473" height="82" alt="image" src="https://github.com/user-attachments/assets/f25512d2-c587-4b0d-a7a4-2e1b4174fc97" />

Getter getDepartemen() digunakan untuk mengakses nilai dari atribut departemen. Hal ini menjaga keamanan data karena akses dilakukan melalui metode khusus, bukan langsung ke variabel.

#
<img width="650" height="83" alt="image" src="https://github.com/user-attachments/assets/c192c0d7-bcea-42d9-a56d-d9847c464987" />

Setter setDepartemen() berfungsi untuk mengubah nilai dari atribut departemen. Penggunaan setter menjaga konsistensi data karena perubahan nilai dilakukan melalui metode yang telah ditentukan, bukan langsung pada variabel.

#
<img width="465" height="82" alt="image" src="https://github.com/user-attachments/assets/7e2de407-a901-41dc-bae4-e7f1f796885e" />

Getter getNamaBarang() digunakan untuk mengambil nilai atribut namaBarang. Hal ini mendukung konsep enkapsulasi karena data tidak diakses secara langsung, melainkan melalui metode khusus.

#
<img width="645" height="89" alt="Screenshot 2025-09-14 134702" src="https://github.com/user-attachments/assets/49a666bd-15b5-45c7-b849-3a48036dccd2" />

Setter setNamaBarang() digunakan untuk menetapkan nilai baru pada atribut namaBarang. Penggunaan setter menjaga keamanan data dengan tetap menerapkan prinsip enkapsulasi.

#
<img width="383" height="87" alt="image" src="https://github.com/user-attachments/assets/2640904e-6294-48d9-acbe-877e03d3409e" />

Getter getJumlah() digunakan untuk mengakses atau mengambil nilai atribut jumlah. Metode ini menjaga akses data tetap terkontrol sesuai prinsip enkapsulasi.


<img width="510" height="111" alt="Screenshot 2025-09-14 134827" src="https://github.com/user-attachments/assets/c05fde7e-a218-4363-900f-b5ddf9c8de5c" />

Setter setJumlah() digunakan untuk memperbarui nilai atribut jumlah. Dengan adanya setter, perubahan data tetap terkontrol sesuai prinsip enkapsulasi dalam OOP.
