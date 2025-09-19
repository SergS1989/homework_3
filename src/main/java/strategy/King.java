package strategy;

import java.io.IOException;
import java.util.Scanner;

public class King extends Character{
    @Override
    public void fight() {
        Integer nameWeapon;
        System.out.println("кароль наносит удар только одим видом оружия \r\n(Выбирите оружие 1 - нож, 2 - меч, 3 - пистолет): ");
        try(Scanner sc = new Scanner(System.in)) {
            nameWeapon = sc.nextInt();
            switch (nameWeapon){
                case 1:
                    storageWeapon.get("Нож").useWeapon();
                    break;
                case 2:
                    storageWeapon.get("Меч").useWeapon();
                    break;
                case 3:
                    storageWeapon.get("пистолет").useWeapon();
            }
        }
    }
}
