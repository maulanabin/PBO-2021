package com.maulana.pbo.praktikum1;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran circle = new Lingkaran();
        circle.phi = 3.14;
        circle.r = 7;
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.println("phi = 3.14 dan r = 7");
        System.out.println("Luas lingkaran adalah\t\t: " + circle.hitungLuas());
        System.out.println("Keliling lingkaran adalah\t: " + circle.hitungKeliling());
    }
}
