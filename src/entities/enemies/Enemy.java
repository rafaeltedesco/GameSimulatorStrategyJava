package src.entities.enemies;

public abstract class Enemy implements IEnemy {
    
    protected double hp;

    public Enemy(double hp) {
        this.hp = hp;
    }

    @Override
    public void takeDamage(double damageValue) {
        this.hp = this.hp - damageValue < 0 ? 0 : this.hp - damageValue;
        System.out.println("Enemy took damage of " + damageValue);
        System.out.println("Enemy new HP: " + this.hp);
       
    }

    public boolean isAlive() {
        return this.hp == 0 ? false : true;
    }

    
}
