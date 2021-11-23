package com.maulana.polimorfisme.tugas1;

public class PosisiJabatan {

    public String jenisJabatan(Pegawai pg) {
        String posisi = "";

       if (pg instanceof Manajer) {
            posisi += ((Manajer) pg).getJabatan();
        } else if (pg instanceof Programmer) {
           posisi += ((Programmer) pg).getJabatan();
        }
       return posisi;
    }
}
