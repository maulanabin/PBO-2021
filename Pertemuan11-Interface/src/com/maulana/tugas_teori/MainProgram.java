package com.maulana.tugas_teori;

public class MainProgram {
    public static void main(String[] args) {
        Ayam ay = new Ayam("Ayam Cemani", 2, "Kukuruyukk", "Hitam");
        Kucing kc = new Kucing("Kucing Persia", 4, "Meow meow", "Kuning");
        KudaLaut kl = new KudaLaut("Kuda Laut Big Belly", 0, "Bloob bloob", "Cokelat");

        ay.displayBinatang();
        ay.displayBerkembangBiak();
        ay.displayData();

        kc.displayBinatang();
        kc.displayBerkembangBiak();
        kc.displayData();

        kl.displayBinatang();
        kl.displayBerkembangBiak();
        kl.displayData();
    }
}
