package com.maulana.pbo.praktikum2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaBayar;

    public void tampilPeminjaman() {
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\t\t++ PEMINJAMAN ++");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("ID\t\t\t: " + this.id);
        System.out.println("Nama Member\t: " + this.namaMember);
        System.out.println("Nama Game\t: " + this.namaGame);
        System.out.println("Lama Sewa\t: " + this.lamaSewa + " hari");
        System.out.println("Harga Bayar\t: " + this.hargaBayar);
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
    }
    public double hitungTotal(int lamaSewa, double hargaBayar) {
        return lamaSewa * hargaBayar;
    }
}
