package com.maulana.pbo1;

public class Sepeda {
    public String merk;
    public int kecepatan, gear;

    public Sepeda(String m, int k, int g) {
        merk = m;
        kecepatan = k;
        gear = g;
    }
    public int tambahKecepatan(int increment) {
        kecepatan += increment;
        return kecepatan;
    }
    public int kurangKecepatan(int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }
    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
    }

    public static void main(String[] args) {
        // sepeda pertama
        Sepeda spd1 = new Sepeda("Poligon", 10, 1);
        spd1.tambahKecepatan(10);
        spd1.info();

        Sepeda spd2 = new Sepeda("Wim Cycle", 15, 3);
        spd2.tambahKecepatan(5);
        spd2.info();
    }

}
