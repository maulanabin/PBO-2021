package com.maulana.tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }
    @Override
    public void heal() {
        switch (super.level) {
            case 1:
                // level 1 tambah 10% health
                super.health += (super.health * 0.1);
                break;
            case 2:
                // level 2 tambah 30% health
                super.health += (super.health * 0.3);
                break;
            case 3:
                // level 3 tambah 40% health
                super.health += (super.health * 0.4);
                break;
            default:
                System.out.println("Level Anda tidak cukup!");
                break;
        }
    }
    @Override
    public void destroyed() {
        super.health -= (20 * super.health / 100);
    }
    @Override
    public String getZombieInfo() {
        String info = "";
        info += "Walking Zombie Data = \n";
        info += "Health = " + super.health + "\n";
        info += "Level = " + super.level + "\n";
        return info;
    }
}
