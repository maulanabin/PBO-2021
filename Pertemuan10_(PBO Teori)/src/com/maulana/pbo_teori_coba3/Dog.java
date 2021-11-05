package com.maulana.pbo_teori_coba3;

public class Dog extends Animal {
    private int bodyLength;

    public Dog(String name, float weight, int bodyLength) {
        super(name, weight);
        this.bodyLength = bodyLength;

    }
    @Override
    public void introduce() {
        System.out.println("I'm a dog. My name is " + this.name + ". I weight " + this.weight + " kg and my body length is " + bodyLength + ".");
    }
    @Override
    public String toString() {
        return "Dog{" + "bodyLength" + bodyLength + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }
//    public int getBodyLength() {
//        return bodyLength;
//    }
//    public void setBodyLength(int bodyLength) {
//        this.bodyLength = bodyLength;
//    }
}
