package com.maulana.latihan_polimorfisme;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill ebill = new ElectricityBill(5, "A-1");
        Employee[] e = {pEmp, iEmp};
        IPayable[] p = {pEmp, ebill};
        Employee[] e2 = {pEmp, iEmp, ebill};
    }
}
