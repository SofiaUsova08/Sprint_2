package praktikum;
import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0); //Мясо 5 кг по цене 100 рублей за кг;
        Apple redApple = new Apple(10, 50.0, Colour.RED_COLOUR); // Яблоки красные 10 кг по цене 50 рублей;
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN_COLOUR); // Яблоки зелёные 8 кг по цене 60 рублей.

        Food [] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров в корзине без скидки: " + cart.totalSum());
        System.out.println("Общая сумма товаров в корзине со скидкой: " + cart.totalSumDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + cart.totalSumVegetarian());
    }
}