package com.maulana.polimorfisme.tugas1;

public class Pegawai {
    protected String nama;
    protected int gaji;
    protected String jabatan;

    public Pegawai() {

    }

    public Pegawai(String nama, int gaji, String jabatan) {
        this.nama = nama;
        this.gaji = gaji;
        this.jabatan = jabatan;
    }
    public int getGaji() {
        return gaji;
    }
    public String getJabatan() {
        return jabatan;
    }
}
