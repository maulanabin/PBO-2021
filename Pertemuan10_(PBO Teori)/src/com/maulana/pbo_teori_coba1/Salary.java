package com.maulana.pbo_teori_coba1;

public class Salary extends Employee {

    private double salary;

    public Salary(double salary, String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double hitungGaji() {
        System.out.println("" + getClass().getName());
        return salary * 1000;
    }

}
