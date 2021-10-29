package com.maulana.distribusi_barang;

public class Login {
    private boolean loginUser = false;
    private String username, password;
    private Employee employee;

    public Login() {

    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public boolean authenticationLogin() {
        if (username.equals(employee.getUsername()) && password.equals(employee.getPassword())) {
            loginUser = true;            
        } else {
            loginUser = false;
        }
        return loginUser;
    }
    public void info() {
        if (loginUser == true) {
            getErrors();
            employee.info();
        } else {
            getErrors();
        }
    }
    public void getErrors() {
        if (loginUser == true) {
            System.out.println("Login Berhasil, Selamat Datang");
        } else {
            System.out.println("Login Gagal, Mohon cek ulang username atau password Anda");
        }
    }
}
