package com.maulana.kuis;

public class Barang {
    private String kodeBarang;
    private int hargaSewa;
    private DoubleStroller doubleStroller;
    private TravelStroller travelStroller;

    Barang(){

    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    public int getHargaSewa() {
        return hargaSewa;
    }
    public void setDoubleStroller(DoubleStroller doubleStroller) {
        this.doubleStroller = doubleStroller;
    }
    public DoubleStroller getDoubleStroller() {
        return doubleStroller;
    }
    public void setTravelStroller(TravelStroller travelStroller) {
        this.travelStroller = travelStroller;
    }
    public TravelStroller getTravelStroller() {
        return travelStroller;
    }
        public String info() {
        String info = "\n";
        info += "Kode\t\t: " + kodeBarang + "\n";
        info += "Harga Sewa\t: " + hargaSewa + "\n";
        if (this.doubleStroller != null) {
            info += doubleStroller.info() + "\n";
        } else {
            info += travelStroller.info() + "\n";
        }
        return info;
    }
}
