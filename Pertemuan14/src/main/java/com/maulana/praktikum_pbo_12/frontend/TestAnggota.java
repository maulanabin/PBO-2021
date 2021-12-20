package com.maulana.praktikum_pbo_12.frontend;

import com.maulana.praktikum_pbo_12.backend.Anggota;

public class TestAnggota {

    public static void main(String[] args) {
        Anggota kat1 = new Anggota("Lina", "Malang", "081938480203");
        Anggota kat2 = new Anggota("Maulana Bintang I", "Probolinggo", "081938480203");
        Anggota kat3 = new Anggota("Tika Yuniarti W", "Probolinggo", "082257181222");
        Anggota kat4 = new Anggota("Nela Oktavia", "Probolinggo", "082257181212");
        Anggota kat5 = new Anggota("Ilham Rasyid", "Malang", "082257181245");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        kat4.save();
        kat5.save();

        // test update
        kat4.setAlamat("Politeknik Negeri Malang");
        kat4.save();

        // test delete
        kat5.delete();

        // test select all
        for (Anggota k : new Anggota().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }

        // test search
        for (Anggota k : new Anggota().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }
    }
}
