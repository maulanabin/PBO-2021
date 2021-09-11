package com.maulana.pbo.percobaan2;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 2041;
        mhs1.nama = "Lina";
        mhs1.alamat = "Jl. Mawar Putih No. 20";
        mhs1.kelas = "2A";
        mhs1.tampilBiodata();
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 2042;
        mhs2.nama = "Bina";
        mhs2.alamat = "Jl. Anggrek Ungu No. 30";
        mhs2.kelas = "2B";
        mhs2.tampilBiodata();
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 2043;
        mhs3.nama = "Fani";
        mhs3.alamat = "Jl. Bougenvile No. 40";
        mhs3.kelas = "2C";
        mhs3.tampilBiodata();
    }
}
