package com.maulana.distribusi_barang;

public class Employee {
    private String name, address, noTelp;
    private String username, password;

    public Employee() {

    }
    public Employee(String name, String address, String noTelp) {
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
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void info() {
        System.out.println("\t\t++ Employee ++");
        System.out.println("Name\t\t: " + getName());
        System.out.println("No Telp\t: " + getNoTelp());
        System.out.println("Address\t: " + getAddress());
    }

}
