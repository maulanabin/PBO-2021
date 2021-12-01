package com.maulana.perbaikan_tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (0.3 * this.health);
                break;
            case 2:
                this.health += (0.4 * this.health);
                break;
            case 3:
                this.health += (0.5 * this.health);
                break;
            default:
                System.out.println("Level Anda tidak ada!");
                break;
        }
    }
    @Override
    public void destroyed() {
        this.health -= (10 * this.health / 100);
    }
    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Jumping Zombie Data = \n" + info;
    }

}
