package maulana.relasiclass.tugas;

public class MainProgram {
    public static void main(String[] args) {
        // Memanggil class Penulis untuk Novel
        Penulis s = new Penulis();
        s.setNama("Kathryn Littlewood");
        s.setKelahiran("01-01-1950");

        // Memanggil class Penerbit untuk Novel
        Penerbit p = new Penerbit();
        p.setNama("Noura Books Publishing (PT Mizan Publika)");
        p.setAlamat("Jagakarsa, Jakarta Selatan");

        // Memanggil class Buku untuk Novel
        Buku b = new Buku();
        b.setKategori("Novel");
        b.setHalaman(320);
        b.setTahunTerbit(2014);
        b.setPenulis(s);
        b.setPenerbit(p);

        // Memanggil class Novel
        Novel n = new Novel();
        n.setJudul("The Bliss Bakery");
        n.setGenre("Fiction");
        n.setBuku(b);
        System.out.println(n.info());

        // Memanggil class Penulis untuk Majalah
        Penulis s1 = new Penulis();
        s1.setNama("Jamil Azzaini");
        s1.setKelahiran("1968");

        // Memanggil class Penerbit untuk Majalah
        Penerbit p1 = new Penerbit();
        p1.setNama("Yatim Mandiri");
        p1.setAlamat("Surabaya, Jawa Timur");

        // Memanggil class Buku untuk Majalah
        Buku b1 = new Buku();
        b1.setKategori("Majalah");
        b1.setHalaman(37);
        b1.setTahunTerbit(2021);
        b1.setPenulis(s1);
        b1.setPenerbit(p1);

        // Memanggil class Majalah
        Majalah m = new Majalah();
        m.setJudul("Tutup Aurat, Tanda Mukmin yang Taat");
        m.setJenis("Dakwah Islam");
        m.setBuku(b1);
        System.out.println(m.info());
    }
}
