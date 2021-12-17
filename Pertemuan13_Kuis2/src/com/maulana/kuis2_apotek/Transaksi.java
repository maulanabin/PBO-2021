package com.maulana.kuis2_apotek;

public class Transaksi {
    private String tanggalTransaksi;
    private Kasir kasir;
    private Pembeli pembeli;
    private Obat obat;
    private int jumlah;
    private int totalBiaya;

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }
    public Pembeli getPembeli() {
        return pembeli;
    }
    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }
    public int getTotalBiaya() {
        return obat.getHarga() * getJumlah();
    }
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public Transaksi(String tanggalTransaksi, Kasir kasir, Pembeli pembeli, Obat obat, int jumlah) {
        this.tanggalTransaksi = tanggalTransaksi;
        this.kasir = kasir;
        this.pembeli = pembeli;
        this.obat = obat;
        this.jumlah = jumlah;
        this.totalBiaya = 0;
    }
    public void cetakTranksaksi() {
        System.out.println(" Tanggal Transaksi: " + getTanggalTransaksi());
        pembeli.infoPembeli();
        obat.infoObat();
        System.out.println(" Jumlah\t\t\t: " + getJumlah());
        System.out.println(" Total Biaya\t: " + getTotalBiaya());
        kasir.infoKaryawan();
    }
}
