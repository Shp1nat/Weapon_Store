/**
 * Класс холодного оружия со свойствами <b>name</b> и <b>length</b>.
 * @author Сергеев Станислав
 * @version 2.1
 */
public class SteelWeapon extends Weapon{
    /** Поле название */
    private String name;
    /** Поле длина */
    private int length;
    /** Конструктор - создание нового объекта
     * @see SteelWeapon#SteelWeapon()
     */
    public SteelWeapon(){
        super();
        name="Без имени";
        length=0;
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param firma - фирма
     * @param _damage - урон
     * @param govNumb - гос.номер
     * @param _name - название
     * @param _length - длина
     * @see SteelWeapon#SteelWeapon(String, int, long, String, int)
     */
    public SteelWeapon(String firma, int _damage, long govNumb, String _name, int _length){
        super(firma, _damage, govNumb);
        name=_name;
        length=_length;
    }
    /**
     * Процедура определения название {@link SteelWeapon#name}
     * @param _name - название
     */
    public void setName(String _name){
        name = _name;
    }
    /**
     * Функция получения значения название {@link SteelWeapon#name}
     * @return возвращает название
     */
    public String getName(){
        return name;
    }
    /**
     * Процедура определения длина {@link SteelWeapon#length}
     * @param _length - длина
     */
    public void setLength(int _length){
        length = _length;
    }
    /**
     * Функция получения значения поля {@link SteelWeapon#length}
     * @return возвращает длина
     */
    public int getLength(){
        return length;
    }
}
