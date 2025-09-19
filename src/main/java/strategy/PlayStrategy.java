package strategy;

public class PlayStrategy {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon("Меч", new SwordBehavior());
        king.setWeapon("Нож", new KnifeBehavior());
        king.setWeapon("пистолет", new GunBehavior());
        king.fight();
    }
}
