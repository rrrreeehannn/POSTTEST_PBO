public class Bola extends BarangOlahraga {

    private String jenisBola;

    public Bola(String idBarang, String namaBarang, int jumlah, String status, String jenisBola) {
        super(idBarang, namaBarang, jumlah, status);
        this.jenisBola = jenisBola;
    }

    public String getJenisBola() {
        return jenisBola;
    }

    public void setJenisBola(String jenisBola) {
        this.jenisBola = jenisBola;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Bola  : " + jenisBola);
        System.out.println("----------------------------");
    }
}