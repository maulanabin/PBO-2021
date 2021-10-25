package com.maulana.tugas;

public class MainProgram {
    public static void main(String[] args) {
        Mac laptopMac = new Mac("Macbook Air 2020", 3, 8,
                "Intel Core i5 10th Gen", "Lithium-Polymer", "Chip");
        System.out.println("\n================== Data Mac ===================");
        laptopMac.tampilMac();

        Windows laptopWindows = new Windows("Lenovo Legion 5i 2021", 5, 16,
                "Intel Core i7 11th Gen", "Lithium-Polymer", "Eksklusif dan Premium");
        System.out.println("\n================== Data Windows ===============");
        laptopWindows.tampilWindows();

        Pc desktop = new Pc("Acer All In One C24-1650", 4, 4,
                "Intel Core i3 11th Gen", 23);
        System.out.println("\n================== Data PC ===================");
        desktop.tampilPc();

    }
}
