package maulana.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Anthony Handelson");
        Pegawai asisten = new Pegawai("5678", "Robin Vinton");
        KeretaApi keretaApi = new KeretaApi("Chuggington", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}
