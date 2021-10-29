package com.maulana.uts;

public class Pelanggan {
    private String idPelanggan;
    private String namaPelanggan;
    private String alamatPelanggan;
    private String noTelepon;

    public Pelanggan(String idPelanggan, String namaPelanggan, String alamatPelanggan, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamatPelanggan = alamatPelanggan;
        this.noTelepon = noTelepon;
    }
    public void dataPelanggan() {
        System.out.println("\t\t\t++ DATA PELANGGAN ++");
        System.out.println("ID Pelanggan\t: " + idPelanggan);
        System.out.println("Nama\t\t\t: " + namaPelanggan);
        System.out.println("Alamat\t\t\t: " + alamatPelanggan);
        System.out.println("No Telepon\t\t: " + noTelepon);
    }
}
