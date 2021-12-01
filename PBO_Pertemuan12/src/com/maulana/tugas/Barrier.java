package com.maulana.tugas;

public class Barrier implements IDestroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void destroy() {
        if (this.strength == 0) {
            this.destroyed();
        } else {
            System.out.println("");
        }
    }
    public String getBarrierInfo() {
        String info = "";
        info += "Barrier Strength = " + this.strength;
        return info;
    }
    @Override
    public void destroyed() {
        System.out.println("Barrier is destroyed");
    }
}
