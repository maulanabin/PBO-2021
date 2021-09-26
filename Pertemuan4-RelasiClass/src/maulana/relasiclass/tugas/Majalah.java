package maulana.relasiclass.tugas;

public class Majalah {
    private String judul;
    private String jenis;
    private Buku buku;

    public Majalah() {

    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    public Buku getBuku() {
        return buku;
    }
    public String info() {
        String info = "";
        info += "Judul\t\t\t: " + judul + "\n";
        info += "Jenis\t\t\t: " + jenis + "\n";
        info += "\t\t\t ++ Info Buku ++ " + buku.info() + "\n";
        return info;
    }
}
