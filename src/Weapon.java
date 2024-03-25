/**
 * Класс оружия со свойствами <b>firm</b>, <b>govNumber</b> и <b>damage</b>.
 * @author Сергеев Станислав
 * @version 2.1
 */
public class Weapon {
    /** Поле фирма */
    private String firm;
    /** Поле гос.номер */
    private long govNumber;
    /** Поле урон */
    private int damage;
    /**
     * Процедура определения гос.номера {@link Weapon#govNumber}
     * @param govNumb - гос.номер
     */
    public void setGovNumber(long govNumb){
        govNumber = govNumb;
    }
    /**
     * Функция получения значения поля {@link Weapon#govNumber}
     * @return возвращает гос.номер
     */
    public long getGovNumber(){
        return govNumber;
    }
    /**
     * Процедура определения фирмы {@link Weapon#firm}
     * @param firma - фирма
     */
    public void setFirm(String firma){
        firm=firma;
    }
    /**
     * Процедура определения урона {@link Weapon#damage}
     * @param _damage - урон
     */
    public void setDamage(int _damage){

        damage = _damage;
    }
    /**
     * Функция получения значения поля {@link Weapon#damage}
     * @return возвращает урон
     */
    public int getDamage(){
        return damage;
    }
    /**
     * Функция получения значения поля {@link Weapon#firm}
     * @return возвращает фирму */
    public String getFirm(){
         return firm;
    }
    /** Конструктор - создание нового объекта
     * @see Weapon#Weapon()
     * */
     public Weapon(){
        firm="Без фирмы";
        damage=0;
        govNumber=0;
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param firma - фирма
     * @param _damage - урон
     * @param govNumb - гос.номер
     * @see Weapon#Weapon(String, int, long)
     */
    public Weapon(String firma, int _damage, long govNumb){
        firm=firma;
        damage=_damage;
        govNumber = govNumb;
    }
}

