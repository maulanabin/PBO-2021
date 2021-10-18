package com.maulana.kuis;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\t😊 Puk Ami-Ami Store 😊");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");

        Pemilik pemilik = new Pemilik();
        pemilik.setIdPemilik("XY01");
        pemilik.setNama("Robinson");
        pemilik.setNoHp("081234");

        Penyewa penyewa1 = new Penyewa();
        penyewa1.setNoKtp("351319");
        penyewa1.setNama("Mina");
        penyewa1.setAlamat("Malang");

        DoubleStroller ds = new DoubleStroller();
        ds.setJenisBarang("Double Stroller Anak");
        ds.setDoubleType("2 Kids");

        Barang br1 = new Barang();
        br1.setKodeBarang("ST01");
        br1.setHargaSewa(50000);
        br1.setDoubleStroller(ds);

        Peminjaman pinjam = new Peminjaman();
        pinjam.setIdPinjam("IU01");
        pinjam.setJumlahPinjam(1);
        pinjam.setPenyewa(penyewa1);
        pinjam.setBarang(br1);
        pinjam.setPemilik(pemilik);
        System.out.println(pinjam.info());

        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");

        Penyewa penyewa2 = new Penyewa();
        penyewa2.setNoKtp("351218");
        penyewa2.setNama("Bina");
        penyewa2.setAlamat("Malang");

        TravelStroller ts = new TravelStroller();
        ts.setJenisBarang("Travel Stroller Anak");
        ts.setTravelType("Holiday Shine");

        Barang br2 = new Barang();
        br2.setKodeBarang("ST02");
        br2.setHargaSewa(50000);
        br2.setTravelStroller(ts);

        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.setIdPinjam("IU02");
        pinjam2.setJumlahPinjam(1);
        pinjam2.setPenyewa(penyewa2);
        pinjam2.setBarang(br2);
        pinjam2.setPemilik(pemilik);
        System.out.println(pinjam2.info());

        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");

    }
}