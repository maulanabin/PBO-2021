package com.maulana.kuis2_apotek;

public class Kasir implements IKaryawan {

    private int idKasir;
    private String namaKasir;
    private String alamat;
    private String telepon;
    private String jabatan;
    private int gaji;

    public int getIdKasir(){
        return idKasir;
    }

    public void setIdKasir(int idKasir){
        this.idKasir = idKasir;
    }

    public String getNamaKasir(){
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir){
        this.namaKasir = namaKasir;
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

    public Kasir(){

    }

    public Kasir(int idKasir, String namaKasir, String alamat, String telepon, String jabatan, int gaji){
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    @Override
    public void infoKaryawan() {
        System.out.println("===============================================");
        System.out.println("\t\tData Kasir");
        System.out.println(" ID Kasir\t\t: " + this.getIdKasir());
        System.out.println(" Nama Kasir\t\t: " + this.getNamaKasir());
        System.out.println(" Alamat\t\t\t: " + this.getAlamat());
        System.out.println(" Telepon\t\t: " + this.getTelepon());
        System.out.println(" Jabatan\t\t: " + this.getJabatan());
        System.out.println(" Gaji\t\t\t: " + this.getGaji());
    }
}
