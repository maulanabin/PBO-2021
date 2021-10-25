package com.maulana.tugas;

public class Windows extends Laptop {
    public String fitur;

    public Windows() {

    }
    public Windows(String merk, int kecepatanProcessor, int sizeMemory,
                   String jenisProcessor, String jenisBaterai, String fitur) {
        super(merk, kecepatanProcessor, sizeMemory, jenisProcessor, jenisBaterai);
        this.fitur = fitur;
    }
    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t\t: " + fitur);
    }
}
