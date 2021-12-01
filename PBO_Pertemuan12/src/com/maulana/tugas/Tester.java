package com.maulana.tugas;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier br = new Barrier(100);
        Plant pt = new Plant();

        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + br.getBarrierInfo());
        System.out.println("===========================================");
        // Destroy the enemies 4 times
        for (int i = 0; i < 4; i++) {
            pt.doDestroy(wz);
            pt.doDestroy(jz);
            pt.doDestroy(br);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + br.getBarrierInfo());
    }
}
