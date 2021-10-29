package com.maulana.pengiriman_barang;

public class Dropshiper {
    private String ktp;
    private String nama;

    public Dropshiper() {

    }
    public Dropshiper(String ktp, String nama) {
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
    public int getGaji() {
        return 1500000;
    }
}
