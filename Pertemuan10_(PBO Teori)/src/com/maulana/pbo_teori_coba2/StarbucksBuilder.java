package com.maulana.pbo_teori_coba2;

// Abstract builder
public abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    public Starbucks getStarbucks() {
        return starbucks;
    }
    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("Starbucks drink is created");
    }
    public abstract void buildSize();

    public abstract void buildDrink();
}
