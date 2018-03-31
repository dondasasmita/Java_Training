package Input_Output_Data.literacy_rate_indonesia.poverty_in_bali;

public class Literacy {

    int kode_provinsi;
    String nama_provinsi;
    int kode_kabkota;
    String nama_kabkota;
    int tahun;
    double angka_melek_huruf;

    public int getKode_provinsi() {
        return kode_provinsi;
    }

    public void setKode_provinsi(int kode_provinsi) {
        this.kode_provinsi = kode_provinsi;
    }

    public String getNama_provinsi() {
        return nama_provinsi;
    }

    public void setNama_provinsi(String nama_provinsi) {
        this.nama_provinsi = nama_provinsi;
    }

    public int getKode_kabkota() {
        return kode_kabkota;
    }

    public void setKode_kabkota(int kode_kabkota) {
        this.kode_kabkota = kode_kabkota;
    }

    public String getNama_kabkota() {
        return nama_kabkota;
    }

    public void setNama_kabkota(String nama_kabkota) {
        this.nama_kabkota = nama_kabkota;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getAngka_melek_huruf() {
        return angka_melek_huruf;
    }

    public void setAngka_melek_huruf(double angka_melek_huruf) {
        this.angka_melek_huruf = angka_melek_huruf;
    }

    @Override
    public String toString() {
        return "Kode Provinsi : " + getKode_provinsi()+
                " | Nama Provinsi : " + getNama_provinsi()+
                " | Kode Kabupaten Kota : " + getKode_kabkota() +
                " | Nama Kabupaten Kota : " + getNama_kabkota() +
                " | Tahun : " + getTahun() +
                " | Angka Melek Huruf : " + getAngka_melek_huruf();
    }
}
