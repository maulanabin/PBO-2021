package com.maulana.polimorfisme.tugas1;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, String jabatan, int bonus) {
        super(nama, gaji, jabatan);
        this.bonus = bonus;
    }
    @Override
    public int getGaji() {
        return super.getGaji();
    }
    @Override
    public String getJabatan() {
        return super.getJabatan();
    }
    public int getBonus() {
        return this.bonus;
    }
}
