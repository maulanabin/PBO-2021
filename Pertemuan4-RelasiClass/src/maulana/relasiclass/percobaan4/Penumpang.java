package maulana.relasiclass.percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public String getKtp() {
        return ktp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public String info() {
        String info = "";
        info += "KTP: " + ktp + "\n";
        info += "Nama\t\t: " + nama + "\n";
        return info;
    }
}
