package com.maulana.percobaan2;

public class Inheritance2 {
    public static void main(String[] args) {
      StaffTetap st = new StaffTetap("Widya", "Malang", "Perempuan", 20,
              2000000, 250000, 200000, "2A", 100000);
      st.tampilStaffTetap();

      StaffHarian sh = new StaffHarian("Fera", "Malang", "Perempuan", 22,
              10000, 100000, 50000, 100);
      sh.tampilStaffHarian();
    }
}
