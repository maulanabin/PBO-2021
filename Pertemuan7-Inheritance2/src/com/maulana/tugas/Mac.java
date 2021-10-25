package com.maulana.tugas;

public class Mac extends Laptop {
    public String security;

    public Mac() {

    }
    public Mac(String merk, int kecepatanProcessor, int sizeMemory,
               String jenisProcessor,String jenisBaterai, String security) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor, jenisBaterai);
        this.security = security;
    }
    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security\t\t\t: " + security);
    }
}
