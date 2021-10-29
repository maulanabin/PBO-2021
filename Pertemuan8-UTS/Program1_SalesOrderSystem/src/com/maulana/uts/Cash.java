package com.maulana.uts;

public class Cash extends Pembayaran {
    private String idCash;

    public Cash(String idPembayaran, double jumlahPembayaran, String metodePembayaran, String idCash) {
        super(idPembayaran, jumlahPembayaran, metodePembayaran);
        this.idCash = idCash;
    }
    public void dataCashPelanggan() {
        super.tampilDataPembayaran();
        System.out.println("ID Cash\t\t\t\t: " + idCash);
    }
}
