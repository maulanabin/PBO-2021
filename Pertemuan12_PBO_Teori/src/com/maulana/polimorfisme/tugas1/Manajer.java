package com.maulana.polimorfisme.tugas1;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, String jabatan, int tunjangan) {
        super(nama, gaji, jabatan);
        this.tunjangan = tunjangan;
    }
    @Override
    public int getGaji() {
        return super.getGaji();
    }
    @Override
    public String getJabatan() {
        return super.getJabatan();
    }
    public int getTunjangan() {
        return this.tunjangan;
    }
}
