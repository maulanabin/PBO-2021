package interfacelatihan;

//import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

public class InterfaceMain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana SarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

    }
}
