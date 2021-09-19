package koperasi;
// Maulana Bintang Irfansyah - TI 2H

public class Anggota {
    public String noKtp, nama;
    public int limitPinjam, jumlahPinjam;

    public Anggota(String noKtp, String nama, int limitPinjam) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    public String getNama() {
        return this.nama;
    }
    public int getLimitPinjam() {
        return this.limitPinjam;
    }
    public int pinjam(int jumlahPinjam) {
        if (jumlahPinjam > this.limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            return this.jumlahPinjam;
        } else {
            return this.jumlahPinjam += jumlahPinjam;
        }
    }
    public int getJumlahPinjam() {
        return this.jumlahPinjam;
    }
    public int angsur(int angsuran) {
        if (angsuran < (this.jumlahPinjam * 0.1)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return this.jumlahPinjam;
        }
        return this.jumlahPinjam -= angsuran;
    }
}
