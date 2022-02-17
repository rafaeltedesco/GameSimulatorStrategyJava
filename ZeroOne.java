import src.entities.enemies.IEnemy;
import src.entities.enemies.Troll;
import src.entities.players.Hero;
import src.entities.players.IPlayer;
import src.entities.weapons.IWeapon;
import src.entities.weapons.MagicWeapon;
import src.entities.weapons.RandomWeapon;
import src.entities.weapons.WoodyWeapon;

import java.util.List;
import java.util.ArrayList;

public class ZeroOne {

    public static void main(String[] args) {
        IPlayer player1 = new Hero(new MagicWeapon());
        List<IWeapon> weapons = new ArrayList<IWeapon>();
        weapons.add(new MagicWeapon());
        weapons.add(new WoodyWeapon());
        
        IEnemy troll = new Troll(200);

        RandomWeapon weaponRandomGenerator = new RandomWeapon(weapons);

        int numberOfAttacks = 0;

        while (troll.isAlive()) {
            player1.changeCurrentWeapon(weaponRandomGenerator.getRandomWeapon());
    
            troll.takeDamage(player1.attack());
            numberOfAttacks++;
        }

        System.out.println("Congrats! Enemy died in " + numberOfAttacks + " attacks!");
        

    }

}
