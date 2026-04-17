public abstract class BarangOlahraga {

    private String idBarang;
    private String namaBarang;
    private int jumlah;
    private String status;

    public BarangOlahraga(String idBarang, String namaBarang, int jumlah, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.status = status;
    }

    // GETTER
    public String getIdBarang() { return idBarang; }
    public String getNamaBarang() { return namaBarang; }
    public int getJumlah() { return jumlah; }
    public String getStatus() { return status; }

    // SETTER
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public void setStatus(String status) { this.status = status; }

    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI DI CHILD)
    public abstract void tampilData();
}