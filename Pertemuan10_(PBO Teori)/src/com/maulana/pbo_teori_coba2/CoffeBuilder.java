package com.maulana.pbo_teori_coba2;

// Concrete Builder to build coffe
public class CoffeBuilder extends StarbucksBuilder {

    @Override
    public void buildSize() {
        starbucks.setSize("Medium");
        System.out.println("Build medium size");
    }
    @Override
    public void buildDrink() {
        starbucks.setDrink("Cappucino");
        System.out.println("Build coffe");
    }
}
