/**
 * Класс главного файла
 * @author Сергеев Станислав
 * @version 2.1
 */
public class Main {
    public static void main(String[] args) {
        /** Создание новых объектов классов*/
        ShootingWeapon weapon1 = new ShootingWeapon();
        ShootingWeapon weapon2 = new ShootingWeapon();
        ShootingWeapon weapon3 = new ShootingWeapon();
        ShootingWeapon weapon4 = new ShootingWeapon();
        ShootingWeapon weapon5 = new ShootingWeapon();
        SteelWeapon weapon6 = new SteelWeapon();
        SteelWeapon weapon7 = new SteelWeapon();
        SteelWeapon weapon8 = new SteelWeapon();
        WeaponShop shop = new WeaponShop();
        /** Добавление объектов в класс*/
        shop.addWeapon(weapon1);
        shop.addWeapon(weapon2);
        shop.addWeapon(weapon3);
        shop.addWeapon(weapon4);
        shop.addWeapon(weapon5);
        shop.addWeapon(weapon6);
        shop.addWeapon(weapon7);
        shop.addWeapon(weapon8);
        /** Вывод в консоль*/
        System.out.println("Количество огнестрельного оружия в оружейной палате: " + shop.countOfShootingWeapons());
        System.out.println("Количество холодного оружия в оружейной палате: " + shop.countOfSteelWeapons());
        }
}