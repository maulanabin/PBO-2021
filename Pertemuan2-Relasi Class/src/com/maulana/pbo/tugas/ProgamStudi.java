package com.maulana.pbo.tugas;

public class ProgamStudi {
    public String idProdi;
    public String namaProdi;

    public Mahasiswa mhs;

    public ProgamStudi(String idProdi, String namaProdi) {
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
        mhs = null;
    }
    public void tambahMahasiswa(Mahasiswa mhs) {
        this.mhs = mhs;
    }
    public void tampilProgramStudi() {
        System.out.println("========================================");
        System.out.println("ID\t\t\t: " + idProdi);
        System.out.println("Prodi\t\t: " + namaProdi);
    }
}
