package com.maulana.pbo.tugas;

public class Matakuliah {
    public String kodeMatkul;
    public String namaMatkul;
    public int sks;

    public Mahasiswa mhs;

    public Matakuliah(String kodeMatkul, String namaMatkul, int sks) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;

    }
    public void matkulMahasiswa(Mahasiswa mhs) {
        this.mhs = mhs;
    }
    public void tampilDataMatkul1() {
        System.out.println("========================================");
        System.out.println("Kode\t\t: " + kodeMatkul);
        System.out.println("Matakuliah\t: " + namaMatkul);
        System.out.println("SKS\t\t\t: " + sks);
    }
}
