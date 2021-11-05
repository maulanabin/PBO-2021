package com.maulana.pbo_teori.abstract_class;

public class Doraemon extends Robot {
    public void sayDoraemon() {
        System.out.println("Halo, nama saya Doraemon.");
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
}
