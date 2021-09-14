package com.maulana.pbo.tugas;
import java.util.ArrayList;

public class Mahasiswa {
    public String nimMhs;
    public String namaMhs;
    public String ttlMhs;
    public String alamatMhs;
    public String nomorTelepon;

    public ProgamStudi prodi;
    public Matakuliah matkul;

    // Menambahkan atribut untuk menampuung data matakuliah
    public ArrayList<Matakuliah> daftarMatkul = new ArrayList<>();

    public Mahasiswa(String nimMhs, String namaMhs, String ttlMhs, String alamatMhs, String nomorTelepon) {
        this.nimMhs = nimMhs;
        this.namaMhs = namaMhs;
        this.ttlMhs = ttlMhs;
        this.alamatMhs = alamatMhs;
        this.nomorTelepon = nomorTelepon;
        matkul = null;
    }
    public void tambahProgamStudi(ProgamStudi prodi) {
        this.prodi = prodi;
    }
    public void tambahMatakuliah(Matakuliah matkul) {
        // Memanggil method add untuk menambahkan data matkul
        // data matkul ditambahkan pada ArrayList daftarMatkul
        this.daftarMatkul.add(matkul);
    }
    public void tampilInfoMahasiswa() {
        System.out.println("========================================");
        System.out.println("\t\t++ Program Studi ++");
        System.out.println("ID\t\t\t: " + prodi.idProdi);
        System.out.println("Prodi\t\t: " + prodi.namaProdi);
        System.out.println("========================================");
        System.out.println("\t\t++ Data Diri ++");
        System.out.println("NIM\t\t\t: " + nimMhs);
        System.out.println("Nama\t\t: " + namaMhs);
        System.out.println("TTL\t\t\t: " + ttlMhs);
        System.out.println("Alamat\t\t: " + alamatMhs);
        System.out.println("No Telepon\t: " + nomorTelepon);
        System.out.println("========================================");
        System.out.println("\t++ Daftar Matakuliah Diampuh ++");
        // Menampilkan daftar matkul yang diambil
        // menggunakan forEach
        this.daftarMatkul.forEach(matakuliah -> {
            System.out.println("Kode\t\t: " + matakuliah.kodeMatkul);
            System.out.println("Matakuliah\t: " + matakuliah.namaMatkul);
            System.out.println("SKS\t\t\t: " + matakuliah.sks);
        });
        System.out.println("========================================");
    }
}
