package com.maulana.pbo_teori.abstract_class;

public abstract class Robot {
    String nama;
    String pemilik;
    int tahun;

    public void setTahunPembuatan(int tahun) {
        this.tahun = tahun;
    }
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    public abstract void setNama(String nama);

    public void cetakInfoRobot() {
        System.out.println("Nama Robot\t\t\t: " + nama);
        System.out.println("Pemilik Robot\t\t: " + pemilik);
        System.out.println("Tahun Pembuatan\t: " + tahun);
    }
}
