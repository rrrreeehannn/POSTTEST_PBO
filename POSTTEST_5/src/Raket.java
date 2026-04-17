public class Raket extends BarangOlahraga implements OperasiBarang {

    private String jenisRaket;

    public Raket(String idBarang, String namaBarang, int jumlah, String status, String jenisRaket) {
        super(idBarang, namaBarang, jumlah, status);
        this.jenisRaket = jenisRaket;
    }

    @Override
    public void tampilData() {
        System.out.println("ID Barang   : " + getIdBarang());
        System.out.println("Nama Barang : " + getNamaBarang());
        System.out.println("Jumlah      : " + getJumlah());
        System.out.println("Status      : " + getStatus());
        System.out.println("Jenis Raket : " + jenisRaket);
        System.out.println("----------------------------");
    }

    // IMPLEMENT INTERFACE
    @Override
    public void pinjam() {
        setStatus("Dipinjam");
    }

    @Override
    public void kembalikan() {
        setStatus("Tersedia");
    }
}