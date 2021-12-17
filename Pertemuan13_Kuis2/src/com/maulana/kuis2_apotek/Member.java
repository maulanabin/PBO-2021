package com.maulana.kuis2_apotek;

public class Member extends Pembeli {

    private int idMember;

    public Member(String namaPembeli, String alamat, String telepon, String status, int idMember, int noAntri){
        this.setNamaPembeli(namaPembeli);
        this.setAlamat(alamat);
        this.setTelepon(telepon);
        this.setStatus(status);
        this.idMember = idMember;
        this.setNoAntri(noAntri);
    }

    public int getIdMember(){
        return idMember;
    }

    public void setIdMember(int idMember){
        this.idMember = idMember;
    }
    public void infoPembeli() {
        super.infoPembeli();
    }
}
