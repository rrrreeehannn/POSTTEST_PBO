# 📘 Posttest 3 - Sistem Peminjaman Barang Olahraga

## 👤 Identitas

* Nama: (Isi Nama Kamu)
* NIM: (Isi NIM Kamu)
* Kelas: (Isi Kelas Kamu)

---

## 📌 Deskripsi Program

Program ini merupakan pengembangan dari sistem peminjaman barang olahraga berbasis Java.
Pada Posttest 3 ini, program telah menerapkan konsep **Object Oriented Programming (OOP)** yaitu:

* Encapsulation (pembungkusan data)
* Inheritance (pewarisan)
* Getter dan Setter
* Access Modifier

Program digunakan untuk mengelola data barang olahraga seperti:

* Menambahkan barang
* Menampilkan barang
* Mengupdate data
* Menghapus data

---

## ⚙️ Fitur Program

1. **Tambah Barang**

   * User dapat menambahkan barang berdasarkan jenis:

     * Bola
     * Raket
   * Data yang diinput:

     * ID Barang
     * Nama Barang
     * Jumlah
     * Status
     * Jenis khusus (bola/raket)

2. **Tampilkan Barang**

   * Menampilkan seluruh data barang yang sudah diinput
   * Menampilkan juga atribut khusus dari subclass

3. **Update Barang**

   * Mengubah data barang berdasarkan ID
   * Data yang bisa diubah:

     * Nama
     * Jumlah
     * Status

4. **Hapus Barang**

   * Menghapus data barang berdasarkan ID

---

## 🧠 Konsep OOP yang Digunakan

### 1. Encapsulation

Encapsulation diterapkan pada class `BarangOlahraga` dengan cara:

* Menggunakan **access modifier `private`** pada semua atribut
* Mengakses atribut menggunakan **getter dan setter**

Contoh:

```java
private String idBarang;

public String getIdBarang() {
    return idBarang;
}
```

---

### 2. Access Modifier

Program menggunakan minimal 2 jenis access modifier:

* `private` → untuk melindungi data
* `public` → untuk method agar bisa diakses dari class lain

---

### 3. Inheritance (Pewarisan)

Inheritance digunakan untuk membuat class turunan dari class utama.

* **Parent Class**: `BarangOlahraga`
* **Child Class**:

  * `Bola`
  * `Raket`

Contoh:

```java
public class Bola extends BarangOlahraga
```

Tujuan:

* Menghindari duplikasi kode
* Mempermudah pengelolaan data

---

### 4. Method Overriding

Subclass melakukan override method `tampilData()` untuk menambahkan informasi khusus.

Contoh:

```java
@Override
public void tampilData() {
    super.tampilData();
    System.out.println("Jenis Bola  : " + jenisBola);
}
```

---

## 🔄 Alur Program

1. Program menampilkan menu utama
2. User memilih menu (1–5)
3. Program menjalankan fungsi sesuai pilihan:

   * Tambah data → input data → disimpan ke ArrayList
   * Tampil data → menampilkan semua data
   * Update → mencari berdasarkan ID → ubah data
   * Hapus → mencari berdasarkan ID → hapus data
4. Program akan terus berjalan sampai user memilih **Exit**

---

## 📤 Penjelasan Output Program

Saat program dijalankan, akan muncul menu seperti berikut:

```
=== SISTEM PEMINJAMAN BARANG OLAHRAGA ===
1. Tambah Barang
2. Tampilkan Barang
3. Update Barang
4. Hapus Barang
5. Exit
```

### ➕ Saat Menambah Barang

* User memilih jenis barang (Bola atau Raket)
* Program meminta input data
* Setelah selesai, akan muncul pesan:

```
Data berhasil ditambahkan.
```

---

### 📋 Saat Menampilkan Barang

* Jika data kosong:

```
Data barang masih kosong.
```

* Jika ada data:
  Program akan menampilkan seluruh informasi barang, termasuk:
* ID
* Nama
* Jumlah
* Status
* Jenis khusus (Bola/Raket)

---

### ✏️ Saat Update Barang

* User memasukkan ID barang
* Jika ditemukan:

```
Data berhasil diupdate.
```

* Jika tidak ditemukan:

```
Barang tidak ditemukan.
```

---

### ❌ Saat Hapus Barang

* User memasukkan ID barang
* Jika ditemukan:

```
Data berhasil dihapus.
```

* Jika tidak ditemukan:

```
Barang tidak ditemukan.
```

---

### 🚪 Saat Exit

Program akan berhenti dengan pesan:

```
Program selesai.
```

---

## 🗂️ Struktur Folder

```
Posttest3/
│
├── App.java
├── BarangOlahraga.java
├── Bola.java
├── Raket.java
└── README.md
```

---

## ✅ Kesimpulan

Program ini berhasil menerapkan konsep OOP dengan baik, khususnya:

* Encapsulation untuk keamanan data
* Inheritance untuk efisiensi dan struktur kode
* Getter & Setter untuk akses data yang terkontrol

Sehingga program menjadi lebih terstruktur, mudah dikembangkan, dan sesuai dengan prinsip pemrograman berorientasi objek.

---