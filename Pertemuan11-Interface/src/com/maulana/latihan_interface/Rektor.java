package com.maulana.latihan_interface;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswaCumlaude) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat!, silakan perkenalkan diri Anda..");
        mahasiswaCumlaude.kuliahDiKampus();
        mahasiswaCumlaude.lulus();
        mahasiswaCumlaude.meraihIPKTinggi();
        System.out.println("==================================================");
    }
    public void beriSertifikatMawapres(IBerprestasi mahasiswaBerprestasi) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        mahasiswaBerprestasi.menjuaraiKompetisi();
        mahasiswaBerprestasi.membuatPublikasiIlmiah();
        System.out.println("==================================================");
    }
}
