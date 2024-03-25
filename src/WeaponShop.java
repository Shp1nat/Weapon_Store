import java.util.ArrayList;
/**
 * Класс оружейного магазина со свойством <b>weapons</b>.
 * @author Сергеев Станислав
 * @version 2.1
 */
public class WeaponShop {
    /** Поле оружия */
    private ArrayList<Weapon> weapons=new ArrayList<Weapon>();
    /** Конструктор - создание нового объекта
     * @see WeaponShop#WeaponShop()
     */
    public WeaponShop (){
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param wps - оружия
     * @see WeaponShop#WeaponShop(ArrayList<Weapon>)
     */
    public WeaponShop(ArrayList<Weapon> wps){
        weapons = wps;
    }
    /**
     * Процедура добавления оружия {@link WeaponShop#weapons}
     * @param wpn - оружие
     */
    public void addWeapon(Weapon wpn){
        weapons.add(wpn);
    }
    /**
     * Процедура удаления оружия {@link WeaponShop#weapons}
     * @param wpn - оружие
     */
    public void deleteAuto(Weapon wpn){
        weapons.remove(wpn);
    }
    /**
     * Функция получения количества элементов
     * @return возвращает количество
     */
    public int countOfShootingWeapons(){
        int count = 0;
        for (Weapon wpn : weapons){
            if (wpn instanceof ShootingWeapon){
                ++count;
            }
        }
        return count;
    }
    /**
     * Функция получения количества элементов
     * @return возвращает количество
     */
    public int countOfSteelWeapons(){
        int count = 0;
        for (Weapon wpn : weapons){
            if (wpn instanceof SteelWeapon){
                ++count;
            }
        }
        return count;
    }
}
