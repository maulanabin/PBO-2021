package com.maulana.kuis.pbo;

public class Product {
    private int productId;
    private String productName;
    private String productType;
    private double price;

    public Product(int productId, String productName, String productType, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductName(String  productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getProductType() {
        return productType;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void productInfo() {

        System.out.println("Product ID\t: " + productId);
        System.out.println("Name\t\t: " + productName);
        System.out.println("Type\t\t: " + productType);
        System.out.println("Price\t\t: " + price + "\n");
    }

}

