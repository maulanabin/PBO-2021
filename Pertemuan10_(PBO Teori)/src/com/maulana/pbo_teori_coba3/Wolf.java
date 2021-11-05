package com.maulana.pbo_teori_coba3;

public class Wolf extends Animal {
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }
    @Override
    public void introduce() {
        System.out.println("I'm a wolf. My name is " + this.name + ". I weight " + this.weight + " kg and my fang length is " + fangLength + ".");
    }
    @Override
    public String toString() {
        return "Wolf{" + "fangLength=" + fangLength + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }
//    public int getFangLength() {
//        return fangLength;
//    }
//    public void setFangLength(int fangLength) {
//        this.fangLength = fangLength;
//    }
}
