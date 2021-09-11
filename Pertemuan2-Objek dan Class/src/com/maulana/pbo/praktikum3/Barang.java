package com.maulana.pbo.praktikum3;

public class Barang {
    public String nama;
    public int hargaSatuan;
    public int jumlah;

    public Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    public int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }
    public int hitungHargaDiskon() {
        int totalSebelumDiskon = hitungHargaTotal();
        int diskonBarang = 0;
        if (totalSebelumDiskon > 100000) {
            diskonBarang = (int) (totalSebelumDiskon * 0.1);
        } else if ((totalSebelumDiskon > 50000) && (totalSebelumDiskon <= 100000)) {
            diskonBarang = (int) (totalSebelumDiskon * 0.05);
        } else {
            diskonBarang = (int) (totalSebelumDiskon * 0);
        }
        return diskonBarang;
    }
    public int hitungHargaBayar() {
        int totalSetelahDiskon = hitungHargaTotal();
        double diskon = hitungHargaDiskon();
        totalSetelahDiskon -= diskon;
        return totalSetelahDiskon;
    }

}
