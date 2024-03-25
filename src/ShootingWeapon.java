/**
 * Класс огнестрельного оружия со свойствами <b>model</b> и <b>weight</b>.
 * @author Сергеев Станислав
 * @version 2.1
 */
 class ShootingWeapon extends Weapon{
    /** Поле модель */
    private String model;
    /** Поле вес */
    private int weight;
    /** Конструктор - создание нового объекта
     * @see ShootingWeapon#ShootingWeapon()
     */
    public ShootingWeapon(){
        super();
        model="Без модели";
        weight=0;
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param firma - фирма
     * @param _damage - урон
     * @param govNumb - гос.номер
     * @param _model - модель
     * @param _weight - вес
     * @see ShootingWeapon#ShootingWeapon(String, int, long, String, int)
     */
    public ShootingWeapon(String firma, int _damage, long govNumb, String _model, int _weight){
        super(firma, _damage, govNumb);
        model=_model;
        weight=_weight;
    }
    /**
     * Процедура определения модель {@link ShootingWeapon#model}
     * @param _model - модель
     */
    public void setModel(String _model){
        model = _model;
    }
    /**
     * Функция получения значения поля {@link ShootingWeapon#model}
     * @return возвращает модель
     */
    public String getModel(){
        return model;
    }
    /**
     * Процедура определения вес {@link ShootingWeapon#weight}
     * @param _weight - вес
     */
    public void setWeight(int _weight){
        weight = _weight;
    }
    /**
     * Функция получения значения поля {@link ShootingWeapon#weight}
     * @return возвращает вес
     */
    public int getWeight(){
        return weight;
    }
}
