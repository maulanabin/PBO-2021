package com.maulana.pbo.percobaan3;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarnag() {
        System.out.println("Nama Barang\t\t: " + namaBrg);
        System.out.println("Jenis Barnag\t: " + jenisBrg);
        System.out.println("Stok\t\t\t: " + stok);
    }
    // method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
