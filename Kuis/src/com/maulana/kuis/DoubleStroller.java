package com.maulana.kuis;

public class DoubleStroller {
    private String jenisBarang;
    private String doubleType;

    public DoubleStroller() {

    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setDoubleType(String doubleType) {
        this.doubleType = doubleType;
    }
    public String getDoubleType() {
        return doubleType;
    }
    public String info() {
        String info = "";
        info += "\n" + "Jenis\t\t: " + jenisBarang + "\n";
        info += "Type\t\t: " + doubleType;
        return info;
    }
}
