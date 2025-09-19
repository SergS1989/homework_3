package strategy;

public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("Королева наносит удар всеми видами оружия: ");
        storageWeapon.values().stream()
                .forEach(i -> i.useWeapon());
    }
}
