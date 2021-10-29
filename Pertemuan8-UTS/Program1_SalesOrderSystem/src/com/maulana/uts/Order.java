package com.maulana.uts;

public class Order {
    private String idOrder;
    private DetailOrder detailOrder;
    private Pelanggan pelanggan;

    public Order(String idOrder) {
        this.idOrder = idOrder;
    }
    public void setDetailOrder(DetailOrder detailOrder) {
        this.detailOrder = detailOrder;
    }
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public void tampilOrder() {
        System.out.println("ID Order\t\t: " + idOrder);
        detailOrder.dataOrder();
        pelanggan.dataPelanggan();
    }
//    public void hadiahBarang() {
//        if (detailOrder.totalTransaksi() >= 500000) {
//            System.out.println("Selamat Anda mendapatkan hadiah tas dan alat tulis sekolah.");
//        } else {
//            System.out.println("Tingkatkan total belanjaan Anda agar mendapatkan hadiah.");
//        }
//    }
}
