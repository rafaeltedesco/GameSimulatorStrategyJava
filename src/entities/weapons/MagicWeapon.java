package src.entities.weapons;

public class MagicWeapon implements IWeapon {
    
    protected String name = "Speel Caster";

    @Override
    public double attack() {
        double attackPower = Math.random() * 10;
        System.out.println("Magic Attack! Power: " + attackPower);
        return attackPower;
    }

    public String getWeaponName() {
        return this.name;
    }
}
