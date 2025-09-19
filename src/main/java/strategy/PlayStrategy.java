package strategy;

public class PlayStrategy {
    public static void main(String[] args) {
        Character queen = new King();
        queen.setWeapon("Меч", new SwordBehavior());
        queen.setWeapon("Нож", new KnifeBehavior());
        queen.setWeapon("пистолет", new GunBehavior());
        queen.fight();
    }
}
