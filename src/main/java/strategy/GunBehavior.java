package strategy;

public class GunBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Выстрел из пистолета");
    }
}
