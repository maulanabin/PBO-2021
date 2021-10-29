package com.maulana.distribusi_barang;

public class Sender {
    private String name, address, noTelp ;

    public Sender() {

    }
    public Sender(String name, String address, String noTelp) {
        this.name = name;
        this.address = address;
        this.noTelp = noTelp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getNoTelp() {
        return noTelp;
    }
    public void info() {
        System.out.println("\t\t++ Sender ++");
        System.out.println("Name\t\t: " + getName());
        System.out.println("No Telp\t: " + getNoTelp());
        System.out.println("Address\t: " + getAddress());
    }
}
