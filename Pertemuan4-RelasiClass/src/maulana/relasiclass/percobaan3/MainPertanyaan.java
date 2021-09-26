package maulana.relasiclass.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Anthony Handelson");
        KeretaApi keretaApi = new KeretaApi("Chuggington", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
