package com.maulana.uts;

public class DetailOrder {
    private int jumlahBarang;
    private String statusPajak;
    private Barang barang;

    public DetailOrder(int jumlahBarang, String statusPajak) {
        this.jumlahBarang = jumlahBarang;
        this.statusPajak = statusPajak;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public double totalTransaksi() {
        return (jumlahBarang * this.barang.getHargaBarang());
    }
    public void dataOrder() {
        barang.dataBarang();
        System.out.println("\t\t\t++ DETAIL ORDER ++");
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
        System.out.println("Status Pajak\t: " + statusPajak);
        System.out.println("Total\t\t\t: " + totalTransaksi());
    }
}
