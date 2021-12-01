package com.maulana.tugas;

public class Plant {
    public void doDestroy(IDestroyable d) {
        if (d instanceof Zombie) {
            Zombie zombie = (Zombie) d;
            if (zombie instanceof WalkingZombie) {
                WalkingZombie walkingZombie = (WalkingZombie) zombie;
                walkingZombie.destroyed();
            } else if (zombie instanceof JumpingZombie) {
                JumpingZombie jumpingZombie = (JumpingZombie) zombie;
                jumpingZombie.destroyed();
            } else {
                System.out.println("Zombie tidak ada!");
            }
        } else if (d instanceof Barrier) {
            Barrier barrier = (Barrier) d;
            barrier.destroy();
        } else {
            System.out.println("Barrier tidak ada!");
        }
    }
}
