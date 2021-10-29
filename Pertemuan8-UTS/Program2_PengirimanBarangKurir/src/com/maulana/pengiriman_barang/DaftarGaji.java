package com.maulana.pengiriman_barang;

public class DaftarGaji {
    private Dropshiper[] listDropship;
    private int j = 0;

    public DaftarGaji(int jumlahDropshiper) {
        listDropship = new Dropshiper[jumlahDropshiper];
    }
    public void addDropshiper(Dropshiper d) {
        listDropship[j] = d;
        j++;
    }
    public void printSemuaGaji() {
        for (int i = 0; i < j; i++) {
            System.out.print(listDropship[i].getNama() + " mendapatkan gaji ");
            System.out.println(listDropship[i].getGaji());

        }
    }
}
