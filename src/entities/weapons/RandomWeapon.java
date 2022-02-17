package src.entities.weapons;

import java.util.ArrayList;
import java.util.List;

public class RandomWeapon {
    
    List<IWeapon> weapons;

    public RandomWeapon(List<IWeapon> weapons) {
        this.weapons = new ArrayList<IWeapon>();
        this.weapons.addAll(weapons);
    }

    public IWeapon getRandomWeapon() {
        int idx = (int) (Math.random() * this.weapons.size());
        IWeapon weapon = this.weapons.get(idx);
        return weapon;
        
    }


}
