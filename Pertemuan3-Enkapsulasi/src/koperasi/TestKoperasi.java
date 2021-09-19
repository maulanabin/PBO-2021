package koperasi;
// Maulana Bintang Irfansyah - TI 2H
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int jumlahPinjaman, angsuran;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPinjam());
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.print("Masukkan jumlah pinjaman\t: ");
        jumlahPinjaman = userInput.nextInt();
        System.out.println("Meminjam uang\t\t\t\t: Rp " + jumlahPinjaman);
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini\t: Rp " + donny.getJumlahPinjam());
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.print("Masukkan angsuran\t\t\t: ");
        angsuran = userInput.nextInt();
        System.out.println("Membayar angsuran\t\t\t: Rp " + angsuran);
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini\t: Rp " + donny.getJumlahPinjam());

        userInput.close();

        // Sintaks di bawah ini digunakan untuk tugas nomor 5.
//        System.out.println("\nMeminjam uang Rp 10.000.000");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjam());
//
//        System.out.println("\nMeminjam uang Rp 4.000.000");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjam());
//
//        System.out.println("\nMembayar angsuran Rp 100.000");
//        donny.angsur(100000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjam());
//
//        System.out.println("\nMembayaran angsuran Rp 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjam());
    }
}
