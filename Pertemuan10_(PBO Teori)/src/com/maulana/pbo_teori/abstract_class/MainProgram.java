package com.maulana.pbo_teori.abstract_class;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Program Abstract Class");
        System.out.print("\n");

        Doraemon robotDoraemon = new Doraemon();
        robotDoraemon.setNama("Doraemon");
        robotDoraemon.setPemilik("Nobita");
        robotDoraemon.setTahunPembuatan(2001);
        robotDoraemon.sayDoraemon();
        robotDoraemon.cetakInfoRobot();
    }

}
