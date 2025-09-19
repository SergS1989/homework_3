package strategy;

import java.util.HashMap;

public abstract class Character {
//    protected WeaponBehavior weapon;

    protected HashMap<String, WeaponBehavior> storageWeapon = new HashMap<>();

    public abstract void fight();

    public void setWeapon(String name, WeaponBehavior weapon) {
//        this.weapon = weapon;
        storageWeapon.put(name, weapon);
    }
}
