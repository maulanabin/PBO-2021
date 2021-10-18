package com.maulana.kuis;

public class Pemilik {
    private String idPemilik;
    private String nama;
    private String noHp;

    public Pemilik() {

    }
    public void setIdPemilik(String idPemilik) {
        this.idPemilik = idPemilik;
    }
    public String getIdPemilik() {
        return idPemilik;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public String getNoHp() {
        return noHp;
    }
    public String info() {
        String info = "\n";
        info += "ID Pemilik\t: " + idPemilik + "\n";
        info += "Nama\t\t: " + nama + "\n";
        info += "No HP\t\t: " + noHp + "\n";
        return info;
    }
}
