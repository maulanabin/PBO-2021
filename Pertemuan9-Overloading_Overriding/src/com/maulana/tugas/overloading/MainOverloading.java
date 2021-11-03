package com.maulana.tugas.overloading;

public class MainOverloading {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total sudut dengan 1 atribut\t= " + s.totalSudut(90));
        System.out.println("Total sudut dengan 2 atribut\t= " + s.totalSudut(90, 180));
        System.out.print("\n");
        System.out.println("Keliling dengan 3 sisi\t= " + s.keliling(12, 7, 4));
        System.out.println("Keliling dengan 2 sisi\t= " + s.keliling(15, 8));
    }
}
