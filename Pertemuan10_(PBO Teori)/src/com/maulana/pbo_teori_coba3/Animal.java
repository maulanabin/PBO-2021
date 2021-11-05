package com.maulana.pbo_teori_coba3;

public abstract class Animal {
    private int id;
    protected String name;
    protected float weight;
    private static int counter = 0;
    
    public Animal(String name, float weight) {
        this.id = ++counter;
        this.name = name;
        this.weight = weight;
    }
    public abstract void introduce();

    // setter and getter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
