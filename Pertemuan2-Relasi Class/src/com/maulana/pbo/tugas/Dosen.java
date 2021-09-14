package com.maulana.pbo.tugas;

import java.util.ArrayList;

public class Dosen {
    public String nipDosen;
    public String namaDosen;
    public String alamatDosen;
    public String nomorTeleponDosen;

    public ProgamStudi prodiKampus;
    public Matakuliah matkulProdi;

    public ArrayList<Matakuliah> daftarMatkulDosen = new ArrayList<>();

    public Dosen(String nipDosen, String namaDosen, String alamatDosen, String nomorTeleponDosen) {
        this.nipDosen = nipDosen;
        this.namaDosen = namaDosen;
        this.alamatDosen = alamatDosen;
        this.nomorTeleponDosen = nomorTeleponDosen;
        prodiKampus = null;
        matkulProdi = null;
    }
    public void tambahProgamStudi(ProgamStudi prodiKampus) {
        this.prodiKampus = prodiKampus;
    }
    public void tambahMatakuliah(Matakuliah matkulProdi) {
        // Memanggil method add untuk menambahkan data matkul
        // data matkul ditambahkan pada ArrayList daftarMatkul
        this.daftarMatkulDosen.add(matkulProdi);
    }
    public void tampilInfoDosen() {
        System.out.println("========================================");
        System.out.println("\t\t++ Program Studi ++");
        System.out.println("ID\t\t\t: " + prodiKampus.idProdi);
        System.out.println("Prodi\t\t: " + prodiKampus.namaProdi);
        System.out.println("========================================");
        System.out.println("\t\t++ Data Diri ++");
        System.out.println("NIP\t\t\t: " + nipDosen);
        System.out.println("Nama\t\t: " + namaDosen);
        System.out.println("Alamat\t\t: " + alamatDosen);
        System.out.println("No Telepon\t: " + nomorTeleponDosen);
        System.out.println("========================================");
        System.out.println("\t++ Daftar Matakuliah Diajar ++");
        // Menampilkan daftar matkul yang diajar
        // menggunakan forEach
        this.daftarMatkulDosen.forEach(matakuliah -> {
            System.out.println("Kode\t\t: " + matakuliah.kodeMatkul);
            System.out.println("Matakuliah\t: " + matakuliah.namaMatkul);
            System.out.println("SKS\t\t\t: " + matakuliah.sks);
        });
        System.out.println("========================================");
    }
}
