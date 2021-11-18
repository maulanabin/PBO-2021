package com.maulana.tugas;

public class MainProgram {
    public static void main(String[] args) {
        Keledai kd = new Keledai("Keledai Amiatina", 4, "Hihauw hihauw", "Abu-abu");
        Gorilla go = new Gorilla("Gorilla Timur", 4, "Haum haum", "Hitam");
        Singa si = new Singa("Singa Kongo", 4, "Roaar roaar", "Cokelat");

        kd.displayBinatang();
        kd.displayMakan();
        kd.displayData();

        go.displayBinatang();
        go.displayMakan();
        go.displayData();

        si.displayBinatang();
        si.displayMakan();
        si.displayData();

    }
}
