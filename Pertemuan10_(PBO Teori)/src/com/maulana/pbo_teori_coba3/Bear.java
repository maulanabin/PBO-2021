package com.maulana.pbo_teori_coba3;

public class Bear extends Animal {
    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }
    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + this.name + ". I weight " + this.weight + " kg and my fur length is " + furLength + ".");
    }
    @Override
    public String toString() {
        return "Bear{" + "furLength" + furLength + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }
//    public int getFurLength() {
//        return furLength;
//    }
//    public void setFurLength(int furLength) {
//        this.furLength = furLength;
//    }
}
