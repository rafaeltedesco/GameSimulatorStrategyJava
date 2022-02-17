package src.entities.weapons;

public class WoodyWeapon implements IWeapon {
    
    protected String name = "Wood punch";

    @Override
    public double attack() {
        double attackPower = Math.random() * 10;
        System.out.println("Wooden Punch! Power: " + attackPower);
        return attackPower;
        
    }

    public String getWeaponName() {
        return this.name;
    }

}
