public class Bola extends BarangOlahraga implements OperasiBarang {

    private String jenisBola;

    public Bola(String idBarang, String namaBarang, int jumlah, String status, String jenisBola) {
        super(idBarang, namaBarang, jumlah, status);
        this.jenisBola = jenisBola;
    }

    @Override
    public void tampilData() {
        System.out.println("ID Barang   : " + getIdBarang());
        System.out.println("Nama Barang : " + getNamaBarang());
        System.out.println("Jumlah      : " + getJumlah());
        System.out.println("Status      : " + getStatus());
        System.out.println("Jenis Bola  : " + jenisBola);
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