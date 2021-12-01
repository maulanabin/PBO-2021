package com.maulana.tugas;

public abstract class Zombie implements IDestroyable {
    protected int health;
    protected int level;

    public abstract void heal();

    public abstract void destroyed();

    public abstract String getZombieInfo();
}
