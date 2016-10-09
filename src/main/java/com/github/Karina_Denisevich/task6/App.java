package com.github.Karina_Denisevich.task6;

import com.github.Karina_Denisevich.task6.ships.NuclearShip;

public class App {

    public static void main(String[] args) {
        NuclearShip nuclearShip = new NuclearShip(100);
        NuclearShip nuclearShip1 = new NuclearShip(200);

        nuclearShip.runShip();
        System.out.println('\n');
        nuclearShip1.runShip();

    }
}
