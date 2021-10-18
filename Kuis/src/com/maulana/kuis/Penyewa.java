package com.maulana.kuis;

public class Penyewa {
    private String noKtp;
    private String nama;
    private String alamat;

    public Penyewa() {

    }
    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }
    public String getNoKtp() {
        return noKtp;
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
        info += "No KTP\t\t: " + noKtp + "\n";
        info += "Nama\t\t: " + nama + "\n";
        info += "Alamat\t\t: " + alamat + "\n";
        return info;
    }
}
