package strategy;

import java.util.HashMap;
import java.util.Map;

public class Queen extends Character{
    @Override
    public void fight() {
//        setWeapon(weapon);
//        weapon.useWeapon();
//        for (String key : storageWeapon.keySet()) {
//            WeaponBehavior weapon = storageWeapon.get(key);
//            weapon.useWeapon();
//        }
        System.out.println("Королева наносит удар всеми видами оружия: ");
        storageWeapon.values().stream()
                .forEach(i -> i.useWeapon());
    }
}
