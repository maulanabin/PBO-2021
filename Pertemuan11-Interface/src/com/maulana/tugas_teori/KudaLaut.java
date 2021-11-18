package com.maulana.tugas_teori;

public class KudaLaut extends Binatang implements IOvipar, IVivipar {
    private String suara;
    private String warnaBulu;

    public KudaLaut(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBerkembangBiak() {
        System.out.println("\nJenis Ovipar + Vivipar");
        System.out.printf("%s berkembang biak dengan cara bertelur dan melahirkan \n", super.getNama());
    }

    public void displayBinatang() {
        System.out.println("Binatang adalah " + super.getNama());
    }

    public void displayData() {
        System.out.println("Nama Binatang\t: " + super.getNama());
        System.out.println("Jumlah Kaki\t\t: " + super.getJumlahKaki());
        System.out.println("Suara\t\t\t: " + this.suara);
        System.out.println("Warna Bulu\t\t: " + this.warnaBulu);
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
    }
}

