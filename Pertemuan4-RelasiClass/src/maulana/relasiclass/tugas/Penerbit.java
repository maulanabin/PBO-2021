package maulana.relasiclass.tugas;

public class Penerbit {
    private String nama;
    private String alamat;

    public Penerbit() {

    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public String info() {
        String info = "\n";
        info += "Nama\t\t\t: " + nama + "\n";
        info += "Alamat\t\t\t: " + alamat + "\n";
        return info;
    }
}
