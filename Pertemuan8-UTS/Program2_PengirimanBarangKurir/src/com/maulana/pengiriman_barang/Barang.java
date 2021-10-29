package com.maulana.pengiriman_barang;

public class Barang {
    private String nomor;
    private String namaBarang;
    private int jumlah;
    private int beratBarang;

    public Barang(String nomor, String namaBarang, int jumlah, int beratBarang) {
        this.nomor = nomor;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.beratBarang = beratBarang;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }
    public int getBeratBarang() {
        return beratBarang;
    }
    public String info() {
        String info = "";
        info += "Nomor Barang\t: " + this.nomor + "\n";
        info += "Nama Barang\t\t: " + this.namaBarang + "\n";
        info += "Jumlah Barang\t: " + this.jumlah + "\n";
        info += "Berat Barang\t: " + this.beratBarang;
        return info;
    }

}
