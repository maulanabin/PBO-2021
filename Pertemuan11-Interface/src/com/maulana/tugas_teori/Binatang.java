package com.maulana.tugas_teori;

public abstract class Binatang {
    protected String nama;
    protected int jumlahKaki;

    public Binatang(String nama, int jumlahKaki) {
        this.setNama(nama);
        this.setJumlahKaki(jumlahKaki);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    public int getJumlahKaki() {
        return jumlahKaki;
    }
    public abstract void displayBinatang();
}
