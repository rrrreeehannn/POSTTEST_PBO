# LAPORAN PROGRAM

## SISTEM PEMINJAMAN BARANG OLAHRAGA

### 1. Pendahuluan

Program ini dibuat untuk mengelola data peminjaman barang olahraga seperti bola dan raket. Sistem ini memungkinkan pengguna untuk menambahkan, melihat, mengubah, menghapus, meminjam, dan mengembalikan barang. Program dibuat menggunakan bahasa pemrograman Java dengan konsep **Object-Oriented Programming (OOP)**.

---

### 2. Tujuan

Tujuan dari pembuatan program ini adalah:

* Menerapkan konsep **Inheritance (Pewarisan)**
* Menggunakan **Abstract Class**
* Mengimplementasikan **Interface**
* Menerapkan konsep **Polymorphism**
* Membuat program CRUD sederhana menggunakan ArrayList

---

### 3. Struktur Program

Program terdiri dari beberapa class utama, yaitu:

#### a. Class `BarangOlahraga` (Abstract Class)

Merupakan class induk yang menyimpan atribut umum:

* idBarang
* namaBarang
* jumlah
* status

Class ini memiliki method abstract:

* `tampilData()` → wajib diimplementasikan oleh class turunan

---

#### b. Interface `OperasiBarang`

Interface ini berisi method:

* `pinjam()`
* `kembalikan()`

Method ini digunakan untuk mengatur status barang.

---

#### c. Class `Bola` (Child Class)

Merupakan turunan dari `BarangOlahraga` dan mengimplementasikan `OperasiBarang`.
Memiliki atribut tambahan:

* jenisBola

---

#### d. Class `Raket` (Child Class)

Merupakan turunan dari `BarangOlahraga` dan mengimplementasikan `OperasiBarang`.
Memiliki atribut tambahan:

* jenisRaket

---

#### e. Class `App` (Main Class)

Class utama yang berfungsi sebagai pengontrol program dengan menu:

1. Tambah Barang
2. Tampilkan Barang
3. Update Barang
4. Hapus Barang
5. Pinjam Barang
6. Kembalikan Barang
7. Exit

---

### 4. Konsep OOP yang Digunakan

#### a. Inheritance

Class `Bola` dan `Raket` mewarisi class `BarangOlahraga`.

#### b. Abstract Class

`BarangOlahraga` dibuat abstract agar tidak bisa diinstansiasi langsung dan memiliki method abstract `tampilData()`.

#### c. Interface

Interface `OperasiBarang` digunakan untuk mendefinisikan perilaku pinjam dan kembali.

#### d. Polymorphism

Terjadi saat pemanggilan method `tampilData()` pada objek bertipe `BarangOlahraga`.

---

### 5. Cara Kerja Program

1. Program menampilkan menu utama.
2. User memilih menu sesuai kebutuhan.
3. Data disimpan dalam `ArrayList`.
4. User dapat melakukan operasi CRUD.
5. Fitur tambahan memungkinkan user meminjam dan mengembalikan barang.

---

### 6. Kelebihan Program

* Menggunakan konsep OOP secara lengkap
* Struktur program rapi dan modular
* Mudah dikembangkan
* Memiliki fitur tambahan (pinjam & kembali)

---

### 7. Kekurangan Program

* Data belum tersimpan ke file (masih sementara di memori)
* Tampilan masih berbasis console
* Belum ada validasi input yang lengkap

---

### 8. Kesimpulan

Program sistem peminjaman barang olahraga ini berhasil dibuat dengan menerapkan konsep OOP seperti inheritance, abstract class, interface, dan polymorphism. Program ini dapat membantu dalam pengelolaan data barang secara sederhana dan dapat dikembangkan lebih lanjut.

---