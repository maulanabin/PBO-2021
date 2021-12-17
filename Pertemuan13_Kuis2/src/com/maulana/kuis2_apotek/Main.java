package com.maulana.kuis2_apotek;

public class Main {
    public static void main(String[] args) {
        Member mb = new Member("Maya", "Surabaya", "081933890277", "Pelanggan Member", 5, 1);
        NonMember nm = new NonMember("Reno", "Pasuruan", "081933880199", "Pelanggan Non Member", 2 );

        Obat ob1 = new Obat(10,"Procold Flu", "Meringankan gejala-gejala flu seperti demam, sakit kepala, dan hidung tersumbat.",
                "Dewasa dan anak > 12 tahun: 1 kaplet, diminum 3 kali per hari.", 5000, "30 November 2022");
        Obat ob2 = new Obat(20, "Demacolin", "Obat ini digunakan untuk meringankan gekala flu seperti demam, sakit kepala, hidung tersumbat, dan bersin-bersin.",
                            "Dewasa 1 tablet 3 kali per hari", 15000,"30 Oktober 2022");

        Kasir kasirPertama = new Kasir(1, "Dina", "Malang", "081933880477", "Admin Kasir Pertama", 1500000);
        Kasir kasirKedua = new Kasir(2, "Kiki", "Malang", "081933890566", "Admin Kasir Kedua", 1500000);

        Apoteker apotekerPertama = new Apoteker(100, "Bobby", "Malang", "081933890355", "Apoteker Utama", 7000000);
        Apoteker apotekerKedua = new Apoteker(200, "Irfan", "Malang", "082566890455", "Apoteker Asisten", 5000000);

        Transaksi tr1 = new Transaksi("30 November 2021", kasirPertama, mb, ob1, 2);
        tr1.cetakTranksaksi();
        System.out.print("\n");
        Transaksi tr2 = new Transaksi("01 Desember 2021", kasirKedua, nm, ob2, 4);
        tr2.cetakTranksaksi();

        System.out.print("\n");
        apotekerPertama.infoKaryawan();
        apotekerKedua.infoKaryawan();

    }
}
