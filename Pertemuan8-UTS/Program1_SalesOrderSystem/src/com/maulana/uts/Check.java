package com.maulana.uts;

public class Check extends Pembayaran {
    private String nama;
    private String idBank;

    public Check(String idPembayaran, double jumlahPembayaran, String metodePembayaran, String nama, String idBank) {
        super(idPembayaran, jumlahPembayaran, metodePembayaran);
        this.nama = nama;
        this.idBank = idBank;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public void dataCheck() {
        super.tampilDataPembayaran();
        System.out.println("Nama Check\t\t\t: " + nama);
        System.out.println("ID Bank\t\t\t\t: " + idBank);
    }
}
