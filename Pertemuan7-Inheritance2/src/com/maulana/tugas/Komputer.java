package com.maulana.tugas;

public class Komputer {
    public String merk;
    public int kecepatanProcessor;
    public int sizeMemory;
    public String jenisProcessor;

    public Komputer() {

    }
    public Komputer(String merk, int kecepatanProcessor, int sizeMemory, String jenisProcessor) {
        this.merk = merk;
        this.kecepatanProcessor = kecepatanProcessor;
        this.sizeMemory = sizeMemory;
        this.jenisProcessor = jenisProcessor;
    }
    public void tampilData() {
        System.out.println("Merk\t\t\t\t: " + merk);
        System.out.println("Kecepatan Processor\t: " + kecepatanProcessor);
        System.out.println("Size Memory\t\t\t: " + sizeMemory);
        System.out.println("jenis Processor\t\t: " + jenisProcessor);
    }
}
