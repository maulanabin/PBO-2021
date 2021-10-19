package com.maulana.tugas;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public int gaji;

    Pegawai(String nip, String nama, String alamat, int gaji) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
    }
    public String getNip() {
        return this.nip;
    }
    public String getNama() {
        return this.nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    protected int getGaji() {
        return this.gaji;
    }
}
