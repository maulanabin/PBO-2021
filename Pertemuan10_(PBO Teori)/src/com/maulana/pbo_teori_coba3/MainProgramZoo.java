package com.maulana.pbo_teori_coba3;

import java.util.ArrayList;
import java.util.List;

public class MainProgramZoo {
    public static void main(String[] args) {
        Bear bear = new Bear("Bibi", 200, 40);
        Tiger tiger = new Tiger("Tom", 156, 25);
        Wolf wolf = new Wolf("Wefie", 70, 40);
        Dog dog = new Dog("Didi", 50, 30);

        List<Animal> animals = new ArrayList<>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);

        for (Animal animal : animals) {
            System.out.print(animal.getId() + " : ");
            animal.introduce();
        }
    }
}
