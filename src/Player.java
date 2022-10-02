import weapon.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new Automaton(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= getSlotsCount() || slot < 0) {
            System.out.println("Выберите оружие");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
