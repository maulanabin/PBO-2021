package com.maulana.pengiriman_barang;

public class Main {
    public static void main(String[] args) {
        Barang b1 = new Barang("BR01", "Skincare Emina", 2, 1);

        Dropshiper dropship = new Dropshiper();
        dropship.setKtp("305123902");
        dropship.setNama("Tika Yuniarti");

        Customer c1 = new Customer("BCA0192018920", "Nela Oktavia", "Jl. Raya Panglima Sudirman, Kota Probolinggo",
                "Perum Grahadewata, Kota Malang", "08291983234");

        KurirSiCepat krc1 = new KurirSiCepat();
        krc1.setNama("Maulana");
        krc1.setJumlahPengiriman(1);

        c1.setOngkir(10000);
        c1.setHariSampai(3);
        c1.setPenerima("Zahnia Q.");
        c1.setPosisi("Dropship K1 Pasuran");
        c1.setBarang(b1);
        c1.setDropshiper(dropship);

        // Tampilan login (diakses oleh Dropshiper)
        System.out.println("===================================================");
        System.out.println("\t\t\t\tDISTRIBUSI BARANG");
        System.out.println("===================================================");
        System.out.println("\t\tLogin Dropshiper");
        System.out.println("Username\t: " + c1.getDropshiper().getNama());
        System.out.println("KTP\t\t\t: " + c1.getDropshiper().getKtp());
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan status berhasil login atau tidak (diakses oleh Dropshiper)
        System.out.println("===================================================");
        System.out.println("\t\t\t\tSTATUS LOGIN");
        System.out.println("===================================================");
        System.out.println("Username\t: " + c1.getDropshiper().getNama());
        if (c1.getDropshiper().getNama() != null && c1.getDropshiper().getKtp() != null) {
            System.out.println("----------------- NOTIFIKASI -----------------");
            System.out.println("Login Berhasil, Selamat Datang");
        } else {
            System.out.println("----------------- NOTIFIKASI -----------------");
            System.out.println("Login Gagal! Cek kembali data Anda");
        }
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan input barang yang akan dikirim (diakses oleh Dropshiper)
        System.out.println("===================================================");
        System.out.println("\t\t\tINPUT PENGIRIMAN DAN BARANG");
        System.out.println("===================================================");
        System.out.println("\t\t\t++Input Data Pengiriman++");
        System.out.print(c1.info());
        System.out.println("===================================================");
        System.out.println("\t\t\t++Input Data Barang++");
        System.out.println("Nama Barang\t\t: " + c1.getBarang().getNamaBarang());
        System.out.println("Jumlah Barang\t: " + c1.getBarang().getJumlah());
        System.out.println("Berat Barang\t: " + c1.getBarang().getBeratBarang());
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan tarif kiriman (diakses oleh Dropshiper
        System.out.println("===================================================");
        System.out.println("\t\t\t\tTARIF PENGIRIMAN (ONGKIR)");
        System.out.println("===================================================");
        System.out.println("Asal Pengiriman\t: " + c1.getAsal());
        System.out.println("Tujuan Kirim\t: " + c1.getTujuan());
        System.out.println("Berat (Kg)\t\t: " + c1.getBarang().getBeratBarang() + " kg");
        System.out.println("Tarif Kirim\t\t: " + c1.getOngkir());
        System.out.println("Layanan\t\t\t: Reguler");
        System.out.println("Estimasi\t\t: " + c1.getHariSampai());
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan cetak stiker pengiriman yang ditempel pada barang (diakses oleh Dropship)
        System.out.println("===================================================");
        System.out.println("\t\t\t\tCETAK STIKER PENGIRIMAN");
        System.out.println("===================================================");
        System.out.println(c1.info());
        System.out.println(c1.getBarang().info());
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan cetak stiker nota resi yang diberikan ke pengirim (diakses oleh Dropshiper)
        System.out.println("===================================================");
        System.out.println("\t\t\t\tCETAK NOTA PENGIRIMAN");
        System.out.println("===================================================");
        System.out.println(c1.info());
        System.out.println("Barang\t\t\t: " + c1.getBarang().getNamaBarang());
        System.out.println("Berat Barang\t: " + c1.getBarang().getBeratBarang());
        System.out.println("Total Biaya\t\t: " + c1.hitungBiayaTotal());
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan lacak pengiriman (diakses oleh Pengirim/Pemegang no resi)
        System.out.println("===================================================");
        System.out.println("\t\t\t\tLACAK PENGIRIMAN");
        System.out.println("===================================================");
        System.out.println("Masukkan No Resi\t: " + c1.getNomorResi());
        System.out.println("\t\t\t ++TRACKING++");
        System.out.println("Posisi barang Anda di " + c1.cekPosisiBarang());
        System.out.println("===================================================");
        System.out.print("\n");

        System.out.println("===================================================");
        System.out.println("\t\t\t\tDETAIL TRANSAKSI");
        System.out.println("===================================================");
        System.out.println("Jasa Pengiriman\t: Si Cepat");
        System.out.println("Nomor Resi\t\t: " + c1.getNomorResi());
        System.out.println("Tujuan\t\t\t: " + c1.getTujuan());
        System.out.println("Status\t\t\t: BERHASIL DIKIRIM");
        System.out.println("===================================================");
        System.out.print("\n");

        // Tampilan cek gaji dropshiper dan kurir si cepat (diakses oleh dropshiper dan kurir si cepat)
        DaftarGaji daftar_gaji = new DaftarGaji(2);
        System.out.println("===================================================");
        System.out.println("\t\tGAJI DROPSHIPER DAN KURIR SI CEPAT");
        System.out.println("===================================================");
        daftar_gaji.addDropshiper(krc1);
        daftar_gaji.addDropshiper(dropship);
        daftar_gaji.printSemuaGaji();
        System.out.println("===================================================");

    }
}
