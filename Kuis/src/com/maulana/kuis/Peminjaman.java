package com.maulana.kuis;

public class Peminjaman {
    private String idPinjam;
    private int jumlahPinjam;
    private Penyewa penyewa;
    private Barang barang;
    private Pemilik pemilik;


    public Peminjaman() {

    }
    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }
    public String getIdPinjam() {
        return idPinjam;
    }
    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }
    public Penyewa getPenyewa() {
        return penyewa;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public Barang getBarang() {
        return barang;
    }
    public void setPemilik(Pemilik pemilik) {
        this.pemilik = pemilik;
    }
    public Pemilik getPemilik() {
        return pemilik;
    }
    public String info() {
        String info = "\n";
        info += "ID Pinjam\t: " + idPinjam + "\n";
        info += "Jumlah\t\t: " + jumlahPinjam + "\n\n";
        info += "\t\t\t++ Penyewa ++ " + penyewa.info() + "\n";
        info += "\t\t\t++ Barang ++ " + barang.info() + "\n";
        info += "\t\t\t++ Pemilik ++ " + pemilik.info();
        return info;
    }
}
