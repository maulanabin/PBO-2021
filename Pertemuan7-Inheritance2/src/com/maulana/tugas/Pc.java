package com.maulana.tugas;

public class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc() {

    }
    public Pc(String merk, int kecepatanProcessor,
              int sizeMemory, String jenisProcessor, int ukuranMonitor) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t: " + ukuranMonitor);
    }
}
