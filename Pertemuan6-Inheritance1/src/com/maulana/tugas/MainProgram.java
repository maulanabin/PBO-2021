package com.maulana.tugas;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("\t\tDaftar Data Pegawai Staff dan Dosen" + "\n");
        DaftarGaji dg1 = new DaftarGaji(5);
        Pegawai p1 = new Pegawai("NIP01", "Maulana Bintang I.", "Dringu, Probolinggo", 6000000);
        Pegawai p2 = new Pegawai("NIP02", "Tika Yuniarti W.", "Wiroborang, Probolinggo", 5000000);
        Pegawai p3 = new Pegawai("NIP03", "Nela Oktavia", "Wiroborang, Probolinggo", 4500000);
        Dosen d1 = new Dosen("NIP_DOSEN_01", "Widya Yunitha, S.Kom., M.Kom.", "Jati, Probolinggo", 8500000);
        Pegawai p4 = new Pegawai("NIP04", "Ilham Rasyid", "Malang", 4500000);

        d1.setSKS(12);

        dg1.addPegawai(p1);
        dg1.addPegawai(p2);
        dg1.addPegawai(p3);
        dg1.addPegawai(d1);
        dg1.addPegawai(p4);
        dg1.printSemuaGaji();
    }
}
