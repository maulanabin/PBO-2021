package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kecepatan > 100) {
            System.out.println("Kecepatan sudah mencapai batas maksimal 100!");
        } else {
            if (kontakOn == true) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak dapat bertambah karena Mesin Off! \n");
            }
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak dapat berkurang karena Mesin Off! \n");
        }
    }
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
