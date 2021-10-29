package com.maulana.distribusi_barang;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Tika Yuniarti");
        emp.setAddress("Kota Probolinggo");
        emp.setNoTelp("081938450920");
        emp.setUsername("admin");
        emp.setPassword("12345");

        Sender sdr = new Sender();
        sdr.setName("Maulana");
        sdr.setAddress("Kota Probolinggo");
        sdr.setNoTelp("081938480203");

        // User with login
        Login auth1 = new Login();

        auth1.setEmployee(emp);
        auth1.setUsername("admin");
        auth1.setPassword("12345");
        auth1.authenticationLogin();
        auth1.getErrors();

        Process pro1 = new Process("JN0018266588", "10-Oktober-2021", "Nela Oktavia", "Grahadewata No 18, Malang",
                "67271", "Skincare", 2, 50000);
        pro1.setEmployee(emp);
        pro1.setSender(sdr);
        pro1.printResi();

        System.out.print("\n");
        pro1.printReport();

        System.out.print("\n");
        pro1.info();
    }
}
