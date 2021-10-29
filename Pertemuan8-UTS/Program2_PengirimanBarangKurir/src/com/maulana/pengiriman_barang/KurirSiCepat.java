package com.maulana.pengiriman_barang;

public class KurirSiCepat extends Dropshiper {
    private int jumlahPengiriman;
    private final int tarifPengiriman = 50000;

    public KurirSiCepat() {

    }
    public KurirSiCepat(String ktp, String nama) {
        super(ktp, nama);
    }
    public void setJumlahPengiriman(int jumlahPengiriman) {
        this.jumlahPengiriman = jumlahPengiriman;
    }
    @Override
    public int getGaji() {
        int totalGaji = jumlahPengiriman * tarifPengiriman;
        return totalGaji + super.getGaji();
    }
}
