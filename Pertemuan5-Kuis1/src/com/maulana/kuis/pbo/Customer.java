package com.maulana.kuis.pbo;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNo;

    public Customer(int customerId, String customerName, String address, String customerPhoneNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = address;
        this.customerPhoneNo =  customerPhoneNo;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
    public String getCustomerNoPhone() {
        return customerPhoneNo;
    }
    public void customerInfo() {
        System.out.println("Customer ID\t: " + customerId);
        System.out.println("Name\t\t: " + customerName);
        System.out.println("Address\t\t: " + customerAddress);
        System.out.println("Phone No\t: " + customerPhoneNo + "\n");
    }

}
