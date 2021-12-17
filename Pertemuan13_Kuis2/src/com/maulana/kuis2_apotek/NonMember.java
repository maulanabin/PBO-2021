package com.maulana.kuis2_apotek;

public class NonMember extends Pembeli {

    private int noAntri;

    public NonMember(){

    }
    public NonMember(String namaPembeli, String alamat, String telepon, String status, int noAntri){
        this.setNamaPembeli(namaPembeli);
        this.setAlamat(alamat);
        this.setTelepon(telepon);
        this.setStatus(status);
        this.noAntri = noAntri;
    }
    public int getNoAntri(){
        return noAntri;
    }
    public void setNoAntri(int noAntri){
        this.noAntri = noAntri;
    }
    public void infoPembeli() {
        super.infoPembeli();
    }
}