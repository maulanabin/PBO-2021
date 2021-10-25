package com.maulana.tugas;

public class Laptop extends Komputer {
    public String jenisBaterai;

    public Laptop() {

    }
    public Laptop(String merk, int kecepatanProcessor,
                  int sizeMemory, String jenisProcessor, String jenisBaterai) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor);
        this.jenisBaterai = jenisBaterai;
    }
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai\t\t: " + jenisBaterai);
    }
}
