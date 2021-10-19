package com.maulana.percobaan2;
// Parent Class atau Superclass
public class ClassA {
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void getNilai() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }
}
