package model;
import model.constants.Colour;
import model.constants.Discount;

// Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) { // Конструктор принимает три параметра: количество, цену и цвет яблок
        super(amount, price, true); //Вызываем через super родительский конструктор и прокидывем в isVegetarian true
        this.colour = colour;
    }
    // Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
    // Поэтому переопределяем метод из родительского класса
    @Override
    public int getDiscount() {
    return Colour.RED_COLOUR.equals(colour) ? Discount.WITH_DISCOUNT : Discount.WITHOUT_DISCOUNT;
    }


}


