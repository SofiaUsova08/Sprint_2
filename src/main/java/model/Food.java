package model;
import model.constants.Discount;

public abstract class Food implements Discountable { // класс Food реализует интерфейс Discountable, чтобы наследники мошли испрользовать метод getDiscount()
    // Поля должны быть доступны только из классов-потомков. Поэтому модификатор доступа protected
    protected final int amount; //количество продукта в килограммах (целое число)
    protected final double price; //цена за единицу (вещественное число)
    protected final boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт//

    // У наследников Food (Meat и Apple) должны быть конструкторы, чтобы не дублировать, конструктор выношу сюда
    protected Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    // дефолтный getDiscount() без скидки
    @Override
    public int getDiscount() {
            return Discount.WITHOUT_DISCOUNT;
        }

    // геттер для amount
    public double getAmount(){
        return amount;
    }
    // геттер для price
    public double getPrice(){
        return price;
    }
    // геттер для isVegetarian
    public boolean isVegetarian(){
        return isVegetarian;
    }
}


