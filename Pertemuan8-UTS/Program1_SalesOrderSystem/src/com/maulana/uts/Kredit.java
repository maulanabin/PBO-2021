package com.maulana.uts;

public class Kredit extends Pembayaran {
    private String idKredit;
    private String tipe;
    private String tanggalExp;

    public Kredit(String idPembayaran, double jumlahPembayaran, String metodePembayaran, String idKredit, String tipe, String tanggalExp) {
        super(idPembayaran, jumlahPembayaran, metodePembayaran);
        this.idKredit = idKredit;
        this.tipe = tipe;
        this.tanggalExp = tanggalExp;
    }
    public void setIdKredit(String idKredit) {
        this.idKredit = idKredit;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void setTanggalExp(String tanggalExp) {
        this.tanggalExp = tanggalExp;
    }
    public void dataKredit() {
        super.tampilDataPembayaran();
        System.out.println("ID Kredit\t\t\t: " + idKredit);
        System.out.println("Tipe\t\t\t\t: " + tipe);
        System.out.println("Tanggal EXP\t\t\t: " + tanggalExp);

    }

}
