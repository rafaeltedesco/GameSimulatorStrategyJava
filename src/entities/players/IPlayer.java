package src.entities.players;

import src.entities.weapons.IWeapon;

public interface IPlayer {
    public void changeCurrentWeapon(IWeapon weapon);
    public double attack();
}
