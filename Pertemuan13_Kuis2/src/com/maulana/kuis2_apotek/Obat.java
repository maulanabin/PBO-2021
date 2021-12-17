package com.maulana.kuis2_apotek;

public class Obat extends ResepObat {

    private int idObat;
    private String namaObat;
    private int harga;
    private String tanggalKadaluarsa;


    public int getIdObat(){
        return idObat;
    }

    public void setIdObat(int idObat){
        this.idObat = idObat;
    }

    public String getNamaObat(){
        return namaObat;
    }

    public void setNamaObat(String namaObat){
        this.namaObat = namaObat;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public Obat(){

    }

    public Obat(int idObat, String namaObat, String rincianObat, String jumlahKonsumsi, int harga, String tanggalKadaluarsa){
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.harga = harga;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.rincianObat = rincianObat;
        this.jumlahKonsumsi = jumlahKonsumsi;
    }
    public void infoObat() {
        System.out.println("===============================================");
        System.out.println(" ID Obat\t\t: " + this.getIdObat());
        System.out.println(" Nama Obat\t\t: " + this.getNamaObat());
        System.out.println(" Rincian Obat\t: "+this.getRincianObat());
        System.out.println(" Jumlah Konsumsi: "+this.getJumlahKonsumsi());
        System.out.println(" Harga\t\t\t: " + this.getHarga());
        System.out.println(" Tanggal Kadaluarsa: " + this.getTanggalKadaluarsa());
    }
    @Override
    public String getRincianObat() {
        return this.rincianObat;
    }

    @Override
    public void setRincianObat(String rincianObat) {
        this.rincianObat = rincianObat;
    }

}

