package maulana.relasiclass.tugas;

public class Buku {
    private String kategori;
    private int halaman;
    private int tahunTerbit;
    private Penulis penulis;
    private Penerbit penerbit;

    Buku(){

    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public String getKategori(){
        return kategori;
    }
    public void setHalaman(int halaman){
        this.halaman = halaman;
    }
    public int getHalaman(){
        return halaman;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
    public Penulis getPenulis() {
        return penulis;
    }
    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }
    public Penerbit getPenerbit() {
        return penerbit;
    }
    public String info() {
        String info = "\n";
        info += "Kategori\t\t: " + kategori + "\n";
        info += "Jumlah Halaman\t: " + halaman + "\n";
        info += "Tahun Terbit\t: " + tahunTerbit + "\n";
        info += "\t\t\t++ Penulis ++ " + penulis.info() + "\n";
        info += "\t\t\t++ Penerbit ++ " + penerbit.info() + "\n";
        return info;
    }
}