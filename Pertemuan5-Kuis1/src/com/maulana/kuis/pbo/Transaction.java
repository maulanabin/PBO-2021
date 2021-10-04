package com.maulana.kuis.pbo;

public class Transaction {
    private String transactionDate;
    private int transactionId;
    private int quantityOfProduct;
    private Customer customer;
    private Product product;
    private Owner owner;

    public Transaction() {

    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }
    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
    public double transactionTotal() {
        return (quantityOfProduct * this.product.getPrice());
    }
    public void prizeProduct() {
        if (transactionTotal() > 200000) {
            System.out.println("Selamat Anda mendapatkan hadiah.");
        } else {
            System.out.println("Ayo, tingkatkan nominal belajaan Anda.");
        }
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return product;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public Owner getOwner() {
        return owner;
    }
    public void printReceipt() {
        System.out.print("\n");
        System.out.println("========================================");
        System.out.println("\t\t\t Nota Pembelian");
        System.out.println("========================================");
        System.out.println("\t\t\t++ CUSTOMER INFO ++");
        customer.customerInfo();
        System.out.println("\t\t\t++ PRODUCT INFO ++");
        product.productInfo();
        System.out.println("\t\t\t++ OWNER INFO ++");
        owner.ownerInfo();
        System.out.println("Tanggal Belanja\t: " + transactionDate);
        System.out.println("Transaction ID\t: " + transactionId);
        System.out.println("Banyak Barang\t: " + quantityOfProduct);
        System.out.println("Total Transaksi\t: " + "Rp " + transactionTotal());
        prizeProduct();
        System.out.println("========================================");
        System.out.println("\tTerima kasih sudah berbelanja :)");
        System.out.println("========================================");
    }
}
