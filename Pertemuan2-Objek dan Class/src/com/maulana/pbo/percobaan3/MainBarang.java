package com.maulana.pbo.percobaan3;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarnag();
        // Menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah " + brg1.tambahStok(20));

    }
}
