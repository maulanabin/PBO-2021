package com.maulana.pbo.praktikum3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Barang stuff1 = new Barang("Meja", 50000, 1);
        Barang stuff2 = new Barang("Lemari", 100000, 2);
        Barang stuff3 = new Barang("Kursi", 25000, 5);
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("\t\t\t++ Maulana Furniture ++");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.print("\n");
        System.out.println("-------------- Data Pembelian 1 --------------");
        System.out.println("Nama barang\t\t: " + stuff1.nama);
        System.out.println("Harga barang\t: Rp " + stuff1.hargaSatuan);
        System.out.println("Jumlah barang\t: " + stuff1.jumlah);
        System.out.println("Total harga\t\t: " + stuff1.hitungHargaBayar());
        System.out.println("----------------------------------------------");
        System.out.print("\n");
        System.out.println("-------------- Data Pembelian 2 --------------");
        System.out.println("Nama barang\t\t: " + stuff2.nama);
        System.out.println("Harga barang\t: Rp " + stuff2.hargaSatuan);
        System.out.println("Jumlah barang\t: " + stuff2.jumlah);
        System.out.println("Total harga\t\t: " + stuff2.hitungHargaBayar());
        System.out.println("----------------------------------------------");
        System.out.print("\n");
        System.out.println("-------------- Data Pembelian 3 --------------");
        System.out.println("Nama barang\t\t: " + stuff3.nama);
        System.out.println("Harga barang\t: Rp " + stuff3.hargaSatuan);
        System.out.println("Jumlah barang\t: " + stuff3.jumlah);
        System.out.println("Total harga\t\t: " + stuff3.hitungHargaBayar());
        System.out.println("----------------------------------------------");
    }
}
