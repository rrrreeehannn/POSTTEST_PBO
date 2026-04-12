# 📘 Posttest 4 - Sistem Peminjaman Barang Olahraga

## 👤 Identitas

* Nama: (Isi Nama Kamu)
* NIM: (Isi NIM Kamu)
* Kelas: (Isi Kelas Kamu)

---

## 📌 Deskripsi

Program ini merupakan lanjutan dari posttest sebelumnya yang membahas sistem peminjaman barang olahraga berbasis Java.
Pada tahap ini, program dikembangkan dengan menerapkan konsep **Polymorphism** tanpa menghilangkan konsep sebelumnya seperti:

* Encapsulation
* Inheritance
* Getter dan Setter
* Access Modifier

Program digunakan untuk mengelola data barang seperti bola dan raket, dengan fitur CRUD sederhana.

---

## ⚙️ Fitur Program

Program memiliki beberapa fitur utama, yaitu:

1. **Tambah Barang**

   * User dapat memilih jenis barang (Bola atau Raket)
   * Menginput data seperti ID, nama, jumlah, status, dan jenis

2. **Tampilkan Barang**

   * Menampilkan seluruh data barang
   * Menampilkan informasi tambahan sesuai jenis barang

3. **Update Barang**

   * Mengubah data barang berdasarkan ID

4. **Hapus Barang**

   * Menghapus barang dari daftar berdasarkan ID

---

## 🧠 Konsep OOP yang Digunakan

### 🔒 Encapsulation

Data dalam class `BarangOlahraga` dibuat bersifat private agar tidak bisa diakses langsung dari luar class.
Akses dilakukan melalui method getter dan setter.

Contoh:

```java
private String namaBarang;

public String getNamaBarang() {
    return namaBarang;
}
```

---

### 🧬 Inheritance

Class turunan dibuat untuk menghindari pengulangan kode dan mempermudah pengembangan.

* **Parent Class**: `BarangOlahraga`
* **Child Class**:

  * `Bola`
  * `Raket`

Contoh:

```java
public class Bola extends BarangOlahraga
```

---

## 🔁 Polymorphism

Pada program ini, polymorphism diterapkan dalam dua bentuk:

---

### 1. Method Overriding (Runtime Polymorphism)

Method `tampilData()` pada class parent dioverride di subclass.

Contoh:

```java
@Override
public void tampilData() {
    super.tampilData(true);
    System.out.println("Jenis Bola  : " + jenisBola);
}
```

Penjelasan:

* Method dari parent diubah perilakunya di subclass
* Output yang ditampilkan berbeda tergantung jenis objek (Bola atau Raket)

---

### 2. Method Overloading (Compile-time Polymorphism)

Method dengan nama sama tetapi parameter berbeda.

Contoh:

```java
public void tampilData() {
    tampilData(false);
}

public void tampilData(boolean detail) {
    // tampil data
}
```

Penjelasan:

* Method memiliki nama yang sama
* Dibedakan oleh parameter
* Digunakan untuk menampilkan data dengan atau tanpa detail

---

### ⚡ Contoh Polymorphism dalam Program

```java
for (BarangOlahraga barang : daftarBarang) {
    barang.tampilData();
}
```

Penjelasan:

* Satu tipe referensi (`BarangOlahraga`)
* Bisa memanggil method dari objek berbeda (`Bola` atau `Raket`)
* Output menyesuaikan dengan jenis objek

---

## 🔄 Alur Program

1. Program menampilkan menu utama
2. User memilih menu (1–5)
3. Program menjalankan fungsi sesuai pilihan
4. Data disimpan dalam ArrayList
5. Program berjalan berulang sampai user memilih Exit

---

## 📤 Penjelasan Output

Saat program dijalankan, user akan melihat menu utama untuk memilih aksi.

* **Tambah Barang**

  * User mengisi data barang
  * Program menyimpan data dan menampilkan pesan berhasil

* **Tampilkan Barang**

  * Jika kosong → muncul pesan bahwa data belum ada
  * Jika ada → data ditampilkan lengkap sesuai jenis barang

* **Update Barang**

  * Program mencari berdasarkan ID
  * Jika ditemukan → data diperbarui
  * Jika tidak → muncul pesan tidak ditemukan

* **Hapus Barang**

  * Data dihapus jika ID ditemukan
  * Jika tidak → muncul pesan error

* **Exit**

  * Program berhenti

---

## 🗂️ Struktur Folder

```
Posttest4/
│
├── App.java
├── BarangOlahraga.java
├── Bola.java
├── Raket.java
```

---

## ✅ Kesimpulan

Program ini telah berhasil menerapkan konsep **Polymorphism** secara logis, yaitu:

* Overriding untuk menyesuaikan perilaku method di subclass
* Overloading untuk fleksibilitas penggunaan method
* Tetap mempertahankan konsep sebelumnya seperti encapsulation dan inheritance

Dengan penerapan ini, program menjadi lebih fleksibel, terstruktur, dan mudah dikembangkan ke depannya.

---
