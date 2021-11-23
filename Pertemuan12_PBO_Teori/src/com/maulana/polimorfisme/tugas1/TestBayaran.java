package com.maulana.polimorfisme.tugas1;

public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, "IT Manager", 50);
        Programmer prom = new Programmer("Budi", 600, "Software Engineer", 30);
        PosisiJabatan pj = new PosisiJabatan();
        Bayaran hr = new Bayaran();

        System.out.println("Posisi Jabatan\t\t\t\t: " + pj.jenisJabatan(man));
        System.out.println("Bayaran untuk manajer\t\t: " + hr.hitungBayaran(man));
        System.out.println("==================================================");
        System.out.println("Posisi Jabatan\t\t\t\t: " + pj.jenisJabatan(prom));
        System.out.println("Bayaran untuk programmer\t: " + hr.hitungBayaran(prom));
    }
}
