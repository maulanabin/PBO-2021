package com.maulana.pbo_teori_coba2;

public class MainProgramCustomer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeBuilder = new CoffeBuilder();

        // Alternatively you can use tea builder to build a tea
        StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setStarbucksBuilder(coffeBuilder);
        waiter.constructStarbucks();
        System.out.println("🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼 🌼");
        waiter.setStarbucksBuilder(teaBuilder);
        waiter.constructStarbucks();

        // Get the drink built
        Starbucks drink = waiter.getStarbucksDrink();
    }
}
