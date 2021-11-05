package com.maulana.pbo_teori_coba2;

// Director to encapsulate the builder
public class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }
    public Starbucks getStarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }
    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }
}
