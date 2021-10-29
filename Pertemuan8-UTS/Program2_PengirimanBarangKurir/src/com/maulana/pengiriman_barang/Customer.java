package com.maulana.pengiriman_barang;

public class Customer {
    private String nomorResi;
    private String nama;
    private int hariSampai;
    private String asal;
    private String tujuan;
    private String penerima;
    private String posisi;
    private String noHp;
    private int ongkir;

    private Barang barang;
    private Dropshiper dropshiper;

    public Customer(String nomorResi, String nama, String asal, String tujuan, String noHp) {
        this.nomorResi = nomorResi;
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.noHp = noHp;
    }
    public void setNomorResi(String nomorResi) {
        this.nomorResi = nomorResi;
    }
    public String getNomorResi() {
        return nomorResi;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }
    public String getAsal() {
        return asal;
    }
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    public String getTujuan() {
        return tujuan;
    }
    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }
    public String getPenerima() {
        return penerima;
    }
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    public String getPosisi() {
        return posisi;
    }
    public void setNoHp(String nomorKtp) {
        this.noHp = noHp;
    }
    public String getNoHp() {
        return noHp;
    }
    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }
    public int getOngkir() {
        return ongkir;
    }
    public void setHariSampai(int hariSampai) {
        this.hariSampai = hariSampai;
    }
    public int getHariSampai() {
        return hariSampai;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public Barang getBarang() {
        return barang;
    }
    public void setDropshiper(Dropshiper dropshiper) {
        this.dropshiper = dropshiper;
    }
    public Dropshiper getDropshiper() {
        return dropshiper;
    }
    public String info() {
        String info = "";
        info += "Nomor Resi\t\t: " + this.nomorResi + "\n";
        info += "Pengirim\t\t: " + this.nama + "\n";
        info += "Asal\t\t\t: " + this.asal + "\n";
        info += "Penerima\t\t: " + this.penerima + "\n";
        info += "Tujuan\t\t\t: " + this.tujuan + "\n";
        info += "No HP Pengirim\t: " + this.noHp + "\n";
        return info;
    }
    public int hitungBiayaTotal() {
        return barang.getBeratBarang() * getOngkir();
    }
    public String cekPosisiBarang() {
        return getPosisi();
    }
}
