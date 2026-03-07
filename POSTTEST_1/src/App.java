import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<BarangOlahraga> daftarBarang = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN BARANG OLAHRAGA ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Update Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahBarang();
                    break;

                case 2:
                    tampilBarang();
                    break;

                case 3:
                    updateBarang();
                    break;

                case 4:
                    hapusBarang();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    // CREATE
    static void tambahBarang() {

        System.out.print("ID Barang : ");
        String id = input.nextLine();

        System.out.print("Nama Barang : ");
        String nama = input.nextLine();

        System.out.print("Jumlah : ");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.print("Status (Tersedia/Dipinjam) : ");
        String status = input.nextLine();

        BarangOlahraga barang = new BarangOlahraga(id, nama, jumlah, status);
        daftarBarang.add(barang);

        System.out.println("Data berhasil ditambahkan.");
    }

    // READ
    static void tampilBarang() {

        if (daftarBarang.isEmpty()) {
            System.out.println("Data barang masih kosong.");
        } else {
            for (BarangOlahraga barang : daftarBarang) {
                barang.tampilData();
            }
        }
    }

    // UPDATE
    static void updateBarang() {

        System.out.print("Masukkan ID Barang yang ingin diupdate: ");
        String id = input.nextLine();

        for (BarangOlahraga barang : daftarBarang) {

            if (barang.idBarang.equals(id)) {

                System.out.print("Nama Barang Baru : ");
                barang.namaBarang = input.nextLine();

                System.out.print("Jumlah Baru : ");
                barang.jumlah = input.nextInt();
                input.nextLine();

                System.out.print("Status Baru : ");
                barang.status = input.nextLine();

                System.out.println("Data berhasil diupdate.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }

    // DELETE
    static void hapusBarang() {

        System.out.print("Masukkan ID Barang yang ingin dihapus: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarBarang.size(); i++) {

            if (daftarBarang.get(i).idBarang.equals(id)) {
                daftarBarang.remove(i);
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }
}