class BarangOlahraga {
    String idBarang;
    String namaBarang;
    int jumlah;
    String status;
    
    BarangOlahraga(String idBarang, String namaBarang, int jumlah, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.status = status;
    }

    void tampilData() {
        System.out.println("ID Barang   : " + idBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Status      : " + status);
        System.out.println("----------------------------");
    }
}