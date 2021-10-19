package com.maulana.tugas;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int tarifSKS;

    Dosen(String nip, String nama, String alamat, int gaji) {
        super(nip, nama, alamat, gaji);
    }
    public void setSKS(int sks) {
        this.jumlahSKS = sks;
        super.gaji += (this.jumlahSKS * this.tarifSKS);
    }
    public int getGaji() {
        return super.getGaji();
    }
}
