package com.maulana.pbo.praktikum2;

public class Main {
    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame();
        Member member = new Member();
        Peminjaman peminjaman = new Peminjaman();

        videoGame.idGame = 1;
        videoGame.namaGame = "Harvest Moon";
        videoGame.harga = 25000;
        videoGame.tampilGame();
        System.out.print("\n");

        member.idMember = 15;
        member.namaMember = "Maulana Bintang Irfansyah";
        member.tampilMember();
        System.out.print("\n");

        peminjaman.id = 11;
        peminjaman.namaMember = member.namaMember;
        peminjaman.namaGame = videoGame.namaGame;
        peminjaman.lamaSewa = 4;
        peminjaman.hargaBayar = peminjaman.hitungTotal(peminjaman.lamaSewa, videoGame.harga);
        peminjaman.tampilPeminjaman();

    }
}
