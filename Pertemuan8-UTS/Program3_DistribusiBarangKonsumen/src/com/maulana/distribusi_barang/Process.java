package com.maulana.distribusi_barang;

public class Process {
    private String resi, date, receiver, address, postalCode, itemType;
    private float weight, price, total;
    private Sender sender;
    private Employee employee;

    public Process() {

    }
    public Process(String resi, String date, String receiver, String address,
                   String postalCode, String itemType, float weight, float price) {
        this.resi = resi;
        this.date = date;
        this.receiver = receiver;
        this.address = address;
        this.postalCode = postalCode;
        this.itemType = itemType;
        this.weight = weight;
        this.price = price;
        this.sender = null;
        this.employee = null;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setSender(Sender sender) {
        this.sender = sender;
    }
    public float getTotal() {
        return total = price * weight;
    }
    public void printResi() {
        System.out.println("-------------------- ++ CETAK RESI J&T Express ++ --------------------");
        System.out.println("Operator\t\t\t: " + employee.getName());
        System.out.println("Pengirim\t\t\t: " + sender.getName());
        System.out.println("No Telp Pengirim\t: " + sender.getNoTelp());
        System.out.println("-------------------- ++ DETAIL RESI ++ --------------------");
        System.out.println("Penerima\t\t\t: " + receiver);
        System.out.println("Alamat\t\t\t\t: " + address + "Kode Pos\t: " + postalCode);
        System.out.println("Tanggal\t\t\t\t: " + date);
        System.out.println("Jenis Barang\t\t: " + itemType);
        System.out.println("Berat Barang\t\t: " + weight + " kg");
        System.out.println("Harga Barang\t\t: Rp " + price);
        System.out.println("Biaya Admin\t\t\t: Rp " + 5000);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total\t\t\t\t: Rp " + (getTotal() + 5000));
        System.out.println("-------------------- ++ TERIMA KASIH ++ ------------------------------");
    }
    public void printReport() {
        System.out.println("-------------------- ++ CETAK LAPORAN J&T Express ++ --------------------");
        System.out.println("Operator\t\t\t: " + employee.getName());
        System.out.println("Pengirim\t\t\t: " + sender.getName());
        System.out.println("No Telp Pengirim\t: " + sender.getNoTelp());
        System.out.println("-------------------- ++ DETAIL RESI ++ --------------------");
        System.out.println("Penerima\t\t\t: " + receiver);
        System.out.println("Alamat\t\t\t\t: " + address + "Kode Pos\t: " + postalCode);
        System.out.println("Tanggal\t\t\t\t: " + date);
        System.out.println("Jenis Barang\t\t: " + itemType);
        System.out.println("Berat Barang\t\t: " + weight + " kg");
        System.out.println("Harga Barang\t\t: Rp " + price);
        System.out.println("Biaya Admin\t\t\t: Rp " + 5000);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total\t\t\t\t: Rp " + (getTotal() + 5000));
        System.out.println("-------------------- ++ TERIMA KASIH ++ ------------------------------");
    }
    public void info() {
        System.out.println("-------------------- ++ J&T Express ++ --------------------");
        System.out.println("Operator\t\t\t: " + employee.getName());
        System.out.println("Pengirim\t\t\t: " + sender.getName());
        System.out.println("No Telp Pengirim\t: " + sender.getNoTelp());
        System.out.println("-------------------- ++ DETAIL RESI ++ --------------------");
        System.out.println("Penerima\t\t\t: " + receiver);
        System.out.println("Alamat\t\t\t\t: " + address + "Kode Pos\t: " + postalCode);
        System.out.println("Tanggal\t\t\t\t: " + date);
        System.out.println("Jenis Barang\t\t: " + itemType);
        System.out.println("Berat Barang\t\t: " + weight + " kg");
        System.out.println("Harga Barang\t\t: Rp " + price);
        System.out.println("Biaya Admin\t\t\t: Rp " + 5000);
        System.out.println("------------------------------------------------------------");
        System.out.println("Total\t\t\t\t: Rp " + (getTotal() + 5000));
        System.out.println("-------------------- ++ TERIMA KASIH ++ ------------------------------");
    }
}
