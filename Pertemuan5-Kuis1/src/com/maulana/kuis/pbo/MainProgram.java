package com.maulana.kuis.pbo;

public class MainProgram {
    public static void main(String[] args) {
        Customer pelanggan = new Customer(2041, "Lana", "Graha Dewata, Malang", "081444666888");
        Product barang = new Product(101, "Meja Belajar", "Furniture", 150000);
        Owner penjual = new Owner("Irfan", "Joyogrand, Malang", "081222333444");

        Transaction transaksi = new Transaction();
        transaksi.setTransactionDate("Sabtu, 02 Oktober 2021");
        transaksi.setTransactionId(4501);
        transaksi.setQuantityOfProduct(2);
        transaksi.setCustomer(pelanggan);
        transaksi.setProduct(barang);
        transaksi.setOwner(penjual);
        transaksi.printReceipt();
    }
}
