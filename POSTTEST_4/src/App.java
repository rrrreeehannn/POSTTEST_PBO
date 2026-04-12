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

    static void tambahBarang() {

        System.out.println("Pilih Jenis Barang:");
        System.out.println("1. Bola");
        System.out.println("2. Raket");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("ID Barang : ");
        String id = input.nextLine();

        System.out.print("Nama Barang : ");
        String nama = input.nextLine();

        System.out.print("Jumlah : ");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.print("Status : ");
        String status = input.nextLine();

        if (jenis == 1) {
            System.out.print("Jenis Bola : ");
            String jenisBola = input.nextLine();
            daftarBarang.add(new Bola(id, nama, jumlah, status, jenisBola));

        } else if (jenis == 2) {
            System.out.print("Jenis Raket : ");
            String jenisRaket = input.nextLine();
            daftarBarang.add(new Raket(id, nama, jumlah, status, jenisRaket));

        } else {
            System.out.println("Jenis tidak valid.");
            return;
        }

        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampilBarang() {

        if (daftarBarang.isEmpty()) {
            System.out.println("Data barang masih kosong.");
        } else {
            for (BarangOlahraga barang : daftarBarang) {
                barang.tampilData(); // polymorphism terjadi di sini
            }
        }
    }

    static void updateBarang() {

        System.out.print("Masukkan ID Barang yang ingin diupdate: ");
        String id = input.nextLine();

        for (BarangOlahraga barang : daftarBarang) {

            if (barang.getIdBarang().equals(id)) {

                System.out.print("Nama Barang Baru : ");
                barang.setNamaBarang(input.nextLine());

                System.out.print("Jumlah Baru : ");
                barang.setJumlah(input.nextInt());
                input.nextLine();

                System.out.print("Status Baru : ");
                barang.setStatus(input.nextLine());

                System.out.println("Data berhasil diupdate.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }

    static void hapusBarang() {

        System.out.print("Masukkan ID Barang yang ingin dihapus: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarBarang.size(); i++) {

            if (daftarBarang.get(i).getIdBarang().equals(id)) {
                daftarBarang.remove(i);
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("Barang tidak ditemukan.");
    }
}