package maulana.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i= 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i +1));
        }
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        int index = nomor - 1;
        if (arrayKursi[index].getPenumpang() != null) {
            System.out.println("Mohon maaf, kursi sudah terisi. Silakan memilih kursi yang lainnya.");
        } else {
            this.arrayKursi[index].setPenumpang(penumpang);
        }
    }
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    public String info() {
        String info = "";
        info += "Kode\t\t: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
