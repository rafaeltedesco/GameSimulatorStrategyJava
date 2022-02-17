package src.entities.players;

import src.entities.weapons.IWeapon;

public abstract class Player implements IPlayer {

    IWeapon weapon;

    public Player(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void changeCurrentWeapon(IWeapon weapon) {
        System.out.println("Player's new weapon is a " + weapon.getWeaponName());
        this.weapon = weapon;
    }

    @Override
    public double attack() {
        return this.weapon.attack();
    }
    

}
