package com.maulana.kuis2_apotek;

public class Pembeli {
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String telepon;
    private String status;
    private int idMember;
    private int noAntri;

    public Pembeli(){

    }

    public Pembeli (int idPembeli, String namaPembeli, String alamat, String telepon, String status, int idMember, int noAntri){
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
        this.idMember = idMember;
        this.noAntri = noAntri;
    }

    public int getIdPembeli(){
        return idPembeli;
    }

    public void setIdPembeli(int idPembeli){
        this.idPembeli = idPembeli;
    }

    public String getNamaPembeli(){
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli){
        this.namaPembeli = namaPembeli;
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

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getIdMember(){
        return idMember;
    }

    public void setIdMember(int idMember){
        this.idMember = idMember;
    }

    public int getNoAntri(){
        return noAntri;
    }

    public void setNoAntri(int noAntri){
        this.noAntri = noAntri;
    }


    public void infoPembeli() {
        System.out.println("===============================================");
        System.out.println(" Nama Pembeli\t: " + this.getNamaPembeli());
        System.out.println(" Alamat\t\t\t: " + this.getAlamat());
        System.out.println(" Telepon\t\t: " + this.getTelepon());
        System.out.println(" Status\t\t\t: " + this.getStatus());
        System.out.println(" ID Member\t\t: " + this.getIdMember());
        System.out.println(" No Antri\t\t: " + this.getNoAntri());
    }
}

