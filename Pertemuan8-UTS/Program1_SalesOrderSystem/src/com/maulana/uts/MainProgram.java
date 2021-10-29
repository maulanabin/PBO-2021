package com.maulana.uts;

public class MainProgram {
    public static void main(String[] args) {
        Pelanggan pl1 = new Pelanggan("PO1", "Tika", "Mayangan, Probolinggo", "08256758493");
        Barang br1 = new Barang("BO1", "Lemari Pakaian",1050000, 20.5, "Lemari pakaian 3 pintu.");

        DetailOrder do1 = new DetailOrder(1, "Sudah termasuk pajak");
        do1.setBarang(br1);

        Order od1 = new Order("OD21");
        od1.setDetailOrder(do1);
        od1.setPelanggan(pl1);

        Pembayaran pmb1 = new Pembayaran();
        pmb1.setOrder(od1);
        pmb1.tampilDataOrder();

        Kredit kr1 = new Kredit("KD1", 250000, "Kredit 4x","KL-01", "Kredit Pembeli", "22 Oktober 2022");
        kr1.dataKredit();
        System.out.println("=====================================================");

        Pelanggan pl2 = new Pelanggan("PO2", "Irfansyah", "Grahadewata, Malang", "08192928891");
        Barang br2 = new Barang("BO2", "Meja Belajar",350000, 10.5, "Meja belajar anak sekolah.");

        DetailOrder do2 = new DetailOrder(2, "Sudah termasuk pajak");
        do2.setBarang(br2);

        Order od2 = new Order("OD22");
        od2.setDetailOrder(do2);
        od2.setPelanggan(pl2);

        Pembayaran pmb2 = new Pembayaran();
        pmb2.setOrder(od2);
        pmb2.tampilDataOrder();

        Cash cs2 = new Cash("CS2", 350000, "Cash (Tunai)", "CL-02");
        cs2.dataCashPelanggan();
        System.out.println("=====================================================");
//        od2.hadiahBarang();

        Pelanggan pl3 = new Pelanggan("PO3", "Nela", "Mayangan, Probolinggo", "08556656432");
        Barang br3 = new Barang("BO3", "Meja Makan",2500000, 15.5, "Meja makan cocok untuk keluarga.");

        DetailOrder do3 = new DetailOrder(1, "Sudah termasuk pajak");
        do3.setBarang(br3);

        Order od3 = new Order("OD23");
        od3.setDetailOrder(do3);
        od3.setPelanggan(pl3);

        Pembayaran pmb3 = new Pembayaran();
        pmb3.setOrder(od3);
        pmb3.tampilDataOrder();

        TransferRekening tr3 = new TransferRekening("KD3", 2500000, "Transfer Rekening","KL-03", "Bank BNI");
        tr3.dataTransferRekening();
        System.out.println("=====================================================");

        Pelanggan pl4 = new Pelanggan("PO4", "Maulana", "Dringu, Probolinggo", "08524351472");
        Barang br4 = new Barang("BO4", "Spring Bed (Kasur)",5000000, 30.5, "Spring bed yang nyaman untuk tidur.");

        DetailOrder do4 = new DetailOrder(1, "Sudah termasuk pajak");
        do4.setBarang(br4);

        Order od4 = new Order("OD24");
        od4.setDetailOrder(do4);
        od4.setPelanggan(pl4);

        Pembayaran pmb4 = new Pembayaran();
        pmb4.setOrder(od3);
        pmb4.tampilDataOrder();

        Check tr4 = new Check("KD4", 5000000, "Bukti Check","Maulana", "Bank BCA");
        tr4.dataCheck();
        System.out.println("=====================================================");
    }
}
