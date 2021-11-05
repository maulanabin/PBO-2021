package com.maulana.pbo_teori_coba2;

// Concrete Builder to build tea
public class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("Large");
        System.out.println("Build large size");
    }
    @Override
    public void buildDrink() {
        starbucks.setDrink("Honey Citrus Mint Tea");
        System.out.println("Build tea");
    }
}
