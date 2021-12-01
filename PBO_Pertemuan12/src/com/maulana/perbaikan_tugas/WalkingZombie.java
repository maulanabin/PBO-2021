package com.maulana.perbaikan_tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (0.2 * this.health);
                break;
            case 2:
                this.health += (0.3 * this.health);
                break;
            case 3:
                this.health += (0.4 * this.health);
                break;
            default:
                System.out.println("Level Andak tidak ada!");
                break;
        }
    }
    @Override
    public void destroyed() {
        this.health -= (20 * this.health / 100);
    }
    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n" + info;
    }
}
