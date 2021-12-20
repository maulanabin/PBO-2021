package com.maulana.praktikum_pbo_12.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggota() {
        return this.idanggota;
    }

    public void setIdAnggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota() {

    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public Anggota getById(int id) {
        Anggota anggota = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                + "WHERE idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return anggota;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));

                ListAnggota.add(anggota);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE "
                + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR telepon LIKE '%" + keyword + "%'");

        try {
            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));

                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdAnggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "'" + this.getNama() + "',"
                    + "'" + this.getAlamat() + "',"
                    + "'" + this.getTelepon() + "'"
                    + ")";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET "
                    + "nama = '" + this.getNama() + "',"
                    + "alamat = '" + this.getAlamat() + "',"
                    + "telepon = '" + this.getTelepon() + "'"
                    + "WHERE idanggota = '" + this.getIdAnggota() + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.getIdAnggota() + "'";
        DBHelper.executeQuery(SQL);
    }

    public String cariAnggota(int idAnggota) {

        String namaAnggota = "0";
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota =  '" + idAnggota + "'");

        try {
            while (rs.next()) {
                namaAnggota = rs.getString("nama");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return namaAnggota;
    }

}
