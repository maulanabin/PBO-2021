package com.maulana.uts;

public class Barang {
    private String idBarang;
    private String namaBarang;
    private double hargaBarang;
    private double beratBarang;
    private String deskripsi;

    public Barang(String idBarang, String namaBarang, double hargaBarang, double beratBarang, String deskripsi) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.beratBarang = beratBarang;
        this.deskripsi = deskripsi;
    }
    public double getHargaBarang() {
        return this.hargaBarang;
    }
    public void dataBarang() {
        System.out.println("\t\t\t++ DATA BARANG ++");
        System.out.println("ID Barang\t\t: " + idBarang);
        System.out.println("Nama\t\t\t: " + namaBarang);
        System.out.println("Harga\t\t\t: " + hargaBarang);
        System.out.println("Berat\t\t\t: " + beratBarang + " kg");
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }
}
