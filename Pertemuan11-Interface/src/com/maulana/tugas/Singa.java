package com.maulana.tugas;

public class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jumlahKaki, String suara, String warnaBulu) {
        super(nama, jumlahKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("\nJenis Karnivora");
        System.out.printf("%s makan daging \n", super.getNama());
    }
    @Override
    public void displayBinatang() {
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        System.out.println("Binatang adalah " + super.getNama());
    }
    public void displayData() {
        System.out.println("Nama Binatang\t: " + super.getNama());
        System.out.println("Jumlah Kaki\t\t: " + super.getJumlahKaki());
        System.out.println("Suara\t\t\t: " + this.suara);
        System.out.println("Warna Bulu\t\t: " + this.warnaBulu);
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
    }
}
