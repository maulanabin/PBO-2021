package com.maulana.kuis;

public class TravelStroller {
    private String jenisBarang;
    private String travelType;

    public TravelStroller() {

    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }
    public String getTravelType() {
        return travelType;
    }
    public String info() {
        String info = "";
        info += "\n" + "Jenis\t\t: " + jenisBarang + "\n";
        info += "Type\t\t: " + travelType;
        return info;
    }
}
