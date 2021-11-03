package com.maulana.tugas.overriding;

public class MainOverriding {
    public static void main(String[] args) {
        Manusia ma = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mh = new Mahasiswa();

        ma.makan();
        ma.bernafas();
        System.out.print("\n");
        ds.makan();
        ds.lembur();
        System.out.print("\n");
        mh.makan();
        mh.tidur();
    }
}
