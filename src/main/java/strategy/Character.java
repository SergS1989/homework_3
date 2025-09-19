package strategy;

import java.util.HashMap;

public abstract class Character {

    protected HashMap<String, WeaponBehavior> storageWeapon = new HashMap<>();

    public abstract void fight();

    public void setWeapon(String name, WeaponBehavior weapon) {
        storageWeapon.put(name, weapon);
    }
}
