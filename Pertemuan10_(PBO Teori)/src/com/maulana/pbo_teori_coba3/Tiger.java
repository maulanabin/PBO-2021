package com.maulana.pbo_teori_coba3;

public class Tiger extends Animal {
    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }
    @Override
    public void introduce() {
        System.out.println("I'm a tiger. My name is " + this.name + ". I weight " + this.weight + " kg and my claw is " + clawLength + ".");
    }
    @Override
    public String toString() {
        return "Tiger{" + "clawLength=" + clawLength + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }
//    public int getClawLength() {
//        return clawLength;
//    }
//    public void setClawLength(int clawLength) {
//        this.clawLength = clawLength;
//    }
}
