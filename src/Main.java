import weapon.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        int SIZE = 5;
        Weapon[] weapons = new Weapon[SIZE];
        weapons[0] = new Pistol();
        weapons[1] = new Automaton();
        weapons[2] = new RPG();
        weapons[3] = new Slingshot();
        weapons[4] = new WaterGun();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
                break;
            } else player.shotWithWeapon(slot - 1);
        }
    }
}