package com.maulana.abstract_class;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang tika = new Orang("Tika");
        Orang nela = new Orang("Nela");

        tika.peliharaanHewan(kucingKampung);
        nela.peliharaanHewan(lumbaLumba);

        tika.ajakPeliharaanJalanJalan();
        nela.ajakPeliharaanJalanJalan();
    }
}
