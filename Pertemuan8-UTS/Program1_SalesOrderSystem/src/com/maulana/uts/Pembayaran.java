package com.maulana.uts;

public class Pembayaran {
    private String idPembayaran;
    private double jumlahPembayaran;
    private String metodePembayaran;
    private Order order;

    public Pembayaran() {

    }
    public Pembayaran(String idPembayaran, double jumlahPembayaran, String metodePembayaran) {
        this.idPembayaran = idPembayaran;
        this.jumlahPembayaran = jumlahPembayaran;
        this.metodePembayaran = metodePembayaran;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public void tampilDataOrder() {
        order.tampilOrder();
    }
    public void tampilDataPembayaran() {
        System.out.println("\t\t\t++ DATA PEMBAYARAN ++");
        System.out.println("ID Pembayaran\t\t: " + idPembayaran);
        System.out.println("Jumlah Pembayaran\t: " + jumlahPembayaran);
        System.out.println("Metode Pembayaran\t: " + metodePembayaran);
    }
}
