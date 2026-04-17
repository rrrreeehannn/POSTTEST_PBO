public class Raket extends BarangOlahraga {

    private String jenisRaket;

    public Raket(String idBarang, String namaBarang, int jumlah, String status, String jenisRaket) {
        super(idBarang, namaBarang, jumlah, status);
        this.jenisRaket = jenisRaket;
    }

    public String getJenisRaket() {
        return jenisRaket;
    }

    public void setJenisRaket(String jenisRaket) {
        this.jenisRaket = jenisRaket;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Raket : " + jenisRaket);
        System.out.println("----------------------------");
    }
}