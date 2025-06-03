package model;
import model.constants.Discount;

// Класс для мяса с конструктором, который принимает два входных параметра — количество и цену.
public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price, false); //Вызываем через super родительский конструктор и прокидывем в isVegetarian false
    }
}


