package com.maulana.kuis2_apotek;

public class Apoteker implements IKaryawan {

    private int idApoteker;
    private String namaApoteker;
    private String alamat;
    private String telepon;
    private String jabatan;
    private int gaji;

    public int getIdApoteker() {
        return idApoteker;
    }

    public void setIdApoteker(int idApoteker){
        this.idApoteker = idApoteker;
    }

    public String getNamaApoteker(){
        return namaApoteker;
    }

    public void setNamaApoteker(String namaApoteker){
        this.namaApoteker = namaApoteker;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getTelepon(){
        return telepon;
    }

    public void setTelepon(String telepon){
        this.telepon = telepon;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public int getGaji(){
        return gaji;
    }

    public void setGaji(int gaji){
        this.gaji = gaji;
    }

    public Apoteker(){

    }
    public Apoteker(int idApoteker, String namaApoteker, String alamat, String telepon, String jabatan, int gaji){
        this.idApoteker = idApoteker;
        this.namaApoteker = namaApoteker;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    @Override
    public void infoKaryawan() {
        System.out.println("===============================================");
        System.out.println("\t\tData Apoteker");
        System.out.println(" ID Apoteker\t: " + this.getIdApoteker());
        System.out.println(" Nama Apoteker\t: " + this.getNamaApoteker());
        System.out.println(" Alamat\t\t\t: " + this.getAlamat());
        System.out.println(" Telepon\t\t: " + this.getTelepon());
        System.out.println(" Jabatan\t\t: " + this.getJabatan());
        System.out.println(" Gaji\t\t\t: " + this.getGaji());
    }
}
