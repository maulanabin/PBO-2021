package com.maulana.pbo.tugas;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2041720132", "Maulana Bintang Irfansyah", "06 Juni 2001", "Perum Pondok Pabean Indah, Blok P-06 Kab. Probolinggo", "+6281938480203");
        ProgamStudi prodi1 = new ProgamStudi("TIF01", "Teknik Informatika");
        ProgamStudi prodi2 = new ProgamStudi("SI01", "Sistem Informasi");
        ProgamStudi prodi3 = new ProgamStudi("TI01", "Teknologi Informasi");
        ProgamStudi prodi4 = new ProgamStudi("TKP01", "Teknik Komputer");

        Dosen dsn1 = new Dosen("198009152001021001", "Bobi S.Kom, M.Kom", "Surabaya", "+6281448889999");
        Dosen dsn2 = new Dosen("198109152001021001", "Rina S.Kom, M.Kom, Ph.D", "Malang", "+6281448889999");
        Dosen dsn3 = new Dosen("198209152001021001", "Joni S.T, M.T", "Surabaya", "+6281448889999");
        Dosen dsn4 = new Dosen("198309152001021001", "Dr.Eng. Lina S.T, M.T", "Bandung", "+6281448889999");
        Dosen dsn5 = new Dosen("198409152001021001", "Dr. Farhan S.Kom, M.Kom", "Surabaya", "+6281448889999");

        Matakuliah matkul1 = new Matakuliah("PBO1A1", "Object Oriented Programming", 3);
        Matakuliah matkul2 = new Matakuliah("MCL2B2", "Machine Learning", 4);
        Matakuliah matkul3 = new Matakuliah("AIC3C3", "Artificial Intelligence", 4);
        Matakuliah matkul4 = new Matakuliah("DPO4D4", "Programming Basic", 3);
        Matakuliah matkul5 = new Matakuliah("WPO5E5", "Web Programming", 4);
        Matakuliah matkul6 = new Matakuliah("CPN6F6", "Computer Network", 4);
        Matakuliah matkul7 = new Matakuliah("CDC7G7", "Cloud Computing", 4);
        Matakuliah matkul8 = new Matakuliah("DBS8H8", "Database", 4);
        Matakuliah matkul9 = new Matakuliah("IOT9I9", "Internet of Things", 4);
        Matakuliah matkul10 = new Matakuliah("DTM1J0", "Data Mining", 4);

        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\tFakultas Ilmu Komputer");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\tINFORMASI PROGRAM STUDI");
        prodi1.tampilProgramStudi();
        prodi2.tampilProgramStudi();
        prodi3.tampilProgramStudi();
        prodi4.tampilProgramStudi();
        System.out.print("\n");
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\tINFORMASI DOSEN");
        dsn2.tambahProgamStudi(prodi1);
        dsn2.tambahMatakuliah(matkul2);
        dsn2.tambahMatakuliah(matkul4);
        dsn2.tambahMatakuliah(matkul7);
        dsn2.tambahMatakuliah(matkul9);
        dsn2.tambahMatakuliah(matkul10);
        dsn2.tampilInfoDosen();
        System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        System.out.println("\t\tINFORMASI MAHASISWA");
        mhs.tambahProgamStudi(prodi1);
        prodi1.tambahMahasiswa(mhs);
        mhs.tambahMatakuliah(matkul1);
        mhs.tambahMatakuliah(matkul3);
        mhs.tambahMatakuliah(matkul5);
        mhs.tambahMatakuliah(matkul6);
        mhs.tambahMatakuliah(matkul8);
        mhs.tampilInfoMahasiswa();
    }
}
