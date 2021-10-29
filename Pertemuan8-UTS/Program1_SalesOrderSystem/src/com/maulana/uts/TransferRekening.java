package com.maulana.uts;

public class TransferRekening extends Pembayaran {
    private String idBank;
    private String namaBank;

    public TransferRekening(String idPembayaran, double jumlahPembayaran, String metodePembayaran, String idBank, String namaBank) {
        super(idPembayaran, jumlahPembayaran, metodePembayaran);
        this.idBank = idBank;
        this.namaBank = namaBank;
    }
    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }
    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    public void dataTransferRekening() {
        super.tampilDataPembayaran();
        System.out.println("ID Bank\t\t\t\t: " + idBank);
        System.out.println("Nama Bank\t\t\t: " + namaBank);
    }
}
